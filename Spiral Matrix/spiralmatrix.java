import java.util.ArrayList;
import java.util.Scanner;
public class spiralmatrix {
    public static void main(String[] args) {
        System.out.println("Enter the row and column of a matrix: ");
        int row, column;
        Scanner sc1 = new Scanner(System.in);
        row = sc1.nextInt();
        column = sc1.nextInt();
        int[][] m = new int[row][column];
        System.out.println("Enter the elements of the matrix: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                m[i][j] = sc1.nextInt();
            }
        }
        System.out.println("The current matrix is: ");
        for(int i =0; i<row; i++){
            for(int j =0 ; j<column; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int sr = 0;
        int ec = column - 1;
        int er = row  - 1;
        int sc = 0;
        int count = row * column;
        while(count > 0){
            for(int i = sc; i <= ec; i++){
                res.add(m[sr][i]);
                count--;
            }
            sr++;
            if(count == 0){
                break;
            }
            for(int i = sr; i<= er; i++){
                res.add(m[i][ec]);
                count--;
            }
            ec--;
            if(count == 0){
                break;
            }
            for(int i = ec; i>=sc; i--){
                res.add(m[er][i]);
                count--;
            }
            er--;
            if(count == 0){
                break;
            }
            for(int i = er; i>= sr; i--){
                res.add(m[i][sc]);
                count--;
            }
            sc++;
            if(count == 0){
                break;
            }
        }
        System.out.print("The Spiral Matrix Representation of elements is: ");
        System.out.print(res);
    }
}
