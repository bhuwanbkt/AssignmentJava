package UnitTest;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        Assert.assertEquals(c.add(3,5),8);
        Assert.assertTrue(true);
    }

    @Test
    public void testSub(){
        Calculator c = new Calculator();
        Assert.assertEquals(c.sub(5,3),2);
    }

    @Test
    public void testMul(){
        Calculator c = new Calculator();
        Assert.assertEquals(c.mul(5,3),15);
    }

    @Test
    public void testDiv(){
        Calculator c = new Calculator();
        Assert.assertEquals(c.div(8,4),2);
    }

}
