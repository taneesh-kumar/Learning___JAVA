import java.util.*;

public class SpiralOrderMatrix {
    public static void PrintSpiralOrderMatrix(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is null");
            return;
        }
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while (top <= bottom && left <= right) {
            for(int i=left; i<=right; i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;

            for(int i=top; i<=bottom; i++){
                    System.out.print(matrix[i][right]+" ");
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }    

            if (left <= right) {
                for(int i=bottom; i>=top; i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }

            
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows of matrix");
        int rows = sc.nextInt();
        System.out.println("Enter no. colms of matrix");
        int colms = sc.nextInt();
        int [][] matrix = new int[rows][colms];

        System.out.println("Enter the matrix Elements");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("You have entered");
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("It's Spiral order is :");
        PrintSpiralOrderMatrix(matrix);

    } 
}