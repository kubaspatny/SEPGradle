import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testF() throws Exception {
        Assert.assertEquals(2, Main.f(2));
    }

    @Test
    public void testF2() throws Exception {
        Assert.assertEquals(4, Main.f(2));
    }

    @Test
    public void testF3() throws Exception {
        Assert.assertEquals(6, Main.f(2));
    }
}