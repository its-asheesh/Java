import java.util.Scanner;
class BinarySearch{
	int binarySearch(int arr[], int l, int r, int x){
	while(l<=r){
	int mid = (l+r)/2;
	if(arr[mid]==x){
	return mid;
		}
	else if(arr[mid]>x){
	r = mid -1;
		}
	else{
	l = mid+1;
		}
	}
	return -1;
	}
	public static void main(String[] args){
	BinarySearch obj = new BinarySearch();
	int arr[] = {1,2,5,6,7,8,9,9};
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int x = sc.nextInt();
	int n = arr.length;
	int result =  obj.binarySearch(arr, 0, n-1 , x);
	if (result == -1){
	System.out.println("Element is not Present.");
		}
	else{
	System.out.println("Element is Present at Index : "+result);
		}
	
	}

}
