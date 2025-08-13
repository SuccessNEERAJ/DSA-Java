import java.util.Scanner;
public class patternproblem4 {
    public static void main(String[] args) {
        System.out.println("Enter a odd number for the pattern which is greater than 3");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int trows = n;
        int spaces = n/2;
        int stars = 1;
        for(int row = 1; row <= trows; row++){
            //work for the current row
            for(int csp = spaces; csp>=1; csp--){
                System.out.print(" ");
            }
            for(int cst = 1; cst<= stars; cst++){
                System.out.print("*");
            }
            //prepare for the next row
            System.out.println();
            if(row <=trows/2){
                spaces--;
                stars= stars +2;
            }
            else{
                spaces++;
                stars = stars -2;
            }
        }
    }
}
