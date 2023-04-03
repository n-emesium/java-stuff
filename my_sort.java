import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class my_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter integers separated by spaces, then press enter:");
        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            arr.add(val);
        }
        Collections.sort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static int mul(ArrayList<Integer> arr) {
        int result = 1;
        for (int i : arr) {
            result *= i;
        }
        return result;
    }
    public static int largest(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static boolean duplicate(ArrayList<Integer> arr, int n) {
        for (int i : arr) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return arr;
        }
        int n = mul(arr);
        int j = 0;
        for (int i = 1; i <= largest(arr); i++) {
            if (n % i == 0) {
                if (arr.indexOf(i) != -1) {
                    arr.set(j,i);
                    j++;
                    if (duplicate(arr, i)) {
                        arr.set(j,i);
                    }
                }
            }
        }
        return arr;
    }
}