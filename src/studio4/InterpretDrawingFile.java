package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		System.out.println("Enter shape type");
		String shapeType=in.nextLine();
		
		System.out.println("Enter red component");
		int redComponent=in.nextInt();
		
		System.out.println("Enter green component");
		int greenComponent=in.nextInt();
		
		System.out.println("Enter blue component");
		int blueComponent=in.nextInt();
		
		System.out.println("Is it filled in?");
		boolean isFilled=in.hasNextLine();
		
		System.out.println("Enter parameter 1");
		double parameterOne=in.nextDouble();
		
		System.out.println("Enter parameter 2");
		double parameterTwo=in.nextDouble();
		
		System.out.println("Enter parameter 3");
		double parameterThree=in.nextDouble();
		
		System.out.println("Enter parameter 4");
		double parameterFour=in.nextDouble();
		
		StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		StdDraw.filledPolygon(parameterOne, parameterTwo, parameterThree, parameterFour);
		StdDraw.polygon(parameterOne, parameterTwo, parameterThree, parameterFour);
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
	}
}
