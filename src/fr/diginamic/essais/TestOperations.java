package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

		System.out.println(Operations.Compute(5.3, 4.7, '+'));
		System.out.println(Operations.Compute(5.3, 4.7, '-'));
		System.out.println(Operations.Compute(5.3, 4.7, '*'));
		System.out.println(Operations.Compute(5.3, 4.7, '/'));

	}

}
