import java.io.*;
import java.net.*;


class Main{
public static void main(String args[]){
if(args[0].equals("server")){
new Thread(new EchoServer()).start();
}else{
new Thread(new EchoClient()).start();
} //end ifelse
}//end main
}//end main class


class EchoServer implements Runnable{
    public void run(){

        ServerSocket serverSocket = null;
	Socket clientSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            serverSocket = new ServerSocket(4444);
            clientSocket = serverSocket.accept(); 		
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                                        clientSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println(e.toString());
            System.exit(1);
        } catch (IOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }

	try{
	BufferedReader stdIn = new BufferedReader(
                                   new InputStreamReader(System.in));
	String userInput;

	while (!(userInput = stdIn.readLine()).equals("end")) {
	    out.println(userInput);
	    System.out.println("echo: " + in.readLine());
	}

	
	out.close();
	in.close();
	stdIn.close();
	clientSocket.close();
	serverSocket.close();
	}catch(Exception e){
		System.out.println(e.toString());
	}//end try-catch
    }
}//end server


class EchoClient implements Runnable {
    public void run(){

        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket("http://localhost:", 7);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
                                        echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: taranis.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for "
                               + "the connection to: taranis.");
            System.exit(1);
        }


	 try{
	BufferedReader stdIn = new BufferedReader(
                                   new InputStreamReader(System.in));
	String userInput;

	while (!(userInput = stdIn.readLine()).equals("end")) {
	    out.println(userInput);
	    System.out.println("echo: " + in.readLine());
	}

       
	out.close();
	in.close();
	stdIn.close();
	echoSocket.close();
	}catch(Exception e){
		System.out.println(e.toString());
	}//end try-catch
    }
}//end client