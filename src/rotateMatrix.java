import java.io.*;

// Given an image represented by an NXN matrix 
// where each pixel in the image is 4 bytes, write 
// a method to rotate the image 90 degrees
public class rotateMatrix {
	public static int n;
	public static void main(String[] args) {
		// receive input for size
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		n = 0;
		while(n==0){
			try {
				System.out.println("Enter the size of the matrix:");
				n = Integer.valueOf(input.readLine());
			} catch (Exception e) {
				n = 0;
			}	
		}
		
		// init and print original matrix
		int[][] matrix = new int[n][n];
		int val = 1;
		
		System.out.print("Original matrix:");
		
		for(int i = 0; i<n; i++){
			System.out.println("");
			for(int j = 0; j<n; j++){
				matrix[i][j] = val;
				System.out.print(val + " ");
				val++;
			}
		}

		// print rotated ones
		System.out.print("\nMatrix 90 degrees clockwise:");
		printMatrix(rotateClockwise(matrix));


		System.out.print("\nMatrix 90 degrees counterclockwise:");
		printMatrix(rotateCounterClockwise(matrix));
		
		System.out.println("");
		
	}
	
	/**
	Rotates a NXN integer matrix 90 degrees clockwise
	@param original NxN matrix
	@return rotated NxN matrix
	*/
	public static int[][] rotateClockwise(int[][] matrix) {
		int[][] rotated = new int[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				rotated[i][j] = matrix[n-(j+1)][i];
			}
		}	
		return rotated;
	}

	/**
	Rotates a NXN integer matrix 90 degrees counterclockwise
	@param original NxN matrix
	@return rotated NxN matrix
	*/
	public static int[][] rotateCounterClockwise(int[][] matrix) {
		int[][] rotated = new int[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				rotated[i][j] = matrix[j][n-(i+1)];
			}
		}		
		return rotated;
	}

	
	public static void printMatrix(int[][] matrix){
		for(int i = 0; i<n; i++){
			System.out.println("");
			for(int j = 0; j<n; j++){
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

}
