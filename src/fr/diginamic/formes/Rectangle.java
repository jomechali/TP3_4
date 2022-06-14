/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author Joseph
 *
 */
public class Rectangle extends Forme {
	
	private double longueur;
	private double largeur;

	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return largeur * longueur;
	}

	@Override
	public double calculerPerimetre() {
		return 2 * (longueur + largeur);
	}

}
