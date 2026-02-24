package mytestng;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class MaxEvenPosTest
{
    MaxEvenPos mep;

    @BeforeClass
    public void setup()
    {
        mep = new MaxEvenPos();
    }

    @Test
    public void testMaxPositive()
    {
        Assert.assertEquals(mep.max(10, 20), 20);
    }

    @Test
    public void testMaxWithNegativeValues()
    {
        Assert.assertEquals(mep.max(-10, -5), -5);
    }

    @Test
    public void testEvenNumber()
    {
        Assert.assertEquals(mep.evenOrOdd(8), "Even");
    }

    @Test
    public void testOddNumber()
    {
        Assert.assertEquals(mep.evenOrOdd(7), "Odd");
    }

    @Test
    public void testPositiveNumber()
    {
        Assert.assertEquals(mep.positiveOrNegative(25), "Positive");
    }

    @Test
    public void testNegativeNumber()
    {
        Assert.assertEquals(mep.positiveOrNegative(-10), "Negative");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEvenOrOddWithNegativeInput()
    {
        mep.evenOrOdd(-4);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPositiveOrNegativeWithZero()
    {
        mep.positiveOrNegative(0);
    }
}


