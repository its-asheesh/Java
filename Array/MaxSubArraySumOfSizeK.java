public class MaxSubArraySumOfSizeK {
    static int getMaxSum(int[] arr,int k){
        int res = 0;
        int curr_sum = 0;
        for (int i = 0; i < k; i++) {
            curr_sum += arr[i];
            res = curr_sum;
        }
        for (int i = k; i < arr.length; i++) {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res,curr_sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        int k = 4;
        int max_sum = getMaxSum(arr, k);
        System.out.println(max_sum); 
    }
}
