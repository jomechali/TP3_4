package fr.diginamic.jdr.states;

/**
 * The main state, use to create a character and leave the game
 * Link to the Initial Fight state and to the Score state
 * @author Joseph
 *
 */
public class MainMenu extends State {


	public MainMenu(State previouState) {
		super(previouState);
	}

	@Override
	public void Update(String input) {


		switch (input) {
		case "1"://new character
			arena.initialize();	
			System.out.println("Your journey begins!");//  this must disappear : for MVC, make another state
			break;
			
		case "2"://fight
			//switch to fightStateInit
			if (!arena.isCharacterReady()) {
				System.out.println("Initialize a new character"); // this must disappear : for MVC, and makes little sense here, maybe a new state?
			} else {
				super.changeState(new FightStateInit(this));
			}
			break;
			
		case "3"://display score
			//switch to scoreState
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
							+ "\t2 - Fight a monster\n"
							+ "\t3 - Display character score\n"
							+ "\t4 - Leave the game :(";
		return mainMenuText;
	}

}
