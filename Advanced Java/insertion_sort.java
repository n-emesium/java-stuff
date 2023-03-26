import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements will your array be? ");
        int arrLength = sc.nextInt();
        sc.nextLine();
        int[] user_arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter an element. Your input will be taken until the array length is reached. ");
            int val = sc.nextInt();
            user_arr[i] = val;
            sc.nextLine();
        }
        insertion_sort(user_arr);
        for (int i : user_arr) {
            System.out.print(i + ", ");
        }
    }
    public static void insertion_sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}