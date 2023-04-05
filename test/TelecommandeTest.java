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
     * test allumer une lampe eteinte
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
}
