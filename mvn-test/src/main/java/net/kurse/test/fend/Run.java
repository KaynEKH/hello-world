/**
 * 
 */
package net.kurse.test.fend;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.kurse.test.bend.JsonFactory;
import net.kurse.test.bo.CharSheet;
import net.kurse.test.bo.blocs.Caracs;
import net.kurse.test.bo.blocs.Echelles;
import net.kurse.test.bo.blocs.equip.ArmeCaC;
import net.kurse.test.bo.blocs.equip.ArmeTir;
import net.kurse.test.bo.blocs.equip.Portee;

/**
 * @author KaynEKH
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Echelles echelles = new Echelles(2,3,2);
		Caracs caracs = new Caracs(3,4,3,3,2,4);
		CharSheet cs = new CharSheet(echelles, caracs);
		List<ArmeCaC> listeArmementCaC = new ArrayList<ArmeCaC>();
		List<ArmeTir> listeArmementTir = new ArrayList<ArmeTir>();
		
		Set<Integer> listeCapaKatana = new HashSet<Integer>();
		listeCapaKatana.add(1);
		listeCapaKatana.add(4);
		listeCapaKatana.add(7);
		ArmeCaC katana = new ArmeCaC("Katana", 2, "M1M", 8, 1, listeCapaKatana, "N/A");
		
		listeArmementCaC.add(katana);
		
		Set<Integer> listeCapaTanto = new HashSet<Integer>();
		listeCapaTanto.add(1);
		listeCapaTanto.add(3);
		ArmeCaC tanto = new ArmeCaC("Tanto", 2, "MAC", 5, 0, listeCapaTanto, "N/A");
		
		listeArmementCaC.add(tanto);
		
		Set<Integer> listeCapaGun = new HashSet<Integer>();
		listeCapaGun.add(2);
		listeCapaGun.add(4);
		listeCapaGun.add(5);
		listeCapaGun.add(11);
		ArmeTir beretta = new ArmeTir("Beretta SN-45", 3, "TPG", 8, true, 30, new Portee(10, 25, 50, 100), listeCapaKatana, "N/A");
		
		listeArmementTir.add(beretta);
		
		cs.setListeArmementCaC(listeArmementCaC);
		cs.setListeArmementTir(listeArmementTir);
		
		JsonFactory<CharSheet> jsonFactory = new JsonFactory<CharSheet>();
		
		jsonFactory.write(cs, "./test_zipped.sav", true);
		CharSheet cs2 = jsonFactory.read("./test_zipped.sav", true);

		jsonFactory.write(cs, "./test_nonzipped.txt", false);
		CharSheet cs3 = jsonFactory.read("./test_nonzipped.txt", false);
		
		System.out.println("OK");
	}

}
