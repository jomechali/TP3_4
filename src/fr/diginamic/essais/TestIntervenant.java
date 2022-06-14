package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("toto", "tototo", 1500);
		System.out.println("salaire du salarié : " +salarie1.getSalaire());

		Pigiste pigiste1 = new Pigiste("titi", "tititi", 5, 50);
		System.out.println("salaire du pigiste : " + pigiste1.getSalaire());
	}

}
