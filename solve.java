import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solve {
    private static final List<Integer> squares = new ArrayList<>();
    private static final int MAX_N = 1600;

    static {
        // Precompute squares up to 2*MAX_N (as sum of two numbers <= 2*N)
        int i = 1;
        while (i * i <= 2 * MAX_N) {
            squares.add(i * i);
            i++;
        }
    }

    public static ArrayList<Integer> squareSums(int n) {
        // Initialize current list and available set
        ArrayList<Integer> current = new ArrayList<>();
        Set<Integer> available = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            available.add(i);
        }

        // Start the recursive search
        if (search(n, current, available)) {
            return current;
        } else {
            return new ArrayList<>(); // Return an empty list if no solution
        }
    }

    private static boolean search(int n, ArrayList<Integer> current, Set<Integer> available) {
        if (current.size() == n) {
            return true; // All numbers are used, solution found
        }

        for (Integer num : new HashSet<>(available)) {
            if (current.isEmpty() || isPerfectSquare(current.get(current.size() - 1) + num)) {
                current.add(num);
                available.remove(num);

                if (search(n, current, available)) {
                    return true;
                }

                // Backtrack
                current.remove(current.size() - 1);
                available.add(num);
            }
        }

        return false; // No solution found on this path
    }

    private static boolean isPerfectSquare(int num) {
        return squares.contains(num);
    }

    public static void main(String[] args) {
        int n = 15;
        ArrayList<Integer> result = squareSums(n);
        System.out.println(result);
        if (!result.isEmpty()) {
            System.out.println("Correct solution.");
        } else {
            System.out.println("No solution exists.");
        }
    }
}