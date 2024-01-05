import java.util.ArrayList;
public class frq {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<Double>();
        arr.add(145.0);
        arr.add(146.5);
        arr.add(146.5);
        arr.add(147.0);
        arr.add(146.0);
        arr.add(148.0);
        arr.add(148.5); 
        System.out.println(rec_change(arr)); //1st function
        System.out.println(turn_w(arr.get(0),rec_change(arr))); //2nd function
        System.out.println(get_w_diff(arr)); //3rd function
    }
    /**
     * 	Write a method getWeightChanges that takes a non-empty ArrayList<Double> weights 
     * and returns an ArrayList<Double> that contains the differences of consecutive numbers 
     * in weights.  For example, if weights contains 145, 146.5, 146.5, 147, 146, 148, 148.5, 
     * then the result returned by getWeightChanges should contain 1.5, 0, 0.5, -1, 2, 0.5 
     * (the size of the ArrayList returned by getWeightChanges is one less than the size of weights.)  
     * Use only one for loop, and no other loops or recursion.

     */
    public static ArrayList<Double> rec_change(ArrayList<Double> arr) {
        ArrayList<Double> diff = new ArrayList<Double>();
        for (int i = 0; i < arr.size() - 1; i++) {
            diff.add(arr.get(i+1)-arr.get(i));
        }
        return diff;
    }
    /**
     *  	Write a method getWeights that is inverse to the getWeightChanges method from Part (a). 
     *  getWeights takes an initial weight (a double) and an ArrayList<Double> weightChanges and returns an ArrayList<Double> weights. 
     *  For example, if the initial weight is 145, and weightChanges contains 1.5, 0, 0.5, -1, 2, 0.5, 
     * the result returned by getWeights should contain 145, 146.5, 146.5, 147, 146, 148, 148.5. 
     *  Use only one “for each” loop, and no other loops or recursion.

     */
    public static ArrayList<Double> turn_w(double d, ArrayList<Double> diff) { //d is initial weight here;
        ArrayList<Double> wts = new ArrayList<Double>();
        wts.add(d);
        for (double f : diff) {
            wts.add(d + f);
            d += f;
        }
        return wts;
    }
    /**
     * (c)    	Write a method getWeightRuns that takes a non-empty ArrayList<Double> weights
     *  that are not all equal and returns an ArrayList<Double> weightRuns.  
     * This method should detect contiguous runs of increasing (or same) and decreasing (or same) numbers in weights, 
     * calculate the total change of weight for each run (the last number minus the first number in the run) and append the 
     * result to weightRuns.  For example, if weights contains 145, 146.5, 146.5 147, 146, 148, 148.5, 
     * then weights has three increasing/decreasing runs:
 
               	145, 146.5, 146.5 147
               	147, 146
               	146, 148, 148.5
                Differences of elements in the arraylist: (1.5, 0, 0.5, -1, 2, 0.5)
                   So getWeightRuns should return an ArrayList that contains 2, -1, 2.5.  
                   Use only one for loop, and no other loops or recursion.


     */
    public static ArrayList<Double> get_w_diff(ArrayList<Double> wts) {
        ArrayList<Double> delta = new ArrayList<Double>();
        ArrayList<Double> diffs = new ArrayList<Double>(rec_change(wts)); //records weight changes;
        //diffs = [1.5, 0, 0.5, -1, 2, 0.5]
        double curr = diffs.get(0);
        for (int i = 0; i < diffs.size()-1; i++) {
            if (same_sign(diffs,i)) {
                curr += diffs.get(i+1);
            } else {
                delta.add(curr);
                curr = diffs.get(i+1);
            }
        }
        delta.add(curr);
        return delta;
    }
    public static boolean same_sign(ArrayList<Double> arr, int i) {
        if (arr.get(i) >= 0 && arr.get(i+1) >= 0) {
            return true;
        } else if (arr.get(i) <= 0 && arr.get(i+1) <= 0) {
            return true;
        } else {
            return false;
        }
    }
}