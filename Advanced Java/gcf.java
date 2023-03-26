import java.util.Scanner;
public class gcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value. ");
        int num_1 = sc.nextInt();
        sc.nextLine();
        int num_2 = sc.nextInt();
        sc.nextLine();
        int max_num;
        int min_num;
        if (num_1 > num_2) {
            max_num = num_1;
            min_num = num_2;
        } else {
            max_num = num_2;
            min_num = num_1;
        }
        System.out.println("The gcf is: " + euclidean(max_num, min_num));
    }
    //declaration of the euclidean method for determining the gcf between two numbers. the two numbers must be checked for their size's comparison to further exemplify the algorith. 
    public static int euclidean(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return euclidean(b, a % b);
        }
    }
}
