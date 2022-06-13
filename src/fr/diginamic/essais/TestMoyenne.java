package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne m1 = new CalculMoyenne();
		CalculMoyenne m2 = new CalculMoyenne();
		
		for (int i = 0; i < 10; i++) {
			m1.addDouble(i);
			m2.addDouble(2 * i);
		}

		System.out.println(m1.ComputeMean() + ", expected 4.5");
		System.out.println(m2.ComputeMean() + ", expected 9");

	}

}
