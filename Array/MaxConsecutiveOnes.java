public class MaxConsecutiveOnes {
    static int maxConsecutiveOnes(int[] arr){
        int res = 0;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                curr++;
                res = Math.max(curr,res);
            }
            else{
                curr = 0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
}
