package com.amar.AllTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest
{
	Calculator calc;

    @BeforeClass
    public void setup()
    {
        calc = new Calculator();
    }

    @Test
    public void testAddition()
    {
        Assert.assertEquals(calc.add(10, 5), 15);
    }

    @Test
    public void testSubtraction()
    {
        Assert.assertEquals(calc.sub(10, 5), 5);
    }

    @Test
    public void testMultiplication()
    {
        Assert.assertEquals(calc.mul(10, 5), 50);
    }

    @Test
    public void testDivision()
    {
        Assert.assertEquals(calc.div(10, 5), 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero()
    {
        calc.div(10, 0);
    }

}
