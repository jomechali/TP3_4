package fr.diginamic.maison;

public class Chambre extends Piece {

	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public TypePiece geTypePiece() {
		return TypePiece.CHAMBRE;
	}
}
