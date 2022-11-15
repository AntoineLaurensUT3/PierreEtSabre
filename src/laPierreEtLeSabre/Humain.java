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
	protected int nbConnaissance=0;
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

	protected void parler(String texte) {
		
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
	
	public int getnbConnaissance() {
		return nbConnaissance;
		
	}
	
	public Humain[] getMemoire() {
		return memoire;
	}
	
	protected void ajouterArgent(int i) {
		argent+=i;
		
	}
	
	protected void perdreArgent(int i) {
		argent-=i;
	}
	
	public void acheter(String bien, int prix) {
		perdreArgent(prix);
	}
	
	protected void memoriser(Humain humain) {
        memoire[nbConnaissance]=humain;
        nbConnaissance++;	
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
		humain.memoriser(this);
	}
    public void faireConnaissanceAvec(Humain humain) {
    	direBonjour();
    	memoriser(humain);
    	repondre(humain);
        
    }

	public void setNbConnaissance(int nbConnaissance) {
		this.nbConnaissance = nbConnaissance;
	}
}
