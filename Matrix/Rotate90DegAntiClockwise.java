public class Rotate90DegAntiClockwise {

    static void transpose(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
            
        }
    }

    static void rotate(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            int low = 0;
            int high = mat.length-1;
            while (low < high) {
                int temp = mat[high][i];
                mat[high][i] = mat[low][i];
                mat[low][i] = temp;
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Original Matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        transpose(mat);
        rotate(mat);
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
