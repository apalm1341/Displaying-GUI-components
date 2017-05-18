//this program will prompt the user to choose a file and display its contents on the console!

//import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser; //Java provides this class for displaying a file dialog...from this dialog box, user can choose a file



public class GuiFileDialog {
	public static void main(String[] args) throws Exception{
		JFileChooser fileChooser = new JFileChooser(); //creates JFileChooser...initializes file chooser to user's default directory!
		if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { //displays/shows file chooser/box!
		
			//Get the selected file
			java.io.File file = fileChooser.getSelectedFile();
			
			//Create a Scanner for file
			Scanner input = new Scanner(file);
			
			/*String fileContent = "Something didn't work";
			try {
			  IOUtils.toString(new FileInputStream(fileChooser.getSelectedFile())
			}
			// At this point fileContent should be the file's content.
			System.out.println(fileContent);*/
			
			//Read text from the file
			while (input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			//close the file/scanner
			input.close(); 
		}
			//else
			else {
				System.out.println("No file selected");
			}
		}
	}

