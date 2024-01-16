import java.util.Scanner;
public class frqcont {
    public static void main(String[] args) {
        
        //Driver Code 1:
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter input for rows. ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter input for character. ");
        String ch = sc.nextLine();
        System.out.println();
        pyramid p1 = new pyramid(n,ch);
        p1.printstar();
        */
        
        //Driver Code 2:
        /*matrix m1 = new matrix(5,5,"x","o");
        System.out.println();
        m1.printchecker();
        System.out.println();
        */

        //Driver Code 3:
        //System.out.println(gcf(12,36));
    }
    public static int gcf(int n, int m) {
        //gcf(a,b) = gcf(a-b,b) ? a > b;
        if (m == 0) {
            return n;
        } else {
            return gcf(m, n % m);
        }
    }
}

class pyramid {
    private int rows;
    private String c;
    public pyramid() {
        rows = 0;
        c = "*";
    }
    public pyramid(int n, String cha) {
        rows = n;
        c = cha;
    }
    public void printstar() {
        int limit = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= limit; j++) {
                System.out.print(c);
            }
            limit += 2;
            System.out.println();
        }
    }
}

class matrix {
    private int rows;
    private int columns;
    private String c1;
    private String c2;
    public matrix() {
        rows = 0;
        columns = 0;
        c1 = "";
        c2 = "";
    }
    public matrix(int r, int c, String s1, String s2) {
        rows = r;
        columns = c;
        c1 = s1;
        c2 = s2;
    }
    public void printchecker() {
        String[] c_arr = new String[2];
        c_arr[0] = c1;
        c_arr[1] = c2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i % 2 == 0) {
                    System.out.print(c_arr[(j - 1) % 2]);
                } else {
                    System.out.print(c_arr[j % 2]);
                }
            }
            System.out.println();
        }
    }
}