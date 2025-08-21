import java.util.Scanner;
public class multiplymatrix {
    public static void main(String[] args) {
        System.out.println("Enter the rows and columns of first matrix: ");
        int row1, column1;
        Scanner sc = new Scanner(System.in);
        row1 = sc.nextInt();
        column1 = sc.nextInt();
        int[][] m1 = new int[row1][column1];
        System.out.println("Enter the rows and columns of second matrix. Note: the row of first matrix should be equal to column of second matrix and similarly the column of first matrix should be equal to row of second matrix to perform matrix multiplication");
        int row2, column2;
        row2= sc.nextInt();
        column2 = sc.nextInt();
        int[][] m2 = new int[row2][column2];
        System.out.println("Fill the elements of first matrix: ");
        for(int i = 0; i<row1; i++){
            for(int j = 0; j<column1; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Fill the elements of second matrix: ");
        for(int i = 0; i<row2; i++){
            for(int j = 0; j<column2; j++){
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The first matrix is: ");
        for(int i = 0; i<m1.length; i++){
            for(int j =0; j<m1[0].length; j++){
                System.out.print(m1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The second matrix is: ");
        for(int i = 0; i<m2.length; i++){
            for(int j =0; j<m2[0].length; j++){
                System.out.print(m2[i][j]+ " ");
            }
            System.out.println();
        }
        int[][] ans = new int[row1][column2];
        if(row1 == column2 && column1 == row2){
            for(int i = 0; i<ans.length; i++){
                for(int j = 0; j<ans[0].length; j++){
                    int sum = 0;
                    for(int k = 0; k<column1; k++){
                        int temp = m1[i][k] * m2[k][j];
                        sum = sum + temp;
                    }
                    ans[i][j] = sum;
                }
            }
            System.out.println("The matrix after multiplication is: ");
        for(int i = 0; i<ans.length; i++){
            for(int j =0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
        }
        else{
            System.out.println("The number of rows and column of both matrix doesn't follow the matrix multiplication rule.");
        }
        
    }
}
