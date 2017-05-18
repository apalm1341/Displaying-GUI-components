import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	
	//daily advice comes from this array! 
	String[] adviceList = {"Use a coding Standard", "Write Useful Comments",
			"Refactor", "Avoid Global Code",
			"Use Meaningful Names and use meaningful structures"};
	
	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4243);
			
			while(true) {
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}

}//close go
	
	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}
