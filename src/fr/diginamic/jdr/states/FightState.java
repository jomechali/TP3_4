package fr.diginamic.jdr.states;

import fr.diginamic.jdr.FightTurnRecord;

public class FightState extends State {

	private int turnNumber = 0;
	private FightTurnRecord currentFightTurn;
	
	public FightState(State previouState) {
		super(previouState);
	}

	@Override
	public void Update(String input) {

		//TODO to remove when begin state will be implemented
		if (turnNumber == 0) {
			arena.randomNewFoe();
			System.out.println("The character meet a " + arena.monsterName() + " !");
		}
		
		turnNumber++;
		currentFightTurn = arena.fightTurn();
		
		if (arena.fightHasEnded()) {
			// change to FightEndState

			if (arena.isCharacterReady()) {
				arena.increaseScore(currentFightTurn.getLoserScore());
			} else {
				System.out.println("your character died!");
			}
			super.changeState(new MainMenu(this));
		}
	}

	@Override
	public String textToDisplay() {


		//TODO to remove when begin state will be implemented
		if (turnNumber == 0) {
			return "The character meet a new monster !";
		} else {
			String toDisplayString = "The turn " + turnNumber + " begin! ";
			toDisplayString += currentFightTurn.getWinnerName() + " won!\n\tAttack : " + currentFightTurn.getWinnerAttack() + "Life points remaining : " + currentFightTurn.getWinnerLifePoints() + "\n";
			toDisplayString += currentFightTurn.getLoserName() + " lost!\n\tAttack : " + currentFightTurn.getLoserAttack() + "Life points remaining : " + currentFightTurn.getLoserLifePoints() + "\n";
			
			if (arena.fightHasEnded()) {
				toDisplayString += currentFightTurn.getLoserName() + " died!";
			}
		
			return toDisplayString;
		}
	}

}
