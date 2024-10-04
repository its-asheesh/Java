public class MaxLengthEvenOddSubArray {

    static int getMaxLength(int[] arr){
        int res = 1;
        int curr = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)){
                curr++;
                res = Math.max(res,curr);
            }
            else{
                curr = 1;
            }  
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,15};
        int max_length = getMaxLength(arr);
        System.out.println(max_length);
    }
}
