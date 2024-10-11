public class PrintBoundaryEle {

    static void printBoundaryEle(int[][] arr){
        if(arr.length == 1){
            for (int i = 0; i < arr[i].length; i++) {
                System.out.print(arr[0][i]+"\t ");
            }
            System.out.println();
        }
        else if(arr[0].length == 1){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][0]+"\t ");
            }
            System.out.println();
        }
        else{
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i]+"\t ");
            }
            System.out.println();

            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i][arr[i].length-1]+"\t ");
            }
            System.out.println();

            for (int i = arr[0].length-2; i >= 0 ; i--) {
                System.out.print(arr[arr.length-1][i]+"\t ");
            }
            System.out.println();

            for (int i = arr.length-2; i > 0; i--) {
                System.out.print(arr[i][0]+"\t ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("original Matrix :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t "); 
            }
            System.out.println();
        }

        System.out.println("Boundary Elements : ");
        printBoundaryEle(arr);


    }
}
