package basicMatrix;

/**
 * This mutable class is a wrapper around a 2D array to represent
 * the mathematical construct of a matrix, including its operations.
 * The class uses zero-based indexing with the first row as row zero and
 * the first column as column zero.
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
			throw new DimensionCompatibilityException("Need viable matrix");
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
	 * Get the number of rows in the matrix.
	 * 
	 * @return int representing the number of rows in the matrix
	 */
	public int getRowCount() {
		return rows;
	}
	
	/**
	 * Get the number of columns in the matrix.
	 * 
	 * @return int representing the number of columns in the matrix
	 */
	public int getColumnCount() {
		return cols;
	}
	
	/**
	 * Apply the scalar multiplication operation to the matrix.
	 * 
	 * @param scalar -- float by which the matrix is multiplied
	 */
	public void scalarMultiply(float scalar) {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				matrix[row][col] = scalar * matrix[row][col];
			}
		}
	}
	
	/**
	 * Apply the elementary row operation of multiplying a row
	 * by a given number.
	 * 
	 * @param row -- row to which the operation is applied
	 * @param multiple -- number row is multiplied by
	 */
	public void rowMultiply(int row, float multiple) {
		// TO DO
	}
	
	/**
	 * Apply the elementary row operation of switching the rows given.
	 * 
	 * @param rowA -- first given row
	 * @param rowB -- second given row
	 */
	public void rowSwitch(int rowA, int rowB) {
		if(rowA >= rows || rowB >= rows) {
			return; // UHHHHH THROW EXCEPTION?
		}
		
		float[] copyA = matrix[rowA]; // this is shallow so it doesnt work
		matrix[rowA] = matrix[rowB];
		matrix[rowB] = copyA;
	}
	
	/**
	 * Apply the elementary row operation of adding a row to another.
	 * Add rowB to rowA.
	 * 
	 * @param rowA -- row that is added to
	 * @param rowB -- row that is added
	 */
	public void rowAdd(int rowA, int rowB) {
		if(rowA >= rows || rowB >= rows) {
			return; // UHHHHH THROW EXCEPTION?
		}
		
		for(int col = 0; col < cols; col++) {
			matrix[rowA][col] = matrix[rowA][col] + matrix[rowB][col];
		}
	}
	
	/**
	 * Reduce the matrix to row echelon form.
	 */
	public void ref() {
		// TO DO
	}
	
	/**
	 * Reduce the matrix to reduced row echelon form. 
	 */
	public void rref() {
		// TO DO
	}
	
	
	/**
	 * Find the dot product of matrix A with matrix B.
	 * 
	 * @param A -- first matrix in the operation
	 * @param B -- second matrix in the operation
	 * @return matrix representing the dot product
	 */
	public static Matrix dot(Matrix A, Matrix B) {
		if(A.rows != B.rows || A.cols != B.cols) {
			throw new DimensionCompatibilityException(
					"Dimensions must match for dot products");
		}
		
		float[][] dotProd = new float[A.rows][A.cols];
		for(int row = 0; row < A.rows; row++) {
			for(int col = 0; col < A.cols; col++) {
				dotProd[row][col] = A.matrix[row][col] * B.matrix[row][col];
			}
		}
		
		return new Matrix(dotProd);
	}
	
	/**
	 * Multiply matrix A with matrix B in that order.
	 * 
	 * @param A -- first matrix in the operation
	 * @param B -- second matrix in the operation
	 * @return matrix representing the product
	 */
	public static Matrix multiply(Matrix A, Matrix B) {
		return null; // TO DO
	}
	
	
}
