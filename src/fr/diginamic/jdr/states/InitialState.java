package fr.diginamic.jdr.states;

import fr.diginamic.jdr.Arena;
import fr.diginamic.jdr.Engine;

/**
 * The initial state, the player is asked its name
 * @author Joseph
 *
 */
public class InitialState extends State {

	
	public InitialState(Arena arena, Engine engine) {
		super(arena, engine);
	}

	@Override
	public void Update(String input) {

		this.arena = new Arena(input);
		super.changeState(new MainMenu(this));
		
		//move to main menu

	}

	@Override
	public String textToDisplay() {

		return "Hi Player! What's your name?";
		
	}

}
