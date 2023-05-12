import java.util.Scanner;

import appartement.*;


public class MainAppartement {

    public static void main(String args[])
    {
        Telecommande t=new Telecommande();

        Appartement temoin=Appartement.getTemoin();

        AppareilAppart l=temoin.recupererAppareil("lampe", "Chambre1");
        AdapterAppartLumiere aptLum=new AdapterAppartLumiere((AppareilAppartLampe) l,"Chambre1");
        t.ajouterApp(aptLum);

        l=(AppareilAppartLampe)temoin.recupererAppareil("lampe", "Chambre2");
        aptLum=new AdapterAppartLumiere((AppareilAppartLampe) l,"Chambre2");
        t.ajouterApp(aptLum);

        l=(AppareilAppartLampe)temoin.recupererAppareil("lampe", "Sejour");
        aptLum=new AdapterAppartLumiere((AppareilAppartLampe) l,"Sejour_1");
        t.ajouterApp(aptLum);

        l=(AppareilAppartLampe)temoin.recupererAppareil("lampe2", "Sejour");
        aptLum=new AdapterAppartLumiere((AppareilAppartLampe) l,"Sejour_2");
        t.ajouterApp(aptLum);

        l=temoin.recupererAppareil("thermostat", "Chambre1");
        AdapterAppartThermostat aptther=new AdapterAppartThermostat(l);
        t.ajouterApp(aptther);

        l=temoin.recupererAppareil("hifi", "Chambre2");
        AdapterAppartHifi apthifi = new AdapterAppartHifi((AppareilAppartHifi) l);
        t.ajouterApp(apthifi);

        System.out.println(t);

        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("entrer le num");
            int choix=sc.nextInt();
            System.out.println("entrer commande (+/-/exit)");
            String com=sc.nextLine();
            com=sc.nextLine();
            if (com.equals("+"))
            {
                t.activerApp(choix);
            }
            else if (com.equals("-"))
            {
                t.desactiverApp(choix);
            }
            else if (com.equals("exit"))
            {
                break;
            }
            else
            {
                System.out.println("commande inconnue");
            }
            System.out.println(t);

        }
        sc.close();


    }

}
