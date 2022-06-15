package fr.diginamic.jdr;

import java.util.Objects;
import java.util.Random;

public class Arena {
	
	private String playerName;
	private Fighter character;
	private Fighter monster;
	private int characterScore;
	
	/**
	 * @param playerName
	 */
	public Arena(String playerName) {
		super();
		this.playerName = playerName;
		this.characterScore = 0;
	}

	/**
	 * Initialize a new character
	 */
	public void initialize() {
		characterScore = 0;
		character = new Fighter(playerName, Engine.RANDOM_GENERATOR.nextInt(20, 51), Engine.RANDOM_GENERATOR.nextInt(12, 19), 0);
	}
	
	/**
	 * Initialize a random new foe
	 */
	public void randomNewFoe() {
		Random randomGenerator = Engine.RANDOM_GENERATOR;
		int monsterType = randomGenerator.nextInt(1, 4);
		
		switch (monsterType) {
		case 1:
			this.newFoe("Wolf", randomGenerator.nextInt(5, 11), randomGenerator.nextInt(3, 9), 1);
			
			break;
		case 2:
			this.newFoe("Gobelin", randomGenerator.nextInt(10, 16), randomGenerator.nextInt(5, 11), 2);

			break;
		case 3:
			this.newFoe("Troll", randomGenerator.nextInt(20, 31), randomGenerator.nextInt(10, 16), 5);
			break;

		default:
			System.err.println("Something went really wrong!"); // this was surprisingly useful :(
			break;
		}
	}
	
	/**
	 * Initialize a new foe
	 * @param name
	 * @param lifePoints
	 * @param strenght
	 * @param rewardScore
	 */
	public void newFoe(String name, int lifePoints, int strenght, int rewardScore) {
		monster = new Fighter(name, lifePoints, strenght, rewardScore);
	}
	
	/**
	 * Fight a turn according to the rules
	 * @return the winner
	 */
	public FightTurnRecord fightTurn() {
		int playerAttack = character.attack();
		int monsterAttack = monster.attack();
		
		if (playerAttack == monsterAttack) {
			return null;
		}
		
		Fighter winner;
		Fighter loser;
		FightTurnRecord results;
		
		if (playerAttack > monsterAttack) {
			winner = character;
			loser = monster;
			monster.damageTaken(playerAttack);
			results = new FightTurnRecord(playerAttack, monsterAttack, winner, loser);
			
		} else {
			winner = monster;
			loser = character;
			character.damageTaken(monsterAttack);
			results = new FightTurnRecord(monsterAttack, playerAttack, winner, loser);
			
		}
		return results;
	}
	
	public boolean fightHasEnded() {
		return !(monster.isAlive() && character.isAlive());
	}
	
	public boolean isCharacterReady() {
		return !Objects.isNull(character) && character.isAlive();
	}
	
	public boolean isCharacterDead() {
		return !character.isAlive();
	}
	/**
	 * TODO temporary function to access the name of the monster 
	 */
	public String monsterName() {
		return monster.getName();
	}
	/**
	 * methode to access the strenght of the character
	 */
	public int getCharacterStrenght() {
		return character.getStrenght();
	}
	/**
	 * methode to access the life points of the character
	 */
	public int getCharacterLifePoints() {
		return character.getLifePoints();
	}
	
	
	/**
	 * Increase the score
	 * @param earnedScorePoints
	 */
	public void increaseScore(int earnedScorePoints) {
		characterScore += earnedScorePoints;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @return the characterScore
	 */
	public int getCharacterScore() {
		return characterScore;
	}
}
