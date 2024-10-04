
public class KadanesAlgo {

    static int findMaxSubArraySum(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(currSum+arr[i], arr[i]);
            maxSum = Math.max(currSum, maxSum);
            
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-3,-1,-2};
        System.out.println(findMaxSubArraySum(arr));

    }
    
}
