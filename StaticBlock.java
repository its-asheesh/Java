class StaticBlock{
	static{
		System.out.println("First Block Executed");
	}
	public static void main(String[] args){
		System.out.println("MM Executed");
	}
	static{
		System.out.println("Second Block Executed");
	}
}
