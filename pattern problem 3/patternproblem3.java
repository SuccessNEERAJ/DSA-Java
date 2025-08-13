import java.util.Scanner;
public class patternproblem3{
    public static void main(String[] args) {
        System.out.println("Enter a odd number for the pattern which is greater than 3");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int trows = n;
        int stars = 1;
        for(int row =1; row<=trows; row++){
            //work for the current row
            for(int cst = 1; cst<=stars; cst++){
                System.out.print("*"); // to write number instead of star, pass cst in System.out.print(cst);
            }
            //prepare for the next row
            System.out.println();
            if(row <= trows / 2){
                stars++;
            }else{
                stars--;
            }
        }

    }
}