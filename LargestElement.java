class LargestElement{
	static int getLargest(int arr[]){
		int res = 0;
		for(int i=1; i<arr.length; i++){
			if(arr[i]>arr[res]){
				res = i;
			}
		}
		return res;
	}
	public static void main(String[] args){
		int arr[] = {1,23,4,5,10,25};
		int ans = getLargest(arr);
		System.out.println("Largest element in the array is "+arr[ans]);
	
	}

}
