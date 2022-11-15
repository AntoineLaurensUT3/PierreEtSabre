/**
 * 
 */
package main;
import laPierreEtLeSabre.Humain;
import laPierreEtLeSabre.Commercant;
import laPierreEtLeSabre.GrandMere;
import laPierreEtLeSabre.Ronin;
import laPierreEtLeSabre.Samourai;
import laPierreEtLeSabre.Traitre;
import laPierreEtLeSabre.Yakuza;
/**
 * @author lrn3770a
 *
 */
public class MonHistoire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Humain humain = new Humain("Prof", 10, "Porto");

		humain.direBonjour ();
		humain.boire ();

		Commercant commercant = new Commercant("Marchand", 35);

		commercant.direBonjour ();

		Yakuza yakusa = new Yakuza("Yakulenoir", 42,
		                        "biere", "WarSong");

		yakusa.direBonjour();

		yakusa.extorquer(commercant);

		Ronin ronin = new Ronin("Roro", 61, "sake");

		ronin.donnerArgent(10, commercant );
		ronin.provoquer(yakusa);
		ronin.direBonjour ();
		
		Samourai samourai = new Samourai(50,"zoro", "sake", "Luffy");
		samourai.direBonjour();
		samourai.boire("Biere");
		
		Traitre traitre = new Traitre(12,"Jean","thé","Yuzu");
		traitre.faireLeGentil(humain, 3);
		traitre.ranconner(commercant);
		traitre.ranconner(commercant);
		traitre.ranconner(commercant);
		traitre.direBonjour();
		traitre.ranconner(commercant);
		
		GrandMere mamie = new GrandMere("baba",54,"tisane");
		mamie.faireConnaissanceAvec(humain);
		mamie.faireConnaissanceAvec(commercant);
		mamie.faireConnaissanceAvec(traitre);
		mamie.faireConnaissanceAvec(samourai);
		mamie.faireConnaissanceAvec(ronin);
		mamie.faireConnaissanceAvec(yakusa);
		mamie.ragoter();
		
	}

}
