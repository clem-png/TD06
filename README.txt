NETANGE Clément 
MOUGIN Enzo S2E



Remarques: 
- Dans la classe Telecommande : La méthode getLampe() prend en paramètre un index (int) et renvoie la Lampe correspondante. 

- Mettez à jour la classe telecommandeTest en tenant compte de ma remarque sur la méthode getLampe()

		Exemple

		```
		/**
	 * verifie qu'on peut allumer une lampe
	 */
	@Test
	public void testAllumer() {
		Telecommande telecommande=new Telecommande();
		telecommande.ajouterLampe(new Lampe("test"));
		telecommande.activerLampe(0);
		boolean lampeAllumee = telecommande.getLampe(0).isAllume();
		assertTrue("la lampe devrait etre allumee",lampeAllumee);
	}
	```
