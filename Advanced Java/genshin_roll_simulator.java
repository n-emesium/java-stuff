import java.util.*;

public class genshin_roll_simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> five_star_characters = new ArrayList<String>();
        int pity = 0;
        int fivestar = (int) (roller.get_random());
        System.out.println("Type in the character you want: ");
        String user_in = sc.nextLine();
        while (true) {
            System.out.println("1 or 10 pull? ");
            int user_pull = sc.nextInt();
            sc.nextLine(); // consume the newline character
            for (int i = 0; i < user_pull; i++) {
                if (roller.get_random() <= 0.6) {
                    System.out.println("You got: " + user_in);
                    five_star_characters.add(user_in);
                    System.out.println("Would you like to continue? ");
                    String user_cont = sc.nextLine().toLowerCase();
                    if (user_cont.equals("yes")) {
                        System.out.println("Understood, will restart. ");
                        pity = 0;
                        fivestar = (int) (roller.get_random());
                        break;
                    } else {
                        System.out.println("Understood, quitting. ");
                    }
                } else {
                    pity++;
                    if (pity == 90) {
                        System.out.println("You got: " + user_in);
                        five_star_characters.add(user_in);
                        System.out.println("Would you like to continue? ");
                        String user_cont = sc.nextLine().toLowerCase();
                        if (user_cont.equals("yes")) {
                            System.out.println("Understood, will restart. ");
                            pity = 0;
                            fivestar = (int) (roller.get_random());
                            break;
                        } else {
                            System.out.println("Understood, quitting. ");
                        }
                    }
                }
            }
            if (pity < 90) {
                System.out.println("Tough luck, wanna go again? ");
                String user_inp = sc.nextLine().toLowerCase();
                if (user_inp.equals("yes")) {
                    System.out.println("Understood, will restart. ");
                    
                } else {
                    System.out.println("Understood, quitting. ");
                }
            } else {
                break; // add this break statement to exit the while loop when pity reaches 90
            }
        }
        // prompt user to print the list of five-star characters
        System.out.println("Do you want to print the list of five-star characters you rolled? ");
        String user_print = sc.nextLine().toLowerCase();
        if (user_print.equals("yes")) {
            System.out.println("List of five-star characters: ");
            roller.five_star_list(five_star_characters);
        } else {
            System.out.println("Understood, quitting. ");
        }
    }
}

class roller {
    public static double get_random() {
        return Math.random();
    }
    public static void five_star_list(ArrayList<String> arr) {
        for (String delta : arr) {
            System.out.println(delta);
        }
    }
}