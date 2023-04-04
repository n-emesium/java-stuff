import java.util.Scanner;
import java.util.ArrayList;
public class memory_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Choose an option: ");
        System.out.println("1. Have a random array generated. ");
        System.out.println("2. Enter inputs yourself. ");
        System.out.println("Enter the number of said choice. ");
        int type = sc.nextInt();
        if (type == 1) {
            System.out.println("How many numbers do you want to see in the array? ");
            sc.nextLine();
            int n = sc.nextInt();
            System.out.println("Understood and what should the lower bound be? ");
            sc.nextLine();
            int lower = sc.nextInt();
            System.out.println("And the upper bound? ");
            sc.nextLine();
            int upper = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int num = (int) ((Math.random() * (upper-lower+1) + lower));
                arr.add(num);
            }
            System.out.println("Now sorting array: ");
            for (int i : sort(arr)) {
                System.out.print(i + ", ");
            }
            System.out.println("Completed. ");
        } else {
            System.out.println("Enter the values, -999999999 to exit. ");
            while (true) {
                System.out.println("...");
                sc.nextLine();
                int val = sc.nextInt();
                if (val == -999999999) {
                    break;
                } else {
                    arr.add(val);
                }
            }
            System.out.println("Now sorting array: ");
            for (int j : sort(arr)) {
                System.out.print(j + ", ");
            }
            System.out.println("Completed. ");
        }
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        }
        ArrayList<Integer> smaller = new ArrayList<Integer>();
        ArrayList<Integer> larger = new ArrayList<Integer>();
        int pivot_index = (int) (Math.random() * arr.size());
        int pivot = arr.get(pivot_index);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > pivot) {
                larger.add(arr.get(i));
            } else if (arr.get(i) == pivot) {
                continue;
            } else {
                smaller.add(arr.get(i));
            }
        }
        smaller = sort(smaller);
        larger = sort(larger);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(smaller);
        result.add(pivot);
        result.addAll(larger);
        return result;
    }
}
