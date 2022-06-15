package fr.diginamic.jdr.states;

/**
 * A state to display the journey of the current character, and is also the last state of the game
 * Link to the Main Menu state
 * @author Joseph
 *
 */
public class ScoreState extends State {

	/**
	 * This state can be the last state of the game, this is indicated by the boolean leave
	 * @param previouState the previous state
	 * @param leave	TRUE if the player asked to leave the game
	 */
	public ScoreState(State previouState, Boolean leave) {
		super(previouState);
		this.leave = leave;
	}

	@Override
	public void Update(String input) {

		if (!leave) {
			super.changeState(new MainMenu(this));
		}

	}

	@Override
	public String textToDisplay() {
		String toDisplay = "This character earned " + arena.getCharacterScore() + " score points.";
		toDisplay += String.format("\n(Strenght : %d; LifePoints : %d)", arena.getCharacterStrenght(), arena.getCharacterLifePoints());
		if (leave) {
			toDisplay += "\nSee you soon!";
		} else {
			toDisplay += "\nEnter any key to return to the main menu";
		}
		return toDisplay;
	}

}
