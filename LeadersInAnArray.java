public class LeadersInAnArray {
    static void leaders(int[] arr){
        int n = arr.length;
        int currLeader = arr[n-1];
        System.out.print(currLeader+" ");
        for (int i = n-2; i >= 0; i--) {
            if(currLeader < arr[i]){
                currLeader = arr[i];
                System.out.print(currLeader+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};
        System.out.print("Leaders from right to left are : ");
        leaders(arr);
    }
}
