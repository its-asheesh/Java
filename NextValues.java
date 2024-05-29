import java.util.Scanner;
class NextValues{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String Fname = sc.next();
		sc.nextLine();
		System.out.print("Enter Last Name: ");
		String Lname = sc.nextLine();
		System.out.println("\nFirst Name: "+Fname);
		System.out.println("Last Name: "+Lname);
		System.out.println("Is First Name equals to Last Name : "+Lname.equals(""));
	
	}

}
