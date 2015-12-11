import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testF() throws Exception {
        Assert.assertEquals(2, Main.f(2));
    }

    @Test
    public void testF2() throws Exception {
        Assert.assertEquals(4, Main.f2(2));
    }

    @Test
    public void testF3() throws Exception {
        Assert.assertEquals(6, Main.f3(2));
    }
}