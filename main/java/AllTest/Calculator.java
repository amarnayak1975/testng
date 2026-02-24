package com.amar.AllTest;

public class Calculator
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public int sub(int a, int b)
    {
        return a - b;
       
    }

    public int mul(int a, int b)
    {
        return a * b;
    }

    public int div(int a, int b)
    {
        if (b == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

}
