import java.util.Scanner;
public class CodeWarsMath {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number. ");
    int user_in = sc.nextInt();
    sc.nextLine();
    user_in.nearestSq();
  }
  //ignore the main method, I wrote it by accident
  public static int nearestSq(final int n){
    if (Math.sqrt(n) % 1 == 0) {
      return n;
    } else {
      int lower = n;
      int upper = n;
      while (Math.sqrt(lower) % 1 != 0) { //done to check if the number is an integer or not
        lower--;
      }
      while (Math.sqrt(upper) % 1 != 0) {
        upper++;
      }
      if (Math.abs(lower - n) > Math.abs(upper - n)) {
        return lower;
      } else {
        return upper;
      }
    }
  }
}