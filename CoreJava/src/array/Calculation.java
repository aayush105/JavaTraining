package array;

public class Calculation {

	public static void main(String[] args) {
		int mat1[][] = {{16,23,23},{2,3,4},{34,32,23}};
		int mat2[][] = {{34,45,33},{6,7,8},{21,22,23}};
		
		int mat3[][] = new int[3][3];
		
		// addition
		
		for (int i = 0; i<3; i++ ) {
			for (int j = 0; j<3; j++ ) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
