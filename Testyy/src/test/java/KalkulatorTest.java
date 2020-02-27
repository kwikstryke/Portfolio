import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {
    @Test
   public void test1 () {
        Kalkulator kalkulator1 = new Kalkulator(2,3);
        Assert.assertEquals(5,kalkulator1.add(),0);

    }
    @Test
    public void test2 () {
        Kalkulator kalkulator1 = new Kalkulator(2,3);
        Assert.assertEquals(52,kalkulator1.add(),0);
    }

}
