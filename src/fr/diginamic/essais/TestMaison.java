package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBains;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.TypePiece;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {

		Maison maison = new Maison();
		
		maison.ajouterPiece(new Salon(25, 0));
		maison.ajouterPiece(new Chambre(15, 1));
		maison.ajouterPiece(new Chambre(13, 2));
		maison.ajouterPiece(new Cuisine(35, 1));
		maison.ajouterPiece(new WC(5, 1000));
		maison.ajouterPiece(new SalleDeBains(50, 3));

		maison.ajouterPiece(null);
		maison.ajouterPiece(new WC(-3, -106));
		
		System.out.println("superficie totale : " + maison.getSuperficieTotale());
		System.out.println("superficie etage 0 : " + maison.getSuperficieEtage(0));
		System.out.println("superficie WC : " + maison.getSuperficieParType(TypePiece.WC));
		System.out.println("nombre de chambres : " + maison.getNbPieceParTypePiece(TypePiece.CHAMBRE));
	}

}
