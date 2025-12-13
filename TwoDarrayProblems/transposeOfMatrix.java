package TwoDarrayProblems;

import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int rows = sc.nextInt();
         System.out.println("enter the number of cols: ");
        int cols = sc.nextInt();
        int[][] matrix= new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix is: ");
          for(int j=0;j<cols;j++)
        {
            for(int i=0;i<rows;i++)
            {
             System.out.print(matrix[i][j]+" ");   
            }
            System.out.println();
        }
        sc.close();
    }
}
