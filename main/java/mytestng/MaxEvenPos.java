package mytestng;

public class MaxEvenPos
{

    public int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    public String evenOrOdd(int num)
    {
        if (num < 0)
        {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public String positiveOrNegative(int num)
    {
        if (num == 0) 
        {
            throw new IllegalArgumentException("Zero is not allowed");
        }
        return (num > 0) ? "Positive" : "Negative";
    }
}