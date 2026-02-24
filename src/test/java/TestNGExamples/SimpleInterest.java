package TestNGExamples;

public class SimpleInterest 
{
	public double calculateSI(double principal, double rate, double time)
    {
        if (principal <= 0 || rate <= 0 || time <= 0)
        {
            throw new IllegalArgumentException(
                "Principal, Rate and Time must be greater than zero");
        }

        return (principal * rate * time) / 100;
    }

}
