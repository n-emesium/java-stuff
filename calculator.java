import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times will you use the calculator? ");
        int user_val = sc.nextInt();
        for (int i = 0; i < user_val; i++) {
            System.out.println("Choose a number. ");
            Double user_num_1 = new Double(sc.nextDouble());
            System.out.print("Which operation do you want to perform? ");
            String operator = sc.next();
            System.out.println("You have chosen: " + operator);
            System.out.println("Now choose another number. ");
            Double user_num_2 = new Double(sc.nextDouble());
            switch (operator) {
                case "+":
                System.out.println(user_num_1 + user_num_2);
                continue;
                case "*":
                System.out.println(user_num_1 * user_num_2);
                continue;
                case "-":
                    System.out.println(user_num_1 - user_num_2);
                    continue;
                case "/":
                    System.out.println(user_num_1 / user_num_2);
                    continue;
                case "**":
                    System.out.println("Power or Root? ");
                    String pow_ro = new String(sc.next());
                    if (pow_ro.equals("Root")) {
                        System.out.println(Math.pow(user_num_1,1.0/user_num_2));
                        continue;
                    } else {
                        System.out.println(Math.pow(user_num_1,user_num_2));
                        continue;
                    }

                }
            }
        }
    }
