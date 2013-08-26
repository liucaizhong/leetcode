package leetcode;

public class RotateImage {

	public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < matrix.length/2; i++){
            for(int j = i; j < matrix[i].length-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}