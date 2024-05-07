import java.util.ArrayList;
import java.util.HashMap;
public class MathUtil {
    private static ArrayList<Integer> runs = new ArrayList<Integer>();
    private static HashMap<Integer,Long> hash = new HashMap<Integer,Long>();
    public static final double PI = 3.14;
    public static final double EUL = 2.78;
    public static int divide(int n, int m) { //n / m integer division
        if (m == 0) {
            throw new ArithmeticException("Division by 0 is not allowed. ");
        }
        int x = 0;
        while (n - m >= 0) {
            n -= m;
            x++;
        }
        return x;
    }
    public static int multiply(int n, int m) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += m;
        }
        return result;
    }
    public static int pow(int n, int m) { //n^m
        if (m == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n;
        }
        return result;
    }
    public static int modulo(int n, int m) {
        return (n % m);
    }
    public static int absoluteVal(int m) {
        if (m < 0) {
            return -1 * m;
        } else {
            return m;
        }
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            if (hash.containsKey(n)) {
                return hash.get(n);
            } else {
                hash.put(n, n * factorial(n - 1));
                return n * factorial(n - 1);
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double mean(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("An array of length 0 cannot have a mean. ");
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
    public static double median(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("An array of length 0 cannot have a median. ");
        }
        sort(arr);
        if (arr.length % 2 == 0) {
            double d1 = (double) arr[arr.length / 2];
            double d2 = (double) arr[arr.length / 2 - 1];
            return (d1 + d2) / 2;
        } else {
            return arr[arr.length / 2];
        }
    }
    public static void sort(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length - arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[arr1.length + i];
        }
        sort(arr1);
        sort(arr2);
        merge(arr1,arr2,arr);
    }
    private static void merge(int[] arr1, int[] arr2, int[] combined) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[k] = arr1[i];
                i++;
            } else {
                combined[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            combined[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            combined[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static boolean sortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean sortedDes(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isMonotonic(int[] arr) {
        if (sortedDes(arr) || sortedAsc(arr)) {
            return true;
        }
        return false;
    }
    public static void transposeMatrix(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new ArithmeticException("Only applicable to square matrixes. ");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int x = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = x;
        }
    }
    public static void swap(int[] arr, int l, int r) {
        int x = arr[l];
        arr[l] = arr[r];
        arr[r] = x;
    }
    public static void swap(String[] arr, int l, int r) {
        String s = arr[l];
        arr[l] = arr[r];
        arr[r] = s;
    }
    public static double getSum(int[] arr) {
        return mean(arr) * arr.length;
    }
    public static int getMult(int[] arr) {
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            x *= arr[i];
        }
        return x;
    }
    public static void shiftArr(int[] arr, int k) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[(i + k) % arr.length] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[i];
        }
    }
    public static int Random(int m, int n) { //inclusive [m,l];
        return (int) (Math.random() * (n - m + 1) + m);
    }
    public static int Simulate(int target, int r1, int r2) {
        int x = 1;
        int n = Random(r1,r2);
        while (n != target) {
            x++;
            n = Random(r1,r2);
        }
        runs.add(x);
        return x;
    }
    public static double runAve() {
        double sum = 0.0;
        for (int i = 0; i < runs.size(); i++) {
            sum += runs.get(i);
        }
        return sum / runs.size();
    }
    public static void resetRuns() {
        int x = runs.size() - 1;
        while (x >= 0) {
            runs.remove(x);
            x--;
        }
    }
    public static ArrayList<Integer> getRuns() {
        return runs;
    }
    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            return gcd(y % x, y);
        }
    }
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x,y);
    }
    public static int[] factors(int n) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        int[] arr = convertArray(divisors);
        sort(arr);
        return arr;
    }
    private static int[] convertArray(ArrayList<Integer> arr) {
        int[] clone = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            clone[i] = arr.get(i);
        }
        return clone;
    }
    public static void timer(double d) {
        try {
            Thread.sleep((long)(d * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
