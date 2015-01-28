import java.io.*;
import java.net.*;

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
}