import thermos.Thermostat;

import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		Telecommande t=new Telecommande();
		Lampe l1 = new Lampe("Lampe1");
		t.ajouterApp(l1);

		Lampe l2 = new Lampe("Lampe2");
		t.ajouterApp(l2);

		Lampe l3 = new Lampe("Lampe3");
		t.ajouterApp(l3);

		Lampe l4 = new Lampe("Lampe4");

		Cheminee c1 = new Cheminee();
		AdapterCheminee ac1 = new AdapterCheminee(c1);
		Thermostat ther = new Thermostat();
		AdapterThermostat at = new AdapterThermostat(ther);
		Hifi h1 = new Hifi();


		t.ajouterApp(ac1);
		t.ajouterApp(at);
		t.ajouterApp(l1);
		t.ajouterApp(h1);
		t.ajouterApp(l4);
		t.activerApp(1);
		t.activerApp(3);
		t.activerApp(2);
		t.activerApp(0);
		t.activerApp(2);

		TelecommandeGraphique tg=new TelecommandeGraphique(t);



	}

}
