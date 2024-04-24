import java.util.Scanner;
class Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second number: ");
		int b = sc.nextInt();
		int add = a+b;
		System.out.println("Addition of two numbers is: "+add);
	}
}
