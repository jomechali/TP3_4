package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.states.State;

public class View {
	
	private Scanner sc = new Scanner(System.in);
	
	public String getInput() {
		return sc.nextLine();
	}
	
	public void displayCurrentState(State currentState) {
		System.out.println(currentState.textToDisplay());
	}

}
