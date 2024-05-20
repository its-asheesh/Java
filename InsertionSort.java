class InsertionSort{
	public void insertionSort(int arr[]){
	for(int i = 1;i<arr.length;++i){
		int element = arr[i];
		int j = i-1;
	while(j>=0 && arr[j]>element){
	arr[j+1] = arr[j];
	j = j-1;
	}
		arr[j+1] = element;
	}
	}
	static void printArray(int arr[]){
		for(int i =0; i<arr.length;++i){
			System.out.print(arr[i]+" ");
			
		}
	System.out.println();
	}
	public static void main(String args[]){
		int arr[] = {10, 11, 14, 15 , 15, 17 , 19};
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(arr);
		printArray(arr);
	
	}
}
