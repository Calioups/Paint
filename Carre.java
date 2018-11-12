
public class Carre extends Rectangle {

	/**
	public void setLongLarge(int a) {
		super.setLargeur(a);
		super.setLongueur(a);
	}
	*/
	public Carre () {
		super.origine=new Point();
	}
	
	public Carre (int longueur) {
		super.origine= new Point();
		super.largeur= longueur;
		super.longueur= longueur;
	}
	
	public void setLongueur (int a) {
		super.setLargeur(a);
		super.setLongueur(a);
	}
	
	public void setLargeur (int a) {
		super.setLargeur(a);
		super.setLongueur(a);
	}
}
