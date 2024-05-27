import java.util.Scanner;
class Factorial{
	static int fact(int n){
		int res = 1;
		for(int i = 2;i<=n;i++){
			res = res*i;
		}
	return res;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		try{
			if(n<0){
				throw new IllegalArgumentException("Please enter a positive number.");
				}
			fact(n);
			System.out.println("Factorial of "+n+" is "+fact(n));
		}
		catch(IllegalArgumentException e){
			System.out.println("Error : "+e.getMessage());
			}
	
	}
}
