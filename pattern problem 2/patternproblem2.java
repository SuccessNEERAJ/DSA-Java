import java.util.Scanner;
public class patternproblem2 {
    public static void main(String[] args) {
    System.out.println("Enter the number of rows for the pattern");
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int trows = n;
    int spaces = n -1;
    int stars = 1;
    //work for the current row
    for(int row = 1; row <= trows; row++){
        //work for the spaces
        for(int csp = spaces; csp>=1; csp--){
            System.out.print(" ");
        }
        //work for the stars
        for(int str = 1; str <=stars; str++){
            System.out.print("*");
        }

        //prepare for the next row
        System.err.println();
        spaces--;
        stars = stars +2;

    }
    }
}
