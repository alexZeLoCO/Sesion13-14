
public class Triangle extends GeometricFigure {
	
	private Point A, B, C;
	
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
	
	public double perimeter () {
		return Point.distance(getA(),getB())+Point.distance(getB(), getC())+Point.distance(getC(), getA());
	}
	
	public double area () {
		return Math.sqrt(perimeter()/2	*	(perimeter()/2-(Point.distance(getA(), getB())))*
											(perimeter()/2-(Point.distance(getB(), getC())))*
											(perimeter()/2-(Point.distance(getC(), getA())))		);	
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
