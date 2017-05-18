
import java.awt.*;
import javax.swing.*;


public class TestMessagePanel extends JFrame{
	public TestMessagePanel() {
		MessagePanel messagePanel1 = new MessagePanel("1st Message Panel");
		MessagePanel messagePanel2 = new MessagePanel("2nd Message Panel");
		MessagePanel messagePanel3 = new MessagePanel("3rd Message Panel");
		MessagePanel messagePanel4 = new MessagePanel("4th Message Panel");
		messagePanel1.setFont(new Font("SansSerif", Font.ITALIC, 20));
		messagePanel2.setFont(new Font("Courier", Font.BOLD, 20));
		messagePanel3.setFont(new Font("Times", Font.ITALIC, 20));
		messagePanel4.setFont(new Font("California FB", Font.PLAIN, 20));
		messagePanel1.setBackground((Color.RED));
		messagePanel2.setBackground((Color.CYAN));
		messagePanel3.setBackground((Color.GREEN));
		messagePanel4.setBackground((Color.WHITE));
		messagePanel1.setCentered(true); 
		
		setLayout(new GridLayout(2, 2));
		add(messagePanel1);
		add(messagePanel2);
		add(messagePanel3);
		add(messagePanel4);
		
	}
	
	public static void main(String[] args) {
		TestMessagePanel frame = new TestMessagePanel();
		frame.setSize(300, 200);
		frame.setTitle("Frame/Window containing 4 message panels");
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //Display/make appear the window/frame on screen!
	}

}
