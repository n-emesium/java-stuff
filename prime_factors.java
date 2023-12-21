
import java.util.HashMap;
import java.util.Scanner;
public class prime_factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. ");
        int n = sc.nextInt();
        HashMap<Integer,Integer> hash = pf(n);
        StringBuilder output = new StringBuilder();
        for (int k : hash.keySet()) {
            int val = hash.get(k);
            output.append(k).append("^").append(val).append(" * ");
        }
        if (output.length() > 0) {
            output.setLength(output.length() - 3); // Remove the last " * "
            System.out.println(output);
        } else {
            System.out.println("No prime factors");
        }
    }
    public static HashMap<Integer,Integer> pf(int n) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        while (n % 2 == 0) {
            hash.put(2, hash.getOrDefault(2,0) + 1);
            n /= 2;
        }
        for (int i = 3; i <= n; i += 2) {
                while (n % i == 0) {
                hash.put(i,hash.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        return hash;
    }
}
