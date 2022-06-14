package fr.diginamic.maison;

public class SalleDeBains extends Piece {

	public SalleDeBains(double superficie, int etage) {
		super(superficie, etage);
	}
	@Override
	public TypePiece geTypePiece() {
		return TypePiece.SALLE_DE_BAINS;
	}

}
