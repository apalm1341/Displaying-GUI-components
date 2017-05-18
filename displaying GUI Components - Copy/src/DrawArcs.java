import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

//this program makes one circle/filled arc! fill arc method fills an arc!


public class DrawArcs extends JFrame {
	
	//add a panel
	public DrawArcs(){
		setTitle("CIRCLE!");
		add(new ArcsPanel()); //adds ArcsPanel class...something like that?
	}
	
	/** Main method */
	public static void main(String[] args) {
		DrawArcs frame = new DrawArcs();
		frame.setSize(250, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); //make frame visible on screen!
		
	}

}

//the class for drawing arcs on a panel
class ArcsPanel extends JPanel {
	//Draw 6 blades/6 arcs
	//override paintComponent
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
		int x = xCenter - radius;
		int y = yCenter - radius;
		
		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 360);
		
		
		
		
	}
}
