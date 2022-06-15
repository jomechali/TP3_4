package fr.diginamic.jdr;

import java.util.Random;

public class Fighter {
	
	
	private String name;
	private int lifePoints;
	private int strenght;
	private int rewardScore;
	
	/**
	 * @param name
	 * @param lifePoints
	 * @param strenght
	 * @param rewardScore
	 */
	public Fighter(String name, int lifePoints, int strenght, int rewardScore) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.strenght = strenght;
		this.rewardScore = rewardScore;
	}
	
	/**
	 * @return resulting attack for this turn
	 */
	public int attack() {
		return (Engine.RANDOM_GENERATOR.nextInt(10) + 1) + this.strenght;
	}
	
	/**
	 * @param damage
	 * @return remaining life points
	 */
	public int damageTaken(int damage) {
		lifePoints -= damage;
		return lifePoints;
	}
	
	public boolean isAlive() {
		return lifePoints > 0;
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the lifePoints
	 */
	public int getLifePoints() {
		return lifePoints;
	}

	/**
	 * @return the strenght
	 */
	public int getStrenght() {
		return strenght;
	}

	/**
	 * @return the rewardScore
	 */
	public int getRewardScore() {
		return rewardScore;
	}
	
	
	

}
