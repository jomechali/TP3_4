package fr.diginamic.jdr.states;

/**
 * A state to initialize the fight, with a message and the creation of a random foe
 * Link to the Fight state
 * @author Joseph
 *
 */
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
