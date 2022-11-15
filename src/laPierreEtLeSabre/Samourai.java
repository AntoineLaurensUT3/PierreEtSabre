/**
 * 
 */
package laPierreEtLeSabre;

/**
 * @author lrn3770a
 *
 */
public class Samourai extends Ronin{
	private String seigneur;

	public Samourai(int argent, String nom, String boisson,String seigneur) {
		super(nom,argent,  boisson);
		this.seigneur = seigneur;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Je sers le seigneur "+seigneur);
	}
	
	public void boire(String boisson) {
		
		parler("Mmmm, un bon verre de "+boisson+"! GLOUPS !");
		
	}
	

}
