package fr.diginamic.jdr.states;

public class ScoreState extends State {

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
		if (leave) {
			toDisplay += "\nSee you soon!";
		} else {
			toDisplay += "\nEnter any key to return to the main menu";
		}
		return toDisplay;
	}

}
