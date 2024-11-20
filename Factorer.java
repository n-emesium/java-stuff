import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
public final class Factorer {
    private Factorer() {

    }
    public static ArrayList<Integer> factor(int n) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                hash.add(i);
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>(hash);
        Collections.sort(arr);
        return arr;
    }
    public static ArrayList<Integer> pfactors(int n) {
        ArrayList<Integer> arr = factor(n);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (!prime(arr.get(i))) {
                continue;
            }
            ans.add(arr.get(i));
        }
        return ans;
    }
    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int gcf(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcf(y, x % y);
        }
    }
    public static int lcm(int x, int y) { 
        return x * y / gcf(x, y);
    }
    public static boolean perfs(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
    public static String pfactor(int n) {
        String s = "";
        ArrayList<Integer> arr = pfactors(n);
        reverse(arr);
        while (arr.size() > 0) {
            int x = arr.get(arr.size() - 1);
            int i = 0;
            while (n > 1 && n % x == 0) {
                i++;
                n /= x;
            }
            s += x + "^" + i + " * ";
            arr.remove(arr.size() - 1);
        }
        return s.substring(0, s.length() - 3);
    }
    private static void reverse(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            int x = arr.get(i);
            arr.set(i, arr.get(arr.size() - 1 - i));
            arr.set(arr.size() - 1 - i, x);
        }
    }
    public static boolean isPower(int x, int base) {
        return Math.pow(x, 1.0 / base) % 1 == 0;
    }
    public static int fsum(int n) {
        ArrayList<Integer> arr = factor(n);
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
    public static boolean coprime(int x, int y) {
        return gcf(x, y) == 1;
    }
    public static ArrayList<Integer> findPrimes(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            if (prime(i)) {
                arr.add(i);
            }
        }
        return arr;
    }
    public static boolean pal(int n) {
        String s = n + "";
        int l = 0; 
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static int nfactor(int n) {
        return factor(n).size();
    }
    public static ArrayList<Integer> figen(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        while (arr.get(arr.size() - 1) < n) {
            arr.add(arr.get(arr.size() - 1) + arr.get(arr.size() - 2));
        }
        arr.remove(arr.size() - 1);
        return arr;
    }
    public static int hipow(int n, int p) {
        int x = 0;
        while (n > 1 && n % p == 0) {
            x++;
            n /= p;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for user input
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        // Test the 'factor' method
        System.out.println("All factors: " + factor(n));

        // Test the 'pfactors' method (prime factors)
        System.out.println("Prime factors: " + pfactors(n));
        
        // Test the 'pfactor' method (prime factorization with exponents)
        System.out.println("Prime factorization: " + pfactor(n));
        
        // Test 'isPower' method for checking if n is a power of some base
        System.out.println("Is " + n + " a power of 2? " + isPower(n, 2));
        
        // Test the 'perfs' method (Check if n is a perfect square)
        System.out.println("Is " + n + " a perfect square? " + perfs(n));
        
        // Test the 'fsum' method (sum of factors)
        System.out.println("Sum of factors: " + fsum(n));
        
        // Test 'coprime' method (Check if two numbers are coprime)
        System.out.println("Are " + n + " and 12 coprime? " + coprime(n, 12));
        
        // Test the 'findPrimes' method (Find primes up to n)
        System.out.println("Primes up to " + n + ": " + findPrimes(n));
        
        // Test the 'pal' method (Check if n is a palindrome)
        System.out.println("Is " + n + " a palindrome? " + pal(n));
        
        // Test the 'nfactor' method (Number of factors of n)
        System.out.println("Number of factors: " + nfactor(n));
        
        // Test the 'figen' method (Fibonacci numbers up to n)
        System.out.println("Fibonacci numbers up to " + n + ": " + figen(n));
        
        // Test the 'hipow' method (Highest power of prime factor p in n)
        System.out.println("Highest power of 2 in " + n + ": " + hipow(n, 2));

        // Extra checks: Edge cases
        System.out.println("Is 1 a perfect square? " + perfs(1)); // Should return true
        System.out.println("Prime factors of 1: " + pfactors(1)); // Should return an empty list

        sc.close();
    }
}
