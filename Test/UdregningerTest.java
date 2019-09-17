import junit.framework.TestCase;

public class UdregningerTest extends TestCase {
    Udregninger udregning = new Udregninger();
    public void testSum() {
        System.out.println(udregning.sum(4,5));
            }

    public void testMinus() {
        System.out.println(udregning.minus(5,6));
    }

    public void testDele() {
        System.out.println(udregning.dele(4,5));
    }

    public void testMultiplicere() {
        System.out.println(udregning.multiplicere(4,5));
    }

    public void testSecret() {
        System.out.println(udregning.secret(4,5));
    }
}