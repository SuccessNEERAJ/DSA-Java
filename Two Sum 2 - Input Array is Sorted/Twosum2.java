import java.util.Scanner;
public class Twosum2 {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the target value which will add up to sum: ");
        int target = sc.nextInt();
        System.out.println("Enter the elements in the array in ascending sorted order including which sums up to the target value: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = new int[2];
        int i = 0;
        int j = size - 1;
        while (i<j){
            if(arr[i] + arr[j] == target){
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
            else if(arr[i] + arr[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("The elements of index which add up to the target value is: ");
        for(int n = 0 ; n < 2; n++){
            System.out.print(res[n]+ " ");
        }
    }
}
