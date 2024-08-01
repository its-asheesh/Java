import java.util.Scanner;
class DecimalToBinary{
	static void decimalToBinary(int n){
		if(n==0){
			return;
		}
		decimalToBinary(n/2);
		System.out.print(n%2);
	}
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number: ");
	  int n=sc.nextInt();
			System.out.print("Binary equivalent of "+n+" is ");
			decimalToBinary(n);
			System.out.println();
	}
}
