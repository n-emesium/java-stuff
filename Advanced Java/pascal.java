import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number input. ");
        int n = sc.nextInt();
        System.out.println();
        print(compute(n));
    }
    public static int[][] compute(int val) {
        int[][] matrix = new int[val][val]; 
        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
                }
            }
        }
        return matrix;
    }
    public static void print(int[][] matrix) {
        for (int[] i : matrix) {
            for (int f : i) {
                if (f != 0) {
                    System.out.print(f + " ");
                }
            }
            System.out.println();
        }
    }
}
