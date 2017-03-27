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
				det += Math.pow(-1.0, (double)i) * (mdata[0][i] * subMatrix(0,i).determinant());
			}
		}
		
		return det;
	}
	
	Matrix inverse(){
		
	}
	
	Matrix subMatrix(int row, int col){
		
	}
	
}
