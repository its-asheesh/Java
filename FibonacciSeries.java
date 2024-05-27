import java.util.Scanner; 
import java.io.*;
class FibonacciSeries{
	static int fibonacciSeries(int n ){
		int a = 0;
		int b = 1;
		
		for(int i = 0; i < n ; i++){
			System.out.print(a+" ");
			int c = a + b;
			a = b;
			b = c;
			}
		return 0;
		}
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the range : ");
	int n = sc.nextInt();
	System.out.print("Fibonacci Series is : ");
	fibonacciSeries(n);
	}


}
