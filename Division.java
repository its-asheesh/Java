import java.util.Scanner;
import java.io.*;
class Division{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dividend : ");
		float a = sc.nextFloat();
		System.out.print("Enter Divisor : ");
		float b = sc.nextFloat();
		try {
			System.out.println("Quotient : "+(a / b));
		}
		catch (ArithmeticException e) {
			// Exception handler
			System.out.println(
				"Divided by zero operation cannot possible");
		}
	}
}

