import java.util.Scanner;
class Power{
	static int power(int a,int b){
		int result = 1;
		for(int i=1;i<=b;i++){
		result = result*a;
		}
		System.out.println(a+" to the power "+b+" is : "+result);
		return result;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base : ");
		int a = sc.nextInt();
		System.out.print("Enter the Exponent : ");
		int b = sc.nextInt();
		power(a,b);
	}
}
