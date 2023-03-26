import java.util.*;
public class get_median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid;
        ArrayList<Integer> median_array = new ArrayList<Integer>();
        boolean over = false;
        while (!over) {
            System.out.println("Add number. Enter -1 to exit the process. ");
            int user_input = sc.nextInt();
            if (user_input == -1) {
                over = true;
            }
            median_array.add(user_input);
        }
        //incomplete
    }
}
