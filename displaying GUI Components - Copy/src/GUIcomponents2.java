
//this program creates GUI objects using different classes...then using the JPanel class (34), it then creates a panel object and adds it to
//the button, label, text field, check box, radio button, and combo box (35-43). The program then creates a frame/window and adds the panel to 
//the frame (45). The frame/window is displayed in line 51!

import javax.swing.*;

public class GUIcomponents2 {
	
	public static void main(String[] args) {
		// Create a button with text OK
		JButton jbtOK = new JButton("OK");
		
		//Create a button with text Cancel
		JButton jbtCancel = new JButton("Cancel");
		
		//Create a label with text "Enter your name: "...label is just this text!
		JLabel jlblName = new JLabel("Enter your name: ");
		
		//Create a text field with text "Type Name Here"...text field is box!
		JTextField jtfName = new JTextField("Type Name Here");
		
		//Create a check box with text bold
		JCheckBox jchkBold = new JCheckBox("Bold");
		
		//Create a check box with text italic
		JCheckBox jchkItalic = new JCheckBox("Italic");
		
		//Create a radio button with text red...radio buttons are just circular round little buttons which u can click to make them fill black gap/circle!
		JRadioButton jrbRed = new JRadioButton("Red");
		
		//Create a combo box with several choices...combo box is kinda like text field which is box but also has dropdown options list with several choices!
		JComboBox jcboColor = new JComboBox(new String[]{"Male", "Female", "Not Sure", "Rather not say/mention"});
		
		//Create a panel to group previous components... add all them to panel!
		JPanel panel = new JPanel();
		panel.add(jbtOK); //Add the OK button to panel
		panel.add(jbtCancel); //Add Cancel button to panel
		panel.add(jlblName); //Add label to panel
		panel.add(jtfName); //Add text field to panel
		panel.add(jchkBold); //Add the check box to panel
		panel.add(jchkItalic); //Add check box to panel
		panel.add(jrbRed); //Add radio button to panel
		panel.add(jcboColor); //Add combo box to panel
		
		JFrame frame = new JFrame(); //Create a frame
		frame.add(panel); //Add panel to frame
		frame.setTitle("Show GUI Components");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //frame is made visible/is displayed!
		
	}

}
