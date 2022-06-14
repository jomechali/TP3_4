package fr.diginamic.maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}
	@Override
	public TypePiece geTypePiece() {
		return TypePiece.CUISINE;
	}

}
