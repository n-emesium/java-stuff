public class mergesort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }
        System.out.println("Printing unsorted array. ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Printing sorted array. ");
        //sort method to be implemented later
        mergesort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        works(arr);
    }
    //sort checker method to see if algo works correctly
    public static void works(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Faulty method! ");
            }
        }
        System.out.println("Method works! Sorting correct! ");
    }
    public static void mergesort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int j = mid; j < arr.length; j++) {
            right[j - mid] = arr[j];
        }
        mergesort(left);
        mergesort(right);
        //merging to be implemented, right now method only recursively breaks down array;
        merge(arr,left,right);
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}