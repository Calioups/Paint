
public class Ellipse extends Figure {
	protected int grandAxe;
	protected int petitAxe;
	
	public Ellipse() {
		super.origine=new Point();
	}
	
	public Ellipse(int grandAxe, int petitAxe) {
		super.origine=new Point();
		this.grandAxe= grandAxe;
		this.petitAxe= petitAxe;
	}
	public double getPerimetre () {
		return 2*Math.PI*Math.sqrt((grandAxe^2 + petitAxe^2)/2);
	}
	
	public double getSurface () {
		return Math.PI*grandAxe*petitAxe/4;
	}
	
	public int getGrandAxe ( ) {
		return grandAxe;
	}
	
	public int getPetitAxe () {
		return petitAxe;
	}
	
	public void setGrandAxe (int grandAxe) {
		this.grandAxe=grandAxe;
	}
	
	public void setPetitAxe (int petitAxe) {
		this.petitAxe=petitAxe;
	}
}
