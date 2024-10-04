public class MaxSubArraySum {
    static int getMaxSubArraySum(int[] arr){
        int res = arr[0];
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(curr + arr[i],arr[i]); 
            res = Math.max(res,curr); 
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-3,8,-2,4,-5,6};
        System.out.println(getMaxSubArraySum(arr));
    }
}
