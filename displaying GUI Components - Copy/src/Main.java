
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.Random; //helps with random locations of frame/window appearing after user clicks ok button once


public class Main {
	public static void main(String[] args) {
        JButton jbtCancel = new JButton("Cancel");

        JPanel panel = new JPanel();

        panel.add(jbtCancel);

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Window 1");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setVisible(true);
        JButton jbtOK = new JButton("OK");

        /*jbtOK.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent e) {
                while (true) {
                
                    JDialog d = new JDialog(frame, "Hello", true);
                    d.setLocationRelativeTo(frame);
                    d.setVisible(true);
                    
                }
            }
        });
        panel.add(jbtOK);*/
        
        jbtOK.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (true) { //it looks like it keeps going, or at least for the most part keeps making more frames and not stopping???...i think it just crashed tho cause eventually it stopped??
                    new Thread(() -> {
                        Random r = new Random();
                        JDialog d = new JDialog(frame, "Hello", true);
                        d.setLocationRelativeTo(frame);
                        d.setLocation(r.nextInt(500), r.nextInt(500));
                        d.setVisible(true);
                    }      
                    ).start();
                    i++;
                }
            }
        });
        panel.add(jbtOK);
    }

}
