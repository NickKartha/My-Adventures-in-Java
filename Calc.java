/*
Program: Calculator
Author: Nikhil Kartha
email: nickkartha@gmail.com
*/

import java.util.*;

class Calc
{	
	public double add(double a, double b)
	{
		return a + b;
	}
	public double sub(double a, double b)
	{
		return a - b;
	}
	public double mult(double a, double b)
	{
		return a * b;
	}
	public double div(double a, double b)
	{
		return a / b;
	}
	public double rem(double a, double b)
	{
		return a % b;
	}
	public double exp(double a, int b)
	{ // exponent has to be a proper integer for code to work
		for(int i = 0 ; i < b; ++i)
		{ // Repeated multiplication
			a*=a;
		}
	}
	public int xor(int a, int b)
	{
		return a ^ b;
	}
	public static void main(String args[])
    	{
		System.out.println("Hello World");
	}
}