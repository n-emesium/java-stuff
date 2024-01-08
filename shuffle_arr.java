public class shuffle_arr {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Starting shuffle. ");
        System.out.println();
        System.out.println("///////");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int[] arr = generate();
            System.out.println("Original array is: ");
            printf(arr);
            randomize(arr);
            System.out.println();
            System.out.println("Shuffled array: ");
            printf(arr);
            System.out.println();
            System.out.println("///////");
            System.out.println();
        }
        System.out.println();
        System.out.println("Finished code. ");
        System.out.println();
    }
    public static void printf(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void randomize(int[] arr) {
        int index = arr.length - 1;
        while (index >= 0) {
            int x = (int) (Math.random() * (index + 1));
            swap(arr,x,index);
            index--;
        }
    }
    public static void swap(int[] arr, int l, int f) { //l and f are indexes, not elements;
        int x = arr[l];
        arr[l] = arr[f];
        arr[f] = x;
    }
    public static int[] generate() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}