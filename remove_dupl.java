import java.util.ArrayList;

public class remove_dupl {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(3);
        arr1.add(3);
        arr1.add(4);
        arr1.add(3);
        arr1.add(5);
        arr1.add(6);
        
        System.out.println("Original ArrayList 1: ");
        System.out.println(arr1);
        ArrayList<Integer> modifiedArr1 = del(arr1);
        System.out.println("Modified: ");
        System.out.println(modifiedArr1);
        debugDuplicates(modifiedArr1);
        
        
        // Test Case 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(1);
        arr2.add(2);
        arr2.add(2);
        arr2.add(3);
        
        System.out.println("\nOriginal ArrayList 2: ");
        System.out.println(arr2);
        ArrayList<Integer> modifiedArr2 = del(arr2);
        System.out.println("Modified: ");
        System.out.println(modifiedArr2);
        debugDuplicates(modifiedArr2);

        
        // Test Case 3
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(5);
        arr3.add(5);
        arr3.add(5);
        arr3.add(5);
        
        System.out.println("\nOriginal ArrayList 3: ");
        System.out.println(arr3);
        ArrayList<Integer> modifiedArr3 = del(arr3);
        System.out.println("Modified: ");
        System.out.println(modifiedArr3);
        debugDuplicates(modifiedArr3);
    }

    public static ArrayList<Integer> del(ArrayList<Integer> arr) {
        ArrayList<Integer> copy = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (!cntd(copy, arr.get(i))) {
                copy.add(arr.get(i));
            }
        }
        return copy;
    }

    public static boolean cntd(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n) {
                return true;
            }
        }
        return false;
    }

    public static void debugDuplicates(ArrayList<Integer> modifiedArr) {
        for (int i : modifiedArr) {
            if (cntd(modifiedArr, i)) {
                System.out.println("Duplicate found in modified ArrayList: " + i);
            }
        }
    }
}

//code debugged;
//exit process 0;