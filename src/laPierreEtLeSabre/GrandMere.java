package laPierreEtLeSabre;
import java.util.Random;



public class GrandMere extends Humain {
		
	
	public GrandMere(String nom, int argent, String boisson) {
		super(nom, argent, "tisane");

	}
	

	
	private String HumainHasard() {
		int rand;
		Random random = new Random();
		rand = random.nextInt(5);
		switch(rand) {
		
		case 0:
			return "Commercant";
		case 1:
			return "Yakuza";
		case 2:
			return "Ronin";
		case 3:
			return "Samourai";
		}
		return "Humain";
		
	}
	
	
	
	public void ragoter() {
		Humain[] memoire = getMemoire();
        if(getnbConaissance()>0){
            for(int i=0; i<getnbConaissance();i++) {
                Humain humain = memoire[i];
                if(humain instanceof Traitre) {
                    parler(humain.getNom()+" est un traitre !");
                } else {
                parler("Je pense que "+humain.getNom() +" est un "+HumainHasard());
                }
            }
        }
    }

	
	

}
