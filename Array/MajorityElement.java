public class MajorityElement {
    
    static int getMajorityElement(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            if(count > arr.length/2){
                return i;
            }    
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,1,4,1,5};
        int majority_element = getMajorityElement(arr);
        System.out.println(majority_element); 
    }
}
