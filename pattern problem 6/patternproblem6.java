import java.util.Scanner;
public class patternproblem6 {
    public static void main(String[] args) {
        System.out.println("Enter a odd number greater than 3 to print the butterfly star pattern");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int trows = n;
        int stars = 1;
        int spaces = n-2;
        
        for(int row = 1; row<=trows; row++){
            //work for the current row
            //stars
            for(int cst =1; cst<=stars; cst++){
                System.out.print("*");
            }
            //spaces
            for(int sp =1; sp<=spaces; sp++){
                System.out.print(" ");
            }
            //stars
            int sstars = stars;
            if(row == trows / 2 + 1){
                sstars = stars -1;
            }
            for(int cst =1; cst<=sstars; cst++){
                System.out.print("*");
            }

            //prepare for the next row
            System.out.println();
            if(row <= trows /2){
                stars = stars + 1;
                spaces = spaces - 2;
            }else{
                stars = stars -1;
                spaces = spaces + 2;
            }
        }
    }
}
