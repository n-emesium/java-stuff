import java.util.Scanner;
import java.util.ArrayList;
public class quick_sort_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> my_arr = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter input value. '-1' to exit the adding process. ");
            int val = sc.nextInt();
            sc.nextLine();
            if (val == -1) {
                break;
            } else {
                my_arr.add(val);
            }
        }
        quick_sort(my_arr);
    }
    public static ArrayList<Integer> quick_sort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        int pivot_index = (int) (Math.random() * arr.size());
        int pivot = arr.get(pivot_index);
        ArrayList<Integer> left_arr = new ArrayList<Integer>();
        ArrayList<Integer> right_arr = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            int element = arr.get(i);
            if (element > pivot) {
                right_arr.add(element);
            } else {
                left_arr.add(element);
            }
        }
        left_arr = quick_sort(left_arr);
        right_arr = quick_sort(right_arr);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.addAll(left_arr);
        result.add(pivot);
        result.addAll(right_arr);
        return result;
    }
}