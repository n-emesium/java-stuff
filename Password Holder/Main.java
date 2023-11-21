import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input, '-1' to exit. ");
        int d = sc.nextInt();
        while (d != -1) {
            pw.create(d);
            System.out.println("'-1' to exit; otherwise, enter new input. ");
            d = sc.nextInt();
        }
        System.out.println("Printing saved passwords: ");
        pw.print();
    }
}