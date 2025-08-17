import java.util.ArrayList;
import java.util.Scanner;
public class ArraysIntersection{
    public static void main(String[] args) {
        System.out.println("Enter the first array no. of  elements");
        int count1, count2;
        Scanner sc = new Scanner(System.in);
        count1 = sc.nextInt();
        System.out.println("Enter the second array no. of  elements");
        count2 = sc.nextInt();
        ArrayList <Integer> arr1 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the first array elements in sorted order");
        for(int i =0; i<count1; i++){
            int num1 = sc.nextInt();
            arr1.add(num1);
        }
        System.out.println("Enter the second array elements in sorted order");
        for(int i =0; i<count2; i++){
            int num2 = sc.nextInt();
            arr2.add(num2);
        }
        System.out.println(intersection(arr1, arr2));

    }
    public static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int i = 0;
        int j = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                i++;
            }else if(arr1.get(i) > arr2.get(j)){
                j++;
            }else{
                ans.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return ans;
    }
}