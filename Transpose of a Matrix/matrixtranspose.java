import java.util.Scanner;
public class matrixtranspose{
    public static void main(String[] args) {
        System.out.println("Enter the row and column of a 2D matrix");
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        int[][] arr1 = new int[row][column];
        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<arr1.length; i++){
            for(int j =0; j<arr1[0].length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix before the transpose: ");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after transpose: ");
        int[][] ans = new int[column][row];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j<arr1[0].length; j++){
                ans[j][i] = arr1[i][j];
            }
        }
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }

    }
}