package fr.diginamic.jdr;

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
	 * @return the winnerAttack
	 */
	public int getWinnerAttack() {
		return winnerAttack;
	}

	/**
	 * @return the loserAttack
	 */
	public int getLoserAttack() {
		return loserAttack;
	}

}
