package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(3.4);
		Cercle c2 = CercleFactory.createCercle(10.9);
		
		System.out.println(c1);

		System.out.println(c2);
	}

}
