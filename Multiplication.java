import java.util.Scanner;
class Multiplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second number: ");
		int b = sc.nextInt();
		int multiplication = a*b;
		System.out.println("Multiplication of two numbers is: "+multiplication);
	}
}
