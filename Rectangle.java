public class Rectangle extends Figure {
	protected int longueur;
	protected int largeur;
	
	public Rectangle() {
		super.origine=new Point();
	}

	public Rectangle  (int longueur, int largeur) {
		super.origine= new Point();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public Rectangle (Point o, int longueur, int largeur) {
		super(o);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double getPerimetre () {
		return 2*(longueur+largeur);
	}
	
	public double getSurface () {
		return longueur*largeur;
	}
	
	public int getLongueur ( ) {
		return longueur;
	}
	
	public int getLargeur () {
		return largeur;
	}
	
	public void setLargeur (int lar) {
		this.largeur=lar;
	}
	
	public void setLongueur (int lon) {
		this.longueur=lon;
	}
	
	public String toString() {
		String str = new String();
		str="+";
		for(int i = 1; i <= this.longueur; i++)
		{
			str=str + "--";
		}
		str=str+"+\n";
		
		for(int i = 1; i <= this.largeur; i++)
		{
			str=str+"|";
			for(int j = 1; j <= this.longueur; j++)
			{
				str=str + "  ";
			}
			str=str+"|\n";
		}
		
		str=str+"+";
		for(int i = 1; i <= this.longueur; i++)
		{
			str=str + "--";
		}
		str=str+"+";
		return str;
	}
}
