/**
 * 
 */
package laPierreEtLeSabre;

/**
 * @author lrn3770a
 *
 */
public class Humain {
	
	private Humain [] memoire = new Humain [30]; 
	private int nbConaissance=0;
	private int argent;
	private String nom;
	private String boisson;
	
	/**
	 * @param argent
	 * @param nom
	 * @param boisson
	 */
	public Humain(String nom, int argent, String boisson) {
		super();
		this.argent = argent;
		this.nom = nom;
		this.boisson = boisson;
	}

	public void parler(String texte) {
		
		System.out.println(nom+"- "+texte);
		
		
	}

	public void direBonjour() {
		
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson);
	}
	
	public void boire() {
		
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public int getnbConaissance() {
		return nbConaissance;
		
	}
	
	public Humain[] getMemoire() {
		return memoire;
	}
	
	public void ajouterArgent(int i) {
		argent+=i;
		
	}
	
	public void perdreArgent(int i) {
		argent-=i;
		
		
	}
	
	public void acheter(String bien, int prix) {
		perdreArgent(prix);
	}
	
    public void faireConnaissanceAvec(Humain humain) {
    	direBonjour();
    	humain.direBonjour();
        memoire[nbConaissance]=humain;
        nbConaissance++;
        
    }
}
