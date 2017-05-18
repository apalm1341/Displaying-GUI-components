
//this program creates a window using the JFrame class! and creates GUI objects using different classes! This program will create repeatedly
//forever in a loop dialog boxes!

//import javax.swing.JFrame;
import java.awt.Component;

import javax.swing.*;
import javax.swing.JOptionPane;

//imports for event classes below

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//import java.lang.Object;

//if ok is clicked on window, then create a bunch of dialog boxes forever in loop!

public class testing {
	//methods here = setTitle, setSize, setLocation, setDefaultCloseOperation, and setVisible that all set the properties of the objects!
	
	public static void main(String[] args) {
		
		/*Object panel;
		int result = JOptionPane(null, panel,
	            "Enter Information", JOptionPane.OK_CANCEL_OPTION);
		while(result == JOptionPane.OK_OPTION){
			int result2 = JOptionPane.showConfirmDialog(null, panel,
		            "Enter Information", JOptionPane.OK_CANCEL_OPTION);
		}*/
		
		//while(jbtOK == )
		
		/*jbtOK.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent event){
	                    //what do we want to happen when we
	                    //click the button
	                }
	            ;*/
		
		//create button with text YO!
				JButton jbtOK = new JButton("OK");
				
				//yeah but I said the only thing. 
				//while(public void actionPerformed(ActionEvent e) == true) this is just weird. the left part of your comparison is a method signature, not a boolean expression.
				
				JFrame frame = new JFrame();  //declaring frame! create an object of the JFrame class...invoke/give rise to/call JFrame method!
				
				jbtOK.addActionListener(new ActionListener()  { // add the listener to the jbutton to handle the "pressed" event
				    public void actionPerformed(ActionEvent e) {
				    	Thread queryThread = new Thread(); {
				    	      while(true) {
				    	    	  JOptionPane.showMessageDialog(frame, "SURPRISE! TRY TO GET OUT NOW!!!", "Surprise Error!", JOptionPane.ERROR_MESSAGE); //custom title, error icon
				    	      }
				    	    };
				    	    queryThread.start();
				    	  }
				    	});
				
				/*// add the listener to the jbutton to handle the "pressed" event
				jbtOK.addActionListener(new ActionListener()
				{
				  while(public void actionPerformed(ActionEvent e) == true)
				  {
					// make message dialog boxes forever when the button is pressed
					  //JOptionPane.showMessageDialog(null, "SURPRISE!");-->isn't working right now
					  JDialog d = new JDialog(frame, "Hello", true);
					  d.setLocationRelativeTo(frame);
					  d.setVisible(true);
					  
				  }
				});*/
				
				//while (((Object) jbtOK).isPressed()){
					//JOptionPane.showMessageDialog(null, "SURPRISE!");
				//}
				
				/*while(jbtOK == ){
					
				}*/
				
				//create button with text Cancel
				JButton jbtCancel = new JButton("Cancel");
				
						
		
		//create a panel to group components
        JPanel panel = new JPanel();
        //Component jbtYO;
		panel.add(jbtOK);
        //Component jbtCancel;
		panel.add(jbtCancel);
		
		
        
	         
		//JFrame frame = new JFrame();  //create an object of the JFrame class...invoke/give rise to/call JFrame method!
		frame.add(panel); //Add the panel to the frame!
		//frame.add();
		frame.setTitle("Window 1"); //note that you have to expand little window into bigger window by clicking maximize and then title will appear!
		frame.setSize(200, 150);
		frame.setLocation(200, 100);
		frame.setVisible(true); //this line allows the window to actually show up!
		//frame.addWindowListener(null);
		//frame.showConfirmDialog(null, panel,
	            //"Enter Information", JOptionPane.OK_CANCEL_OPTION);
	         
		
		
		/*int result = JOptionPane.showConfirmDialog(null, panel,
	            "Enter Information", JOptionPane.OK_CANCEL_OPTION); //both 31 and 32 lines of code make confirmation dialog box I believe after making window with just cancel button!

	      
	         while(result == JOptionPane.OK_OPTION) {
	        	 JFrame frame = new JFrame();  //create an object of the JFrame class...invoke/give rise to/call JFrame method!
	     		frame.add(panel); //Add the panel to the frame!
	     		frame.setTitle("Window 1"); //note that you have to expand little window into bigger window by clicking maximize and then title will appear!
	     		frame.setSize(200, 150);
	     		frame.setLocation(200, 100);
	     		frame.setVisible(true); //this line allows the window to actually show up!
	         }*/
	     
		
		
		
		
				
		
		
		
		
	}

	private static int JOptionPane(Object object, Object panel, String string, int okCancelOption) {
		// TODO Auto-generated method stub
		return 0;
	}

}
