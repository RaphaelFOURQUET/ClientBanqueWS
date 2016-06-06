package fr.adaming.service;

import java.util.List;

public class ClientWS {

	public static void main(String[] args) {
		//creer un stub
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();

		//Appel methode conversion
		double res = stub.conversionEuroToFranc(600);
		System.out.println("La conversion de 600 euros en francs est : "+res);
		
		//test autres methodes
		Compte cp = stub.getCompte(1L);
		System.out.println("cp : "+cp);
		
		System.out.println("-----------------------");
		
		List<Compte> comptes = stub.getComptes();
		System.out.println("Liste de comptes :");
		for(Compte c : comptes) {
			System.out.println("\t"+c);
		}
		

	}

}
