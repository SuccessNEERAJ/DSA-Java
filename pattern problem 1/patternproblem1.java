import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for rows of the pattern");
        int n = sc.nextInt();
        int trows = n;
        for(int row = 1; row <= trows; row++){
            for(int crow = 1; crow <= row; crow++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}