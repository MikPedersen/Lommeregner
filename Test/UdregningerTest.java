import junit.framework.TestCase;

import java.net.PasswordAuthentication;

public class UdregningerTest extends TestCase {
    Udregninger udregning = new Udregninger();
    public void testSum() {
        int resultat = udregning.sum(4,5);
        assertEquals(9,resultat);
    }

    public void testMinus() {

        int resultat= udregning.minus(5,6);
        assertEquals(-1,resultat);
    }

    public void testDele() {
        int resultat = udregning.dele(5,5);
        assertEquals(1, resultat);
    }

    public void testMultiplicere() {
        int resultat = udregning.multiplicere(4,5);
        assertEquals(20, resultat);
    }

    public void testSecret() {
        int resultat = udregning.secret(4,5);
        assertEquals(20, resultat);
    }
}