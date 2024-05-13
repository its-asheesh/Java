import java.util.Scanner;
class ReverseOfNumber{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number here: ");
	int num = sc.nextInt();
	int remainder,reverse=0;
	while(num!=0){
	remainder = num%10;
	reverse = reverse*10+remainder;
	num = num/10;
	}
	System.out.println("Reverse of entered number is "+reverse);
	}

}
