package calculatorHW;

	import java.util.Scanner;

	
public class Calculator{
	  
	
	public int add (int num1, int num2)
	{
	  
	return num1 + num2;
	}
	
	public int subtract (int num1, int num2)
	{
	return num1 - num2;
	  
	}
	
	public int multiply (int num1, int num2)
	{
	return num1 * num2;
	}
	
	public int divide (int num1, int num2)
	{
	  
	if (num2 == 0)
	{
	System.out.println ("num2 cannot be zero");
	return 0;
	}
	else
	return num1 / num2;
	}
	  
	
	public int square (int num1)
	{
	return num1 * num1;
	}}

	
	class MagicCalculator extends Calculator
	{
	
	public static int factorial (int n)
	{
	return (n == 1 || n == 0) ? 1 : n * factorial (n - 1);
	}
	
	public static void main (String[]args)
	{
	
	Calculator calculator = new Calculator ();
	
	Scanner sc = new Scanner (System.in);
	  
	System.out.print("Enter Number: ");
	  
	int num = sc.nextInt ();
	
	int sq = calculator.square (num);
	  
	System.out.println ("The Square Root of " + num + " is: " + sq);
	
	System.out.println ("Enter angle in degrees :");
	  
	double degree = sc.nextDouble ();
	  
	double radians = Math.toRadians (degree);
	  
	System.out.println ("Sin is: " + Math.sin (radians));
	System.out.println ("Cosine is: " + Math.cos (radians));
	System.out.println ("Tangent is: " + Math.tan (radians));
	System.out.println ("Factorial of "+ num + " is: " + factorial (num));
	}
}

