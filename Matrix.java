package Matrix;
import java.lang.Math;

public class Matrix {
	
	public int MaxSize = 10;
	
	private int n;
	private double mdata[][] = new double[MaxSize][MaxSize];
	
	
	public Matrix(){
		
	}
	
	//--------------
	//Functions
	//--------------
	
	public Matrix(int size){
		n = size;
	}
	
	//Returns a double representing the determinant of the matrix it was used on
	public double determinant(){
		double det = 0.0;
		
		if(n == 1){
			det = mdata[0][0];
		}
		else if(n == 2){
			det = (mdata[0][0] * mdata[1][1]) - (mdata[0][1] * mdata[1][0]);
		}
		else{
			for(int i = 0; i < n; i++){
				//Math.pow from the math library
				det += Math.pow(-1.0, (double)i) * (mdata[0][i] * subMatrix(0,i).determinant());
			}
		}
		
		return det;
	}
	
	//Returns a matrix representing the the inverse of the original matrix
	Matrix inverse(){
		Matrix inv = new Matrix(n);
		double det = determinant();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				//Math.pow from the math library
				inv.mdata[i][j] = Math.pow(-1.0, (double)i + j) * (subMatrix(j,i).determinant()/det);
			}
		}
		return inv;
	}
	
	//Returns a subMatrix that was derived from the original matrix
	Matrix subMatrix(int r, int c){
		Matrix sub = new Matrix(n - 1);
		
		int row = 0;
		for(int i = 0; i < n; i++)
		{
			if(i==r){continue;}
			
			
			int col = 0;
			for(int j = 0; j < n; j++)
			{
				if (j==c){continue;}
				
				sub.mdata[row][col] = mdata[i][j];
				col++;
			}
			
			row++;
		}
		
		return sub;
	}
	
}










