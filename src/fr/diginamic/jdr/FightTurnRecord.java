package fr.diginamic.jdr;

/**
 * This class stores all relevant data about a turn
 * It is used by the fighting states to update the game, the winner, if the fight ended...
 * It also filters the data for the view (formatted by the states)
 * @author Joseph
 *
 */
public class FightTurnRecord {
	
	private int winnerAttack;
	private int loserAttack;
	
	private Fighter winner;
	private Fighter loser;
	
	/**
	 * @param characterAttack
	 * @param monsterAttack
	 * @param turnNumber
	 * @param winner
	 * @param loser
	 */
	public FightTurnRecord(int winnerAttack, int loserAttack, Fighter winner, Fighter loser) {
		super();
		this.winnerAttack = winnerAttack;
		this.loserAttack = loserAttack;
		this.winner = winner;
		this.loser = loser;
	}

	/*these methodes avoid the need for the states to know the Fighter class, just in case this code must change*/
	
	public String getWinnerName() {
		return winner.getName();
	}
	public String getLoserName() {
		return loser.getName();
	}
	
	public int getWinnerLifePoints() {
		return winner.getLifePoints();
	}
	public int getLoserLifePoints() {
		return loser.getLifePoints();
	}
	
	public int getLoserScore() {
		return loser.getRewardScore();
	}

	/**
	 * @return the winnerAttack for this turn
	 */
	public int getWinnerAttack() {
		return winnerAttack;
	}

	/**
	 * @return the loserAttack for this turn
	 */
	public int getLoserAttack() {
		return loserAttack;
	}

}
