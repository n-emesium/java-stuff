import java.util.Scanner;
import java.util.ArrayList;
public class finsquaresum {
    public static ArrayList<Integer> current = new ArrayList<Integer>();
    public static ArrayList<Integer> available = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. ");
        int n = sc.nextInt();
        System.out.println(result(n));
        if (check()) {
            System.out.println("Valid solution. ");
        } else {
            System.out.println("No solution. ");
        }
    }
    public static ArrayList<Integer> result(int n) {
        for (int i = 1; i <= n; i++) {
            available.add(i);
        }
        if (find(n)) {
            return current;
        } else {
            return new ArrayList<Integer>();
        }
    }
    public static boolean find(int n) {
        if (current.size() == n) {
            return true;
        }
        for (int i : new ArrayList<Integer>(available)) {
            if (current.isEmpty() || valid(current.get(current.size()-1) + i)) {
                current.add(i);
                int x = available.indexOf(i);
                available.remove(available.indexOf(i));
                if (find(n)) {
                    return true;
                }
                current.remove(current.size()-1);
                available.add(x,i);
            }
        }
        return false;
    }
    public static boolean valid(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
    public static boolean check() {
        if (current.size() == 0) {
            return false;
        }
        int d = current.get(0) + current.get(1);
        for (int i = 1; i < current.size() - 1; i++) {
            if (!valid(d)) {
                return false;
            }
            d -= current.get(i-1);
            d += current.get(i+1);
        }
        return true;
    }
}