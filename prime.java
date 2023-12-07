import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-1 to exit. ");
        while (true) {
            System.out.println();
            System.out.println("Enter input. ");
            int d = sc.nextInt();
            if (d == -1) {
                break;
            } else {
                System.out.println("Enter 1 to check if a number is a prime number. ");
                System.out.println("Enter 2 to check for prime numbers below the number you entered. ");
                int f = sc.nextInt();
                if (f == 1) {
                    if (check(d)) {
                        System.out.println("This is a prime number. ");
                    } else {
                        System.out.println("Not a prime number. ");
                    }
                } else {
                    for (int i = 2; i <= d; i++) {
                        if (check(i)) {
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        }
        System.out.println("Program completed. ");
    }
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}