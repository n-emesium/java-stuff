import java.util.Scanner;
public class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. ");
        int val = sc.nextInt();
        sc.nextLine();
        //implementation greater than two pow
        System.out.println(expand(val));
    }
    public static String expand(int n) {
        String s = largestpow2(n);
        int large = largestnum2(n);
        while (n != 0 && large < n) {
            n -= large;
            s += " + " + largestpow2(n);
            large = largestnum2(n);
        }
        return s;
    }

    public static String largestpow2(int n) {
        String str = "2^";
        int j = 0;
        int c = (int) (Math.pow(2,j));
        while (c <= n) {
            j++;
            c = (int) (Math.pow(2,j));
        }
        str += j - 1;
        return str;
        //error code tested, implemented in o log n time(s);
    }
    public static int largestnum2(int n) {
        int j = 0;
        int c = (int) (Math.pow(2,j));
        while (c <= n) {
            j++;
            c = (int) (Math.pow(2,j));
        }
        c = (int) (Math.pow(2,j-1));
        return c;
    }
}