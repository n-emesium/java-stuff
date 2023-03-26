import java.util.Scanner;
import java.util.ArrayList;

public class mean_and_deviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> user_nums = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter a number to add to the arraylist. '-1' to exit the array. ");
            int user_in = sc.nextInt();
            sc.nextLine();
            if (user_in != -1) {
                user_nums.add(user_in);
            } else {
                break;
            }
        }
        double sum = 0;
        for (int v : user_nums) {
            sum += v;
        }
        double mean = sum / user_nums.size();
        double deviationSum = 0;
        for (int i = 0; i < user_nums.size(); i++) {
            double deviation = user_nums.get(i) - mean;
            deviationSum += deviation * deviation;
        }
        double variance = deviationSum / user_nums.size();
        double standardDeviation = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + standardDeviation);
    }
}
