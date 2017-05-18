//this program is a server program that offers up practical, inspirational tips to get
//you through those long days of coding!
//this is a client for advice guy program, which pulls a message from server each time it connects!!!

//this program makes a Socket, makes a BufferedReader (with the help of other streams) and reads
//a single line from server application(whatever is running at port 4242)

import java.io.*;
import java.net.*; //class Socket is in java.net...The java.net package provides two classes--Socket and ServerSocket--that implement 
//the client side of the connection and the server side of the connection, respectively.

public class DailyAdviceClient {
	public void go() {
		try {
			Socket s = new Socket("127.0.0.1", 4243);
			
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			
			String advice = reader.readLine();
			System.out.println("Today you should: " + advice);
			String response = "HTTP/1.1 200 OK\r\n\r\nToday you should: " + advice;
			
			reader.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		
	}
}

	public static void main(String[] args) {
		DailyAdviceClient client = new DailyAdviceClient();
		client.go();
	}
}















/*import java.io.BufferedReader;
import java.io.InputStreamReader; //this for inputstreamreader
import java.io.PrintWriter;
import java.net.Socket; //this for socket class which is in java.net!

public class DailyAdviceClient {
	
	public static void main(String[] args) {
	
	// Make a Socket connection to the server 
	//The (TCP port number) port number is 5000 for our chat server
	//other number is IP address for "localhost"/server..in other words, the one this code is running on
	//I can use this when I am testing my client and server on a single, stand-alone machine!
		//127.0.0.1 = localhost it looks like if U type localhost and/or that number into my computer browser!!!
	Socket chatSocket = new Socket("127.0.0.1", 5000);
	
	//Make an InputStreamReader chained to the Socket's low level (connection) input stream
	//here, we ask the socket for an input stream!
	InputStreamReader stream = new InputStreamReader(chatSocket.getInputStream());
	
	//Make a BufferedReader and read!
	BufferedReader reader = new BufferedReader(stream);
	String message = reader.readLine();
	
	//All this code above makes it so that data on server/source goes to bytes from server Socket's input stream are converted to characters (InputStreamReader) which is then to buffered characters (BufferedReader) 
	//which then gets to destination/client!...makes it so that we can read data from a Socket by using BufferedReader!
	
	//Now, to write data to a Socket, use a PrintWriter!!!
	//PrintWriter is standard choice when you r writing one String at a time!
	//two key methods in PrintWriter = print() and println()...just like System.out!!!
	
	//Make a Socket connection to the server!
	//this part is same as it was on the opposite page--to write to server, we still have to connect to it!!!
	Socket chatSocket = new Socket("127.0.0.1", 5000);
	
	//Make a PrintWriter chained to the Socket's low-level (connection) output stream!!!
	
	PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
	
	//Write (print) something!!!
	
	writer.println("message to send"); //println() adds a new line at the end of what it sends
	writer.print("another message"); //print() doesn't add the new line!
	
	//above code dealing with writing data to a Socket using PrintWriter deals with chaining a PrintWriter
	//to the Socket's output stream, so that we can write Strings to the Socket connection!
	//above code dealing with all this takes source from client and sends to server (destination)
	//by sending characters which are then converted to bytes which are then sent to server
	
	
	
	
	

	}
}*/





