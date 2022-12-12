import java.util.*;
public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> game_opts = new ArrayList<String>();
        game_opts.add("rock");
        game_opts.add("scissors");
        game_opts.add("paper");
        for (String opt : game_opts) {
            System.out.println(opt);
        }
        int guess_amount = 0;
        int guess_limit = 3;
        boolean game_over = false;
        while (!(game_over) && guess_amount < guess_limit) {
            guess_amount++;
            System.out.println("Please choose your option. ");
            String user_input = sc.nextLine().toLowerCase();
            int user_index = game_opts.indexOf(user_input);
            int bot_index = (int) (Math.random() * 3);
            String bot_val = game_opts.get(bot_index);
            System.out.println("You chose " + user_input + ". and the bot chose: " + bot_val + ". ");
            if ((user_index + 1) % 3 == bot_index) {
                System.out.println("You win. ");
            } else if (user_index == bot_index) {
                System.out.println("It's a draw. ");
            } else {
                System.out.println("You lose. ");
            }
            System.out.println("Want to try again? ");
            String play_val = sc.nextLine().toLowerCase();
            if (play_val.equals("yes")) {
                guess_amount = 0;
                System.out.println("Choose rock, paper, or scissors. ");
                continue;
            } else {
                System.out.println("Understood, quitting game. ");
                game_over = true;
            }
        }
    }
}

//simple rock paper scissors game