class StaticVariable{
	static int a = m1();
	static int m1(){
		System.out.println("SV Executed");
	return 10;
	}
	public static void main(String[] args){
		System.out.println("mm Execution Start");
		System.out.println("From mm a: "+a);
		System.out.println("mm Executed");
	}

}
