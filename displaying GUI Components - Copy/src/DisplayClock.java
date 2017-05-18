//package chapter15;

//I eventually might want to fill my oval/clock/circle with color!
 
 import java.awt.*;
 import javax.swing.*;
 
 public class DisplayClock extends JFrame {
   public DisplayClock() {
     // Create an analog clock for the current time
     StillClock clock = new StillClock();
 
     // Display hour, minute, and seconds in the message panel
     MessagePanel messagePanel = new MessagePanel(clock.getHour() +
       ":" + clock.getMinute() + ":" + clock.getSecond());
     messagePanel.setCentered(true);
     messagePanel.setForeground(Color.red); //changes color of hours:minutes:seconds I believe!
     messagePanel.setFont(new Font("Courie", Font.BOLD, 25)); //25 is size of hours:minutes:seconds font/text...
 
    // Add the clock and message panel to the frame
     add(clock);
     add(messagePanel, BorderLayout.SOUTH);
   }
 
   public static void main(String[] args) {
     DisplayClock frame = new DisplayClock();
     frame.setTitle("My Analog Clock JAVA PROGRAM!");
     frame.setLocationRelativeTo(null); // Center the frame
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(300, 350);
     frame.setVisible(true);
   }
 }