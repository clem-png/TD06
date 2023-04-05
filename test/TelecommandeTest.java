import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class TelecommandeTest {

    /**
     * test du constructeur de lampe
     */
    @Test
    public void testTelecommande() {
        // methode testee
        Telecommande t = new Telecommande();

        // verification

        assertFalse(t == null, "une nouvelle lampe devrait etre eteinte");
    }

    /**
     * test ajouter une lampe
     */
    @Test
    public void testAjout() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        //methode testee
        t.ajouterLampe(l);

        // verification
        assertTrue(t.getLampe().contains(l), "apres ajout, la lampe devrait etre dans la liste");
        assertTrue((t.getLampe().get(0) == l), "apres ajout, la lampe devrait etre dans la liste");
    }

    /**
     * test allumer une lampe eteinte avec la telecommande
     */
    @Test

    public void testAllumer() throws IndexOutOfBoundsException{
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        //methode testee
        t.ajouterLampe(l);
        t.activerLampe(0);

        // verification
        assertTrue(t.getLampe().get(0).isAllume(), "apres activerLampe, la lampe devrait etre allumee");
    }

    @Test
    public void testEteindre() throws IndexOutOfBoundsException{
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        //methode testee
        t.ajouterLampe(l);
        t.activerLampe(0);
        t.desactiverLampe(0);

        // verification
        assertFalse(t.getLampe().get(0).isAllume(), "apres activerLampe, la lampe devrait etre allumee");
    }

    @Test
    public void testAllumerTout() throws IndexOutOfBoundsException{
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        //methode testee
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        t.activerTout();


        // verification
        assertTrue(t.getLampe().get(0).isAllume(), "apres activerLampe, la lampe devrait etre allumee");
        assertTrue(t.getLampe().get(1).isAllume(), "apres activerLampe, la lampe devrait etre allumee");
    }
}
