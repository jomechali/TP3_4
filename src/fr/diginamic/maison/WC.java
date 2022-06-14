package fr.diginamic.maison;

public class WC extends Piece {

	public WC(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public TypePiece geTypePiece() {
		return TypePiece.WC;
	}
}
