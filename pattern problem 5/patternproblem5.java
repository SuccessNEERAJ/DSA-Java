import java.util.Scanner;
public class patternproblem5 {
    public static void main(String[] args) {
        System.out.println("Enter a odd number greater than 3 for pattern");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int frow = 1; frow<=2*n-1; frow++){
            System.out.print("*");

        }
        System.out.println();
        //work for the current row
        int trows = n-1;
        int spaces = 1;
        int stars = n-1;
for(int row = 1; row<=trows; row++){
        //stars
        for(int srow = 1; srow <= stars; srow++ ){
            System.out.print("*");
        }
        //spaces
        for(int sp = 1; sp <= spaces; sp++){
            System.out.print(" ");
        }
        //stars
        for(int srow = 1; srow <= stars; srow++ ){
            System.out.print("*");
        }

        //prep for the next row
        System.out.println();
        stars--;
        spaces += 2;

    }
    }
}
