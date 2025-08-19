import java.util.Scanner;
public class wavedisplay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        System.out.println("Enter the number of rows you want in a 2d array: ");
        row = sc.nextInt();
        System.out.println("Enter the number of columns you want in a 2d array: ");
        column = sc.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Enter the elements in 2d array: ");
        for(int r =0; r<arr.length; r++){
            for(int c =0; c<arr[0].length; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        System.out.println("The 2d array in wave form is like this: ");
        for(int r =0; r<arr.length; r++){
            if(r % 2 == 0){
                for(int c =0; c<arr[0].length; c++){
                    System.out.print(arr[r][c] + " ");
                }
            }else{
                for(int c =arr[0].length -1; c>=0; c--){
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }
}