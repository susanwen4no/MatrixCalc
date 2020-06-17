package basicMatrix;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testBasic() {
		float matrixArray[][] = new float[][] {{1,2,3},{1,2,3}};
		Matrix matrix = new Matrix(matrixArray);
		assertEquals(matrix.getColumnCount(), 3);
		assertEquals(matrix.getRowCount(), 2);
		assertTrue(matrix.matrix[1][1]==2);
		matrix.scalarMultiply(10);
		assertTrue(matrix.matrix[1][2]==30);
	}
	
	@org.junit.Test
	public void testElementaryRowOperations() {
		
	}

}
