import java.util.Scanner;
public class probability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements? ");
        int total = sc.nextInt();
        System.out.println("How many elements will be in each group that's selected? ");
        int val = sc.nextInt();
        sc.nextLine();
        System.out.println("Type in 'p' for permutation and 'c' for combination. ");
        String str = sc.nextLine().toLowerCase();
        if (str.equals("c")) {
            //combination
            System.out.println(com(val,total));
        } else {
            //permutation
            System.out.println(perm(val,total));
        }
    }
    public static int fact(int n) {
        int val = 1;
        for (int i = 2; i <= n; i++) {
            val *= i;
        }
        return val;
    }
    public static int com(int n, int r) { //combination
        return (fact(n)) / (fact(r) * fact(n-r));
    }
    public static int perm(int n, int r) { //permutation
        return (fact(n)) / fact(n-r);
    }
}