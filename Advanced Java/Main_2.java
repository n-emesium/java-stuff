import java.util.ArrayList;
public class Main_2
{
	public static void main(String[] args) {
        ArrayList<baseball_player> roster = new ArrayList<baseball_player>();
        roster.add(new baseball_player("Doug",2 ,4));
        roster.add(new baseball_player("Sam",3 ,4));
        roster.add(new baseball_player("Chase",2 ,4));
        roster.add(new baseball_player("Brody",3 ,4));
        roster.add(new baseball_player("Tom",1 ,3));
        roster.add(new baseball_player("Triston",2 ,3));
        roster.add(new baseball_player("Larry",1 ,3));
        roster.add(new baseball_player("Charlie",1 ,3));
        roster.add(new baseball_player("Chaser",2 ,3));
        System.out.println(findTeamAverage(roster));
        System.out.println(find_team_average_2(roster));
        System.out.println(find_highest_average(roster));
	}
	public static double findTeamAverage(ArrayList<baseball_player> arr) {
	    int total_hits = 0;
	    int total_at_bats = 0;
	    for (int i = 0; i < arr.size(); i++) {
	        total_hits += arr.get(i).getHits();
	        total_at_bats += arr.get(i).getAtBats();
	    }
	    if (total_at_bats == 0) {
	        return 0;
	    } else {
	        return (double) total_hits / total_at_bats;
	    }
	}
	public static double find_team_average_2(ArrayList<baseball_player> arr) {
	    int total_hits = 0;
	    int total_at_bats = 0;
	    for (baseball_player val : arr) {
	        total_hits += val.getHits();
	        total_at_bats += val.getAtBats();
	    }
	    if (total_at_bats == 0) {
	        return 0;
	    } else {
	        return (double) total_hits / total_at_bats;
	    }
	}
	public static double find_team_average_3(ArrayList<baseball_player> arr) {
	    int total_hits = 0;
	    int total_at_bats = 0;
	    int index = 0;
	    while (index < arr.size()) {
	        total_hits += arr.get(index).getHits();
	        total_at_bats += arr.get(index).getAtBats();
	        index++;
	    }
	    if (total_at_bats == 0) {
	        return 0;
	    } else {
	        return (double) total_hits / total_at_bats;
	    }
	}
	public static baseball_player find_highest_average(ArrayList<baseball_player> arr) {
	    baseball_player best_player = arr.get(0);
	    for (int i = 1; i < arr.size(); i++) {
	        if (arr.get(i).getBattingAverage() > best_player.getBattingAverage()) {
	            best_player = arr.get(i);
	        }
	    }
	    return best_player;
	}
}
