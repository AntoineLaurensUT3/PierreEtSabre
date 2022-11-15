/**
 * 
 */
package laPierreEtLeSabre;

/**
 * @author lrn3770a
 *
 */
public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
		
	}

	public int seFaireExtorquer() {
		int i=getArgent();
		perdreArgent(i);
		parler("C'est vraiment trop injuste !");
		return i;
	}
	
	public void recevoir(int argent) {
		ajouterArgent(argent);
		parler("Je vous remercie pour ces"+argent+"sous !");
	}
	
	
	
	

}
