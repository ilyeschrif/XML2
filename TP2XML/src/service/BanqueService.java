package service;

import java.time.LocalDate;
import java.util.ArrayList;

public class BanqueService {

	public double conversion(double montant) {
		return montant * 3.36;

	}

	public Compte getCompte(int code) {
		return new Compte(code, 0, LocalDate.now());
	}

	public ArrayList<Compte> getcomptes() {
		ArrayList<Compte> listecompte = new ArrayList<Compte>();
		listecompte.add(new Compte(10, 500, LocalDate.now()));
		listecompte.add(new Compte(11, 1500, LocalDate.now()));

		return listecompte;
	}


}
