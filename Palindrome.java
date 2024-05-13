import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number here: ");
	int num = sc.nextInt();
	int remainder,reverse=0,temp = num;
	while(num>0){
	remainder = num%10;
	reverse = reverse*10+remainder;
	num = num/10;
	}
	if(temp==reverse){
	System.out.println("Entered number is a Palindrome.");
	}
	else{
	System.out.println("Entered number is not a Palindrome.");
	}
	}

}
