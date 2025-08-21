import java.util.Scanner;
public class setmatrixzero {
    public static void main(String[] args) {
        System.out.println("Enter the row and column of a matrix: ");
        int row, column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        int[][] m = new int[row][column];
        System.out.println("Enter the elements of the matrix: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("The current matrix is: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
        boolean isRow = false;
        boolean isColumn = false;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){
                if(m[i][j] == 0){
                    m[i][0] = 0;
                    m[0][j] = 0;
                    if(i == 0){
                        isRow = true;
                    }
                    if(j == 0){
                        isColumn = true;
                    }
                }
            }
        }
        for(int i = 1; i<row; i++){
            for(int j = 1; j<column; j++){
                if(m[i][0] == 0 || m[0][j] == 0){
                    m[i][j] = 0;
                }
            }
        }
        if(isRow){
            for(int i = 0; i<row; i++){
                m[0][i] = 0;
            }
        }
        if(isColumn){
            for(int j = 0; j<column; j++){
                m[j][0] = 0;
            }
        }
        System.out.println("The matrix after modification is: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
