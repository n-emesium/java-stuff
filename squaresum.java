
/**
 * Square sums
Write function that, given an integer number N, returns array of integers 1..N arranged in a way, so sum of each 2 consecutive numbers is a square.

Solution is valid if and only if following two criterias are met:

Each number in range 1..N is used once and only once.
Sum of each 2 consecutive numbers is a perfect square.
Example
For N=15 solution could look like this:

[ 9, 7, 2, 14, 11, 5, 4, 12, 13, 3, 6, 10, 15, 1, 8 ]

Verification
All numbers are used once and only once. When sorted in ascending order array looks like this:
[ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 ]

Sum of each 2 consecutive numbers is a perfect square:
   16    16     16     16     16     16     16
   /+\   /+\    /+\    /+\    /+\    /+\    /+\
[ 9, 7, 2, 14, 11, 5, 4, 12, 13, 3, 6, 10, 15, 1, 8 ]
      \+/    \+/    \+/    \+/    \+/    \+/    \+/
       9     25      9     25      9     25      9

9 = 3*3
16 = 4*4
25 = 5*5
If there is no solution, return False (empty vector in C++ ; null in Java).
For example if N=5, then numbers 1,2,3,4,5 cannot be put into square sums row: 1+3=4, 4+5=9, but 2 has no pairs and cannot link [1,3] and [4,5]


Tests constraints:
1 <= N <= 1600
All possible values of N are tested
Brute force solutions can only go up to N=50.
Code size is restricted to 20K max, and external modules are disabled: inlining all results precalculated is not an option.

Have fun!
Simple version of this Kata is here.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class squaresum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input. \n");
        int n = sc.nextInt();
        System.out.println();
        //getlist(n);
        for (int i = 0; i < 10; i++) {
            
        }
    }
    public static ArrayList<Integer> getlist(int n) {
        ArrayList<ArrayList<Integer>> track = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> elements = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            elements.add(i);
        }
        for (int i = 1; i <= n; i++) {
            track.add(new ArrayList<Integer>());
            track.get(i-1).add(i);
        }
        //
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> current = track.get(i); //current arraylist;
            int d = getf(elements, current.get(current.size()-1));
            while (d != -1) {
                current.add(d);
                d = getf(elements, current.get(current.size()-1));
            }
        }
        for (ArrayList<Integer> arr : track) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        return new ArrayList<Integer>();
    }
    public static int getf(ArrayList<Integer> arr, int i) { //i is elem;
        for (int j = 0; j < arr.size(); j++) {
            int cons = arr.get(j);
            if (Math.sqrt(i + cons) % 1 == 0 && cons != i) { //compare double;
                return cons;
            }
        }
        return -1;
    }
    public static void flush(ArrayList<Integer> arr) {
        int i = arr.size()-1;
        while (i >= 0) {
            arr.remove(i);
            i--;
        }
    }
}