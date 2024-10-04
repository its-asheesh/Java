public class MaxCircularSubArraySum {
    static int getMaxSum(int[] arr){
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr_max = arr[i];
            int curr_sum = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int idx = (i+j)%2;
                curr_sum += arr[idx];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res,curr_max);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,-2,3,4};
        int max_sum = getMaxSum(arr);
        System.out.println(max_sum); 
    }
}
