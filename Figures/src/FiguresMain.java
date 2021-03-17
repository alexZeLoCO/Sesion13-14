/**
 * Main program Programa to test figures in text mode
 * using the interface GeometricFigure
 * @author Programming Methodology Professors
 * @version 1.0
 *
 */

import java.util.Random; // random numbers generator

public class FiguresMain {

	
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {

		// Constants to control the number of figure to create
		final int TOTALCIRCLES = 5;
		final int TOTALCIRCLESWITHCENTRE = 5;
		final int TOTALTRIANGLES = 5;

		// create a random numbers generator
		Random gen = new Random();
		
		// array of figures
		GeometricFigure[] figures = new GeometricFigure[TOTALCIRCLES + TOTALCIRCLESWITHCENTRE + TOTALTRIANGLES];
		
		// Create the circles
		for(Integer x = 0; x < TOTALCIRCLES; x++){
			figures[x] = new Circle(gen.nextInt(50));
		}
		
		// Creathe the circles with centre
		for(Integer x = 0; x < TOTALCIRCLESWITHCENTRE; x++){
			figures[TOTALCIRCLES + x] = new CircleWithCentre(gen.nextInt(300),gen.nextInt(300),gen.nextInt(50));
		}
		
		// Create the triangles
		for(Integer x = 0; x < TOTALTRIANGLES; x++){
			figures[TOTALCIRCLES + TOTALCIRCLESWITHCENTRE + x] = new Triangle(gen.nextInt(300),gen.nextInt(300),
					gen.nextInt(300),gen.nextInt(300),
					gen.nextInt(300),gen.nextInt(300));
		}
		
		//2.4.1
		//c)
		printAll (figures);
		
		
		//2.4.2
		//a)
		System.out.printf("Total area of figures vector: %f\n\n",GeometricFigure.totalArea(figures));
		
		//ba)
		Triangle [] A = {new Triangle (0,0,10,10,10,0), new Triangle (0,10,0,0,10,0) };
		CircleWithCentre [] B = {new CircleWithCentre (0,0,10), new CircleWithCentre (20,10,2) };
		System.out.print("Higher Area: "+higherArea(A,B)+"\n\n");
		
		//bb)
		GeometricFigure figs [] = {new Circle (10), new Triangle (0,0,10,10,10,0), new CircleWithCentre (10,10,10) };
		sort(figs);
		printAll(figs);
		// Define static methods to:
		
		// Show all geometric figures in text mode
		
		// Compute the total area of the figures in the vector
		
		// Sort the figures according to the area from smallest to greatest 
		
	}
	
	/**
	 * Prints all the given figures in a vector
	 * @param figs - Figures vector
	 */
	public static void printAll (GeometricFigure  [] figs) {
		for (int i=0;i<figs.length;i++) {
			System.out.println(figs[i]);
		}
	}
	
	/**
	 * Calculates which object class has higher area
	 * @param A - Vector of Class 1
	 * @param B - Vector of Class 2
	 * @return - String Name of higher class
	 */
	public static String higherArea (GeometricFigure [] A, GeometricFigure [] B) {
		if (GeometricFigure.totalArea(A)>GeometricFigure.totalArea(B)) {
			return A[0].getClass().getSimpleName();
		} else {
			return B[0].getClass().getSimpleName();
		}
	}
	 
	/**
	 * Sorts vector by area
	 * @param figs - vector
	 */
	public static void sort (GeometricFigure [] figs) {
		GeometricFigure memory;
		for (int i=0;i<figs.length-1;i++) {
			if (figs[i].area()>figs[i+1].area()) {
				memory = figs[i];
				figs[i]=figs[i+1];
				figs[i+1]=memory;
			}
		}
	}
}
