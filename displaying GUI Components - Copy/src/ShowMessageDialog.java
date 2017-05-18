
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowMessageDialog {
	JButton button;
	  public static void main(String[] args){
	  ShowMessageDialog md = new ShowMessageDialog();
	  }

	  public ShowMessageDialog(){
	  JFrame frame = new JFrame("Message Dialog Box");
	  button = new JButton("Show simple message dialog box");
	  button.addActionListener(new MyAction());
	  JPanel panel = new JPanel();
	  panel.add(button);
	  button = new JButton("Show \"Ok/Cancel\" message "
	dialog box");
	  button.addActionListener(new MyAction());
	  panel.add(button);
	  button = new JButton("Show \"Yes/No/Cancel\" dialog box");
	  button.addActionListener(new MyAction());
	  panel.add(button);
	  frame.add(panel);
	  frame.setSize(400, 400);
	  frame.setVisible(true);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }

	  public class MyAction implements ActionListener{
	  public void actionPerformed(ActionEvent ae){
	  String str = ae.getActionCommand();
	  if(str.equals("Show simple message dialog box")){
	  JOptionPane.showMessageDialog(null, "This is the simple message 
	dialog box.", "Roseindia.net", 1);
	  }
	  else if(str.equals("Show \"Ok/Cancel\" message dialog box")){
	  if(JOptionPane.showConfirmDialog(null, "This is the \"Ok/Cancel\" 
	message dialog box.", "Roseindia.net", JOptionPane.OK_CANCEL_OPTION) == 0)
	  JOptionPane.showMessageDialog(null, "You clicked on \"Ok\" button",
	 "Roseindia.net", 1);
	  else
	  JOptionPane.showMessageDialog(null, "You clicked on \"Cancel\" button",
	 "Roseindia.net", 1);
	  }  
	  else if(str.equals("Show \"Yes/No/Cancel\" dialog box")){
	  JOptionPane.showConfirmDialog(null, "This is the \"Yes/No/Cancel\"
	 message dialog box.");
	  }
	  }
	  }

}
