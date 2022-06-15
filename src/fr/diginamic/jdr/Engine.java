package fr.diginamic.jdr;

import java.util.Random;

import fr.diginamic.jdr.states.InitialState;
import fr.diginamic.jdr.states.ScoreState;
import fr.diginamic.jdr.states.State;

public class Engine {
	
	public static final Random RANDOM_GENERATOR = new Random();
	private State currentGameState = new InitialState(null, this); // TODO init here during the development process
	private View gameView = new View();

	public static void main(String[] args) {

		Engine engine = new Engine();
		engine.mainLoop();
		return;
	}
	
	public void mainLoop() {
		
		// set the initial state TODO new IitialState here
		gameView.displayCurrentState(currentGameState);
		currentGameState.Update(gameView.getInput());
		
		// main loop
		while (!currentGameState.leaveGame()) {
			//display and get input
			gameView.displayCurrentState(currentGameState);
			String playerInput = gameView.getInput();
			
			//update game status
			currentGameState.Update(playerInput);
		}

		// set the leaving state
		this.currentGameState = new ScoreState(currentGameState, true);
		gameView.displayCurrentState(currentGameState);
		
		return;
		
	}
	
	/**
	 * @return the currentGameState
	 */
	public State getCurrentGameState() {
		return currentGameState;
	}

	/**
	 * @param currentGameState the currentGameState to set
	 */
	public void setCurrentGameState(State currentGameState) {
		this.currentGameState = currentGameState;
	}

}
