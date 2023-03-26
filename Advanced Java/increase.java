import java.util.ArrayList;
public class increase {
    public static boolean check(ArrayList<Integer> arr) {
        for (int i = 0; i <= arr.size() - 2; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}