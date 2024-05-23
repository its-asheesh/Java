import java.util.Scanner;
class IsPowOf2{
	static boolean isPow2(int n){
		if(n==0){
			return false;
		}
		while(n!=1){
			if(n%2!=0){
			return false;
			}
			n = n/2;
		}
		return true;
	
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		if(isPow2(n)){
			System.out.println(n+" is of power of 2.");
		}
		else{
			System.out.println(n+" is not of power of 2.");
		}
	
	}

}
