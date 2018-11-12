
public class Cercle extends Ellipse{
	
	public Cercle () {
		super.origine=new Point();
	}
	
	public Cercle (int rayon) {
		super.origine= new Point();
		super.grandAxe= rayon;
		super.petitAxe= rayon;
	}
	
	public void setGrandAxe (int a) {
		super.setGrandAxe(a);
		super.setPetitAxe(a);
	}
	
	public void setPetitAxe (int a) {
		super.setGrandAxe(a);
		super.setPetitAxe(a);
	}
}
