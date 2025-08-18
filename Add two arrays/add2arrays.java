import java.util.ArrayList;
import java.util.Scanner;
public class add2arrays{
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count1, count2;
        System.out.println("Enter the size of first array");
        count1 = sc.nextInt();
        System.out.println("Enter the size of second array");
        count2 = sc.nextInt();
        System.out.println("Enter the elements in first array");
        for(int i = 0; i < count1; i++){
            int num1 = sc.nextInt();
            arr1.add(num1);
        }
        System.out.println("Enter the elements in second array");
        for(int i = 0; i < count2; i++){
            int num2 = sc.nextInt();
            arr2.add(num2);
        }
        System.out.println(addition(arr1, arr2));

    }
    public static ArrayList<Integer> addition(ArrayList<Integer> arr1, ArrayList<Integer>arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr1.size() -1;
        int j = arr2.size() -1;
        int carry = 0;
        while(i>= 0 || j>=0){
            int sum = 0;
            if(i>=0){
                sum = sum + arr1.get(i);
            }
            if(j >= 0){
                sum = sum + arr2.get(j);
            }
            sum = sum + carry;
            int rem = sum % 10;
            carry = sum / 10;
            ans.add(0,rem);
            i--;
            j--;

        }
        if(carry != 0){
            ans.add(0,carry);
        }
        return ans;
    }
}