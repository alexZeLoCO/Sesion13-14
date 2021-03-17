import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends GeometricFigure implements GraphicFigure{
	
	private Point A, B, C;
	private String label = "";
	
	public Triangle (String label, int x1, int y1, int x2, int y2, int x3, int y3) {
		this.A = new Point (x1,y1);
		this.B = new Point (x2,y2);
		this.C = new Point (x3,y3);
		setLabel (label);
	}
	
	public Triangle (int x1, int y1, int x2, int y2, int x3, int y3) {
		this.A = new Point (x1,y1);
		this.B = new Point (x2,y2);
		this.C = new Point (x3,y3);
	}
	
	public Point getA () {
		return this.A;
	}
	
	public Point getB () {
		return this.B;
	}
	
	public Point getC () {
		return this.C;
	}
	
	public void setA (Point A) {
		this.A.setX(A.getX());
		this.A.setY(A.getY());
	}
	
	public void setB (Point A) {
		this.B.setX(A.getX());
		this.B.setY(A.getY());
	}
	
	public void setC (Point A) {
		this.C.setX(A.getX());
		this.C.setY(A.getY());
	}
	
	public void setLabel (String label) {
		this.label=label;
	}
	
	public String getLabel () {
		return this.label;
	}
	
	public double perimeter () {
		return Point.distance(getA(),getB())+Point.distance(getB(), getC())+Point.distance(getC(), getA());
	}
	
	public double area () {
		return Math.sqrt(perimeter()/2	*	(perimeter()/2-(Point.distance(getA(), getB())))*
											(perimeter()/2-(Point.distance(getB(), getC())))*
											(perimeter()/2-(Point.distance(getC(), getA())))		);	
	}
	
	public void paint (Graphics g) {
		// creamos un array con las Xs y otro con las Ys
		int [] xs = {A.getX(), B.getX(), C.getX()};
		int [] ys = {A.getY(), B.getY(), C.getY()};
		// creamos un objeto polígono con esos 3 puntos
		Polygon p = new Polygon(xs, ys, 3);
		// dibujamos el polígono
		g.drawPolygon(p);
		// dibujamos la etiqueta
		int x = (int)((A.getX() + B.getX() + C.getX())/3);
		int y = (int)((A.getY() + B.getY() + C.getY())/3);
		g.drawString(this.getLabel(), x - 3, y + 4);

	}
	
	@Override
	public String toString () {
		return String.format("Triangle:\t%s\n\tCoordinates:\t%s"
				+ "									\n\t\t\t%s"
				+ "									\n\t\t\t%s"
				+ "									\n\tPerimeter:\t%f"
				+ "									\n\tArea:\t\t%f\n",
			getLabel(),		getA().toString(),	getB().toString(),	getC().toString(),		perimeter(),area());
	}
	

}
