/**
 * 
 */
package laPierreEtLeSabre;

/**
 * @author lrn3770a
 *
 */
public class Ronin extends Humain {

	private int honneur=1;
	
	public Ronin(String nom,int argent,  String boisson) {
		super(nom, argent, boisson);
		
	}
	
	public void donnerArgent(int i,Commercant commercant) {
		commercant.ajouterArgent(i);
		perdreArgent(i);
		
	}
	
	
	public void provoquer(Yakuza yakuza) {
		
		if(2*honneur > yakuza.getReputation()) {
			ajouterArgent(yakuza.getArgent());
			honneur+=1;
			parler("J'ai gagné !");
			yakuza.perdre();
		}
		else {
			honneur-=1;
			parler("Cette defaite est impardonnable...");
			yakuza.gagner();
			
			
		}
		
		
	}
	
	
	

}
