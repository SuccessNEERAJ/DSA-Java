import java.util.Scanner;
public class rotatematrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and column of a square matrix");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the elements in the matrix");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix before the clockwise rotation: ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after 90 degrees clockwise rotation: ");
        for(int col=0; col<n; col++){
            int i = 0;
            int j = n-1;
            while(i<=j){
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
