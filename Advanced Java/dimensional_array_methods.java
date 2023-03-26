public class dimensional_array_methods
{
	public static void main(String[] args) {
		int[][] my_matris = new int[5][5];
		matris_method_a(my_matris);
		print_array(my_matris);
		System.out.println(largest_val(my_matris));
	}
	public static void matris_method_a(int[][] mat) {
	    for (int i = 0; i < mat.length; i++) {
	        for (int j = 0; j < mat[i].length; j++) {
	            mat[i][j] = (int) (Math.random() * 41 + 10);
	        }
	    }
	}
	public static int largest_val(int[][] mat) {
	    int val = Integer.MIN_VALUE;
	    for (int i = 0; i < mat.length; i++) {
	        for (int j = 0; j < mat[i].length; j++) {
	            if(mat[i][j] > val) {
	                val = mat[i][j];
	            }
	        }
	    }
	    return val;
	}
	public static void print_array(int[][] mat) {
	    for (int i = 0; i < mat.length; i++) {
	        for (int j = 0; j < mat[i].length; j++) {
	            System.out.print(mat[i][j] + "  ");
	        }
	        System.out.println();
	    }
	}
	public int[][] transpose(int[][] arr) {
	    int length = arr.length;
	    int length_2 = arr[0].length;
	    int[][] transposed = new int[length_2][length];
	    for (int i = 0; i < length; i++) {
	        for (int j = 0; j < length_2; j++ {
	            transposed[j][i] = arr[i][j];
	        }
	    }
	    return transposed;
	}
}
