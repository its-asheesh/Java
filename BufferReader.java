import java.io.*;
class BufferReader{
	public static void main(String[] args)throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Fno.");
	int a = Integer.parseInt(br.readLine());
	System.out.println("Enter Sno.");
	int b = Integer.parseInt(br.readLine());
	int c = a+b;
	System.out.println("Result: "+c);
	}


}
