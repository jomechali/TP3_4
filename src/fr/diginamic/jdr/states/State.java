package fr.diginamic.jdr.states;

import fr.diginamic.jdr.Arena;
import fr.diginamic.jdr.Engine;

public abstract class State {
	
	protected Arena arena;
	protected Engine engine;
	protected boolean leave = false;
	
	/**
	 * @param arena
	 * @param engine
	 */
	public State(Arena arena, Engine engine) {
		super();
		this.arena = arena;
		this.engine = engine;
	}
	
	public State(State previouState) {
		this(previouState.arena, previouState.engine);
	}

	public abstract void Update(String input);
	
	public abstract String textToDisplay();
	
	public final void changeState(State newState) {
		engine.setCurrentGameState(newState);
	}

	public boolean leaveGame() {
		return leave;
	}
}
