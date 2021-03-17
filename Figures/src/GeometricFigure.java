
abstract class GeometricFigure {
	
	abstract double area ();
	
	abstract double perimeter ();
	
	static public double totalArea (GeometricFigure [] figs) {
		if (figs!=null) {
		double total=0;
		for (int i=0;i<figs.length;i++) {
			total = total + figs[i].area();
		}
		
		return total;
		}
		return 0;
	}
}
