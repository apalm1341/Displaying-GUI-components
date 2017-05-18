
import java.awt.*;
import javax.swing.*;
//import javax.swing.JPanel;

//this program draws and/or fills the shapes: two lines, two rectangles, and an oval!


public class FigurePanelobjects extends JFrame {
	public FigurePanelobjects() {
		
		setLayout(new GridLayout(2, 3, 5, 5));
		add(new FigurePanel(FigurePanel.LINE)); //creates an instance of a class called FigurePanel...creates/draws two lines crossed over each other
		add(new FigurePanel(FigurePanel.RECTANGLE)); //creates a blue lined rectangle with no filling
		add(new FigurePanel(FigurePanel.RECTANGLE, true)); //creates a rectangle with blue filling!
		add(new FigurePanel(FigurePanel.OVAL, true)); //creates oval with black filling!
		
	}
	
	public static void main(String[] args) { //void means return nothing!
		FigurePanelobjects frame = new FigurePanelobjects();
		frame.setSize(400, 200);
		frame.setTitle("TestFigurePanel");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //makes window/frame visible on screen!
		
	}
	

}
