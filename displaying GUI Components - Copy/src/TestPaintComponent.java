import javax.swing.*;
import java.awt.Graphics;

//this program creates a right triangle with one of the sides being the frame/window and the two other sides being lines that I drew using
//draw methods

//this program draws a right triangle from lines and draws a string on a panel!

//panels are invisible and are used as small containers that group components to achieve a desired layout! (JPanel)...
//another important use for JPanel is for drawing...you can draw things on any Swing GUI component, but normally
//you should use a JPanel as a canvas upon which to draw things!

public class TestPaintComponent extends JFrame {
	public TestPaintComponent() {
		//create a panel
		add(new NewPanel());
	}
	
	public static void main(String[] args) {
		TestPaintComponent frame = new TestPaintComponent();
		frame.setTitle("Right Triangle!");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //makes window/frame visible on screen!
	}
}
	
class NewPanel extends JPanel {	//new panel class...i think this means JPanel class within/subclassed NewPanel
	protected void paintComponent(Graphics g) { //override paintComponent
		super.paintComponent(g); //draw things in the superclass
		g.drawLine(50,  50,  450,  450);
		g.drawLine(50, 450, 450, 450);
		g.drawLine(50, 50, 50, 450);
		g.drawLine(50,  50,  450,  50);
		g.drawLine(450,  50,  450,  450);
		g.drawString("Right Triangle!", 100, 240);
	}
}
	

