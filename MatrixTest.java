package Matrix;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		testDeterminant();
	}
	
	@Test
	public void testDeterminant(){
		Matrix testMatrix = new Matrix(3);
		double [][] matrix = new double [3][3];
		
		
		matrix[0][0] = 5;
		matrix[0][1] = 4;
		matrix[0][2] = 3;
		matrix[1][0] = 6;
		matrix[1][1] = 9;
		matrix[1][2] = 1;
		matrix[2][0] = 2;
		matrix[2][1] = 5;
		matrix[2][2] = 3;
		
		assertEquals(82.0, testMatrix.determinant(), 0.001);
		
	}

	@Test
	public void testInverse()
	{
		Matrix testMatrix = new Matrix(3);
		double [][] in = new double [3][3];
		
		in[0][0] = 5;
		in[0][1] = 1;
		in[0][2] = 2;
		in[1][0] = 7;
		in[1][1] = -3;
		in[1][2] = 2;
		in[2][0] = 8;
		in[2][1] = -3;
		in[2][2] = 4;
		
		double[][] correct = new double[3][3];
		
		correct[0][0] = 0.167;
		correct[0][1] = 0.278;
		correct[0][2] = -0.2;
		correct[1][0] = 0.33;
		correct[1][1] = -0.11;
		correct[1][2] = -0.11;
		correct[2][0] = -0.083;
		correct[2][1] = -0.6389;
		correct[2][2] = 0.61;
		
		
		fail("Implementation not finished");
	}
	
	@Test
	public void testSubMatrix()
	{
		fail("Not yet implemented");
	}
}
