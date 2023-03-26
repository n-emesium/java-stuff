/******************************************************************************

                            Sure, here's another Java programming question:

Write a program that reads in a list of integers from the user and outputs the second smallest number in the list.

For example, if the user enters the list of integers [5, 10, 15, 20, 25], the program should output:
Second smallest number: 10

*******************************************************************************/
import java.util.*;
public class second_smallest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> user_arr = new ArrayList<Integer>();
		while (true) {
            System.out.println("Enter a number to add to the arraylist. '-1' to exit the array. ");
            int user_in = sc.nextInt();
            sc.nextLine();
            if (user_in != -1) {
                user_arr.add(user_in);
            } else {
                break;
            }
        }
        for (int i = 1; i < user_arr.size()-1; i++) {
            int j = i - 1;
            int key = user_arr.get(i);
            while (j >= 0 && user_arr.get(j) > key) {
                user_arr.set(j+1,j);
                j--; 
            }
            user_arr.set(j+1,key);
        }
        System.out.println(user_arr.get(1));
	}
}
