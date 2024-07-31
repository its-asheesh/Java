class PrintPowerSet{
	void powerSet(String str){
		int n = str.length();
		int setSize = (1<<n);
		for(int i=0;i<setSize;i++){
			for(int j=0;j<n;j++){
				if((i&(1<<j))!=0){
				  System.out.print(str.charAt(j));
				}	
			}
			System.out.println("");
		}
	}
	public static void main(String[] args){
		PrintPowerSet p = new PrintPowerSet();
		String s = "abc";
		p.powerSet(s);
	
	}

}
