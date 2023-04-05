import org.junit.jupiter.api.Test;

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
    }

    /**
     * test allumer une lampe eteinte avec la telecommande
     */
    @Test
    public void testAllumer() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        //methode testee
        t.activerLampe(0);

        // verification
        boolean res = l.isAllume();
        assertTrue(res, "apres allumer, la lampe devrait etre allumee");
    }
}
