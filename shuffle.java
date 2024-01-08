import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("How many elements do you want to add to your array? ");
        int val = sc.nextInt();
        System.out.println("What's the lower bound of numbers? ");
        int low = sc.nextInt();
        System.out.println("What's the upper bound of numbers? ");
        int up = sc.nextInt();
        for (int i = 0; i < val; i++) {
            int x = (int) (Math.random() * (up - low + 1) + low);
            arr.add(x);
        }
        //shuffle to be implemented here
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Now shuffling these elements! ");
        System.out.println();
        System.out.println();
        shuffle(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void shuffle(ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        copy(arr,temp);
        for (int i = 0; i < arr.size(); i++) {
            int val = (int) (Math.random() * temp.size());
            arr.set(i,arr.get(val));
            temp.remove(i);
        }
    }
    public static void copy(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for (int i = 0; i < arr1.size(); i++) {
            arr2.set(i,arr1.get(i));
        }
    }
}