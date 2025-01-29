import java.util.*;

class Rotate{
    public static void main(String[] args) {
        int [][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(matrix);
    }
    public static void rotate(int [][] matrix){
        int n= matrix.length;

        // transpose the matrix

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        //rotate  90 degree

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}