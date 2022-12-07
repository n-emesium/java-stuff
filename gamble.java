import java.util.*;
public class gamble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess_curve = 0;
        ArrayList<Integer> gamb_list = new ArrayList<Integer>();
        int gamb_value = 0;
        for (int i = 0; i <= 10; i++) {
            gamb_list.add(gamb_value++);
        }
        boolean replay_val = true;
            while (replay_val) {
            while (guess_curve < 3) {
            System.out.println("Please choose a number from the list. ");
            System.out.println(gamb_list);
            Integer user_input = new Integer(sc.nextInt());
            Integer correct_val = new Integer((int) ((Math.random() * 10) + 1));
            System.out.println("You chose: " + user_input + ". and the bot chose: " + correct_val + ". ");
            if (correct_val.equals(user_input)) {
                System.out.println("Congrats! You won! ");
            } else {
                guess_curve++; 
                System.out.println("Aw man, you lost! Better luck next time! ");
                if (guess_curve < 3) {
                    continue;
                } else {
                    replay_val = false;
                }
            }
        }
            System.out.println("Hope you had fun! Want to try again? ");
            String new_replay = sc.next();
            if (new_replay.equals("yes")) {
                System.out.println("You bet! Starting anew! ");
                continue;
            } else {
                System.out.println("Oh well, that's too bad. See you later! ");
                replay_val = false;
            }
            }
    }
}

//simple gambling game