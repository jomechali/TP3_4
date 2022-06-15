package fr.diginamic.jdr.states;

import fr.diginamic.jdr.Arena;
import fr.diginamic.jdr.Engine;

public class FightStateInit extends State {


	public FightStateInit(State previouState) {
		super(previouState);
		// initialize the fight
		arena.randomNewFoe();
	}

	@Override
	public void Update(String input) {

		super.changeState(new FightState(this));

	}

	@Override
	public String textToDisplay() {

		String toDisplay = 	"The character meet a " + arena.monsterName() + " !";
		return toDisplay;
	}

}
