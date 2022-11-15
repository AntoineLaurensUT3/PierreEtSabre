/**
 * 
 */
package laPierreEtLeSabre;

/**
 * @author lrn3770a
 *
 */
public class Traitre extends Samourai {
	
	
	private int traitrise=0;

	public Traitre(int argent, String nom, String boisson, String seigneur) {
		super(argent, nom, boisson, seigneur);
		
	}

	
	
	
	public void ranconner(Commercant commercant) {
		if(traitrise < 3) {
		ajouterArgent(commercant.getArgent());
		commercant.perdreArgent(commercant.getArgent());
		traitrise+=1;
		parler("Je viens d'extorquer"+commercant.getNom());
		}
		else
			parler("Mon niveau de traitrise est trop élevé");
	}	
	
	
	public void direBonjour() {
		
		super.direBonjour();
		parler("Mon niveau de traitrise est de "+traitrise);
		
		
	}
	
	public void faireLeGentil(Humain humain, int i) {
		humain.ajouterArgent(i);
		perdreArgent(i);
		parler("Je fais ami-ami avec "+humain.getNom());
		if(traitrise > 0)
			traitrise-=(i/10);
		
	}
	
	
}
