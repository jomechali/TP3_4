package fr.diginamic.jdr.states;

import fr.diginamic.jdr.FightTurnRecord;

public class FightState extends State {

	private int turnNumber = 0;
	private FightTurnRecord currentFightTurn;
	
	public FightState(State previouState) {
		super(previouState);
		// conception mistake!!! the first turn is here???
		this.Update(null);
	}

	@Override
	public void Update(String input) {
		
		if (arena.fightHasEnded()) {
			super.changeState(new FightStateEnd(this, currentFightTurn, turnNumber));
			return;
		}
		turnNumber++;
		currentFightTurn = arena.fightTurn();
	}

	@Override
	public String textToDisplay() {
		String toDisplayString = "The turn " + turnNumber + " begin!\n";
		toDisplayString += currentFightTurn.getWinnerName() + " won!\n\tAttack : " + currentFightTurn.getWinnerAttack() + "\t|Life points remaining : " + currentFightTurn.getWinnerLifePoints() + "\n";
		toDisplayString += currentFightTurn.getLoserName() + " lost!\n\tAttack : " + currentFightTurn.getLoserAttack() + "\t|Life points remaining : " + currentFightTurn.getLoserLifePoints() + "\n";
		
	
		return toDisplayString;
	
	}

}
