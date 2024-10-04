public class SubArrayWithGivenSum {
    static boolean isSubArrayExists(int[] arr, int sum){
        int curr_sum = 0;
        int s = 0;
        for (int e = 0; e < arr.length; e++) {
            curr_sum += arr[e];
            while(sum < curr_sum && s < e-1){
                curr_sum -= arr[s];
                s++;
            }
            if(sum == curr_sum){
                return true;
            }
            
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        int sum = 19;
        System.out.println(isSubArrayExists(arr, sum));
    }
}
