package fr.diginamic.maison;

public class Maison {
	
	private Piece[] pieces = new Piece[2];
	private int nbPieces = 0;
	
	public void ajouterPiece(Piece nouvellePiece) {
		if (nouvellePiece == null) {
			System.err.println("La piece est invalide!");
			return;
		}
		if (nbPieces >= pieces.length) {
			Piece[] piecesCopy = new Piece[2 * nbPieces];
			for (int i = 0; i < nbPieces; i++) {
				piecesCopy[i] = pieces[i];
			}
			pieces = piecesCopy;
		}
		pieces[nbPieces] = nouvellePiece;
		nbPieces++;
	}
	
	public double getSuperficieTotale() {
		//double result = Arrays.stream(pieces).reduce(0.0, (sum, pieceActuelle) -> sum + pieceActuelle.getSuperficie());
		//return Arrays.stream(pieces).map(Piece::getSuperficie).reduce((t, u) -> t + u).get();
		double superficie = 0;
		for (int i = 0; i < nbPieces; i++) {
			superficie += pieces[i].getSuperficie();
			
		}
		return superficie;
	}

	public double getSuperficieEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < nbPieces; i++) {
			if (pieces[i].getEtage() == etage) {
				superficie += pieces[i].getSuperficie();				
			}
			
		}
		return superficie;
	}
	
	public double getSuperficieParType(TypePiece typePiece) {
		double superficie = 0;
		for (int i = 0; i < nbPieces; i++) {
			if (pieces[i].geTypePiece() == typePiece) {
				superficie += pieces[i].getSuperficie();				
			}
			
		}
		return superficie;
	}
	
	public int getNbPieceParTypePiece(TypePiece typePiece) {
		int nbPieceDeType = 0;
		for (int i = 0; i < nbPieces; i++) {
			if (pieces[i].geTypePiece() == typePiece) {
				nbPieceDeType++;				
			}
			
		}
		return nbPieceDeType;
	}
}
