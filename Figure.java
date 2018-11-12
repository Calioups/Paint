
public abstract class Figure {
	protected Point origine;
	
	public Figure() {
		origine = new Point();
	}
	
	public Figure (Point a) {
		origine = a;
	}
	
	public String toString() {
		int x=origine.getX();
		int y=origine.getY();
		String str = new String();
		for (int i = 0; i <= y; i++)
			str = str + "\n";
		for (int j=0;j<=x;j++)
			str = str + " ";
		return str;
	}
	
	/**
	* @return perimetre de la figure 
	*/ 
	public abstract double getPerimetre(); 
	/**
	* @return surface de la figure 
	*/ 
	public abstract double getSurface(); 
}
