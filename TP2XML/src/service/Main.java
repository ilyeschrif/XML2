package service;

public class Main {

	public static void main(String[] args) {

		BanqueService bs = new BanqueService();
		System.out.println(bs.conversion(500));

		System.out.println(bs.getcomptes());

		System.out.println(bs.getCompte(0));
		System.out.println(bs.getCompte(1));

	}

}
