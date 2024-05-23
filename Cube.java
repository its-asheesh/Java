import java.util.Scanner;
class Cube{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int result = n*n*n;
		System.out.println("Cube of "+n+" is : "+result);
	}
}
