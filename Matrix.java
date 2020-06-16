package basicMatrix;

/**
 * This mutable class is a wrapper around a 2D array to represent
 * the mathematical construct of a matrix, including its operations.
 * 
 * @author Susan Wen
 *
 */
public class Matrix {

	public float matrix[][];
	private int rows, cols;
	
	/**
	 * This is a constructor for a matrix that takes a 2D array of numbers
	 * and makes a deep copy of that array, which represents the matrix.
	 * 
	 * @param matrix
	 */
	public Matrix(float [][] matrix) {

		if(matrix.length == 0) {
			return; // return some sort of exception
		}
		
		rows = matrix.length;
		cols = matrix[0].length;
		this.matrix = new float[rows][cols];
		
		// creates a deep copy of the inputed matrix
		int row = 0;
		for(float[] matrixRow: matrix) {
			int col = 0;
			for(float num: matrixRow) {
				this.matrix[row][col] = num;
				col++;
			}
			row++;
		}	
	}
	
	/**
	 * This is a copy constructor that creates a deep copy of a matrix.
	 * 
	 * @param other -- the other matrix from which this is copied
	 */
	public Matrix(Matrix other) {
		Matrix otherMatrix = new Matrix(other.matrix);
		this.matrix = otherMatrix.matrix;
	}
	
	/**
	 * 
	 * @return int representing the number of rows in the matrix
	 */
	public int getRowCount() {
		return rows;
	}
	
	/**
	 * 
	 * @return int representing the number of columns in the matrix
	 */
	public int getColumnCount() {
		return cols;
	}
	
	/**
	 * 
	 * @param scalar
	 */
	public void scalarMultiply(float scalar) {
		
	}
	
	/**
	 * 
	 */
	public void ref() {
		
	}
	
	/**
	 * 
	 */
	public void rref() {

	}
	
	
}
