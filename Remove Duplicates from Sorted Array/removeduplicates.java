import java.util.Scanner;
public class removeduplicates{
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of array with some duplicate values but in sorted increasing order: ");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int insert = 1;
        for(int i = 1; i<size; i++){
            if(arr[i-1] != arr[i]){
                arr[insert] = arr[i];
                insert++;
            }
        }
        System.out.println("The number of unique elements in array is: "+insert);
        System.out.print("Unique elements are: ");
        for (int i = 0; i < insert; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}