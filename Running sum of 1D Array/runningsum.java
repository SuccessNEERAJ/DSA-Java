import java.util.ArrayList;
import java.util.Scanner;
public class runningsum{
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter the size of array");
        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        System.out.println("Enter the elements of array");
        for(int i = 0; i<count; i++){
            int num = sc.nextInt();
            arr1.add(num);
        }
        System.out.println(sum(arr1));
    }
    public static ArrayList<Integer> sum (ArrayList<Integer> arr1){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0,arr1.get(0));
        for(int i = 1; i<arr1.size(); i++){
            result.add(result.get(i - 1) + arr1.get(i));
        }
        return result;
    }
}