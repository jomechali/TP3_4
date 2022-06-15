package fr.diginamic.jdr.states;

import fr.diginamic.jdr.Arena;
import fr.diginamic.jdr.Engine;

/**
 * This represent the abstract state of the game
 * The differents states are : Initial, Main Menu, Score, Initialize Fight, Fight, End Fight
 * @author Joseph
 *
 */
public abstract class State {
	
	protected Arena arena; // to gather data about the fighters
	protected Engine engine; // to change the current state
	protected boolean leave = false; // to remember the decision to the game when asked
	
	/**
	 * @param arena
	 * @param engine
	 */
	public State(Arena arena, Engine engine) {
		super();
		this.arena = arena;
		this.engine = engine;
	}
	
	/**
	 * A constructor to instantiate the new state easily
	 * @param previouState
	 */
	public State(State previouState) {
		this(previouState.arena, previouState.engine);
	}

	/**
	 * This method implements the logic
	 * And the changes of states of the state machine
	 * @param input
	 */
	public abstract void Update(String input);
	
	/**
	 * This method is used by the view
	 * @return A string that contains data used by the view (here printed on the console)
	 */
	public abstract String textToDisplay();
	
	
	/**
	 * A way for the inheriting classes to change the state without interacting with the engine directly
	 * @param newState
	 */
	public final void changeState(State newState) {
		engine.setCurrentGameState(newState);
	}

	/**
	 * Indicates that the player asked to quit
	 * @return
	 */
	public boolean leaveGame() {
		return leave;
	}
}
