package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;

	private int etage;
	
	/**
	 * @param superficie
	 * @param etage
	 */
	public Piece(double superficie, int etage) {
		super();
		
		// cas invalide, on done des valeurs par defaut
		if (superficie < 0 || etage < 0) {

			this.superficie = 10;
			this.etage = 1;
			System.err.println("La piece est mal definie!");
			
		} else {
			this.superficie = superficie;
			this.etage = etage;
		}
	}
	
	public abstract TypePiece geTypePiece();
	
	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}
}
