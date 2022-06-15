package fr.diginamic.jdr.states;

import fr.diginamic.jdr.Arena;
import fr.diginamic.jdr.Engine;
import fr.diginamic.jdr.FightTurnRecord;

public class FightStateEnd extends State {


	private FightTurnRecord lastTurnRecord;
	private int lastTurnNumber;

	public FightStateEnd(State previouState, FightTurnRecord lastTurnRecord, int lastTurnNumber) {
		super(previouState);

		this.lastTurnRecord = lastTurnRecord;
		this.lastTurnNumber = lastTurnNumber;
	}

	@Override
	public void Update(String input) {

		if (!arena.isCharacterDead()) {
			arena.increaseScore(lastTurnRecord.getLoserScore());
		}
		super.changeState(new MainMenu(this));

	}

	@Override
	public String textToDisplay() {
		String toDisplay = "The fight has ended at turn " + lastTurnNumber + "!\n";
		toDisplay += lastTurnRecord.getWinnerName() + " won! Life points remaining : " + lastTurnRecord.getWinnerLifePoints();
		toDisplay += ". " + lastTurnRecord.getLoserName() + " died!";
		if (arena.isCharacterDead()) {
			toDisplay += "Your character died! Create a new one!";
		}
		return toDisplay;
	}

}
