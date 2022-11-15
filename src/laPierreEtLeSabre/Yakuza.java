/**
 * 
 */
package laPierreEtLeSabre;

/**
 * @author lrn3770a
 *
 */
public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom,int argent,  String boisson,String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	
	public void extorquer(Commercant commercant) {
		ajouterArgent(commercant.getArgent());
		commercant.perdreArgent(commercant.getArgent());
		reputation+=1;
		parler("Je viens d'extorquer "+commercant.getNom());
		
	}
	
	public int perdre() {
		int i=getArgent();
		perdreArgent(i);
		parler("J'ai perdu...");
		
		return i;
		
		
	}
	
	public void gagner() {
		reputation+=1;
		parler("VICTOIRE !!");
		
	}
	
	
	public void direBonjour() {
		
		super.direBonjour();
		parler("Mon clan est celui de "+clan);
		
	}

}
