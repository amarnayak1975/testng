package TestNGExamples;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleInterestTest
{
	SimpleInterest si;

	  @BeforeTest
	  public void setUp()
	  {
	  }
  
	  @Test
	  public void test1()
	  {
		  si=new SimpleInterest();

		  Assert.assertEquals(si.calculateSI(1000,10,10), 1000);
	  
	  }
	  @Test
	  public void test2()
	  {
		  si=new SimpleInterest();

		  Assert.assertEquals(si.calculateSI(1000.0,10.0,10.0), 1000.0);
	  
	  }
	  @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testNegativePrincipal()
	    {
	        si.calculateSI(-1000, 5, 2);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testZeroRate()
	    {
	        si.calculateSI(1000, 0, 2);
	    }

}
