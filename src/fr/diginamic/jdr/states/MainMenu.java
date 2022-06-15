package fr.diginamic.jdr.states;

public class MainMenu extends State {


	public MainMenu(State previouState) {
		super(previouState);
	}

	@Override
	public void Update(String input) {


		switch (input) {
		case "1"://new character
			arena.initialize();			
			break;
			
		case "2"://fight
			//switch to fightState
			//TODO Create a FightStateInit
			if (!arena.isCharacterReady()) {
				System.out.println("Initialize a new character");
			} else {
				super.changeState(new FightState(this));
			}
			break;
		case "3"://display score
			//switch to scorestate
			super.changeState(new ScoreState(this, false));
			break;
		case "4"://leave the main loop
			this.leave = true;
			break;

		default:
			System.err.println("unexpected input");
			break;
		}

	}

	@Override
	public String textToDisplay() {

		String mainMenuText = arena.getPlayerName() + ", what to do next?:\n"
							+ "\t1 - Create a new character\n"
							+ "\t2 - Fight a monsterWIP\n"
							+ "\t3 - Display character score\n"
							+ "\t4 - Leave the game :(";
		return mainMenuText;
	}

}
