import java.io.*;
import java.net.*;

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
}