import java.util.Scanner;
public class pyramid {
    public static void main(String[] consolelog) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines. ");
        int n = sc.nextInt();
        System.out.println();
        print(n);
    }
    public static void for_n(int n) {
        int i = 1;
        while(i <= n) {
            System.out.print(i);
            i++;
        }
        i -= 2;
        while (i > 0) {
            System.out.print(i);
            i--;
        }
        System.out.println();
    }
    public static void print(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for_n(i);
        }
        System.out.println();
    }
}