package morePractice;

public class Example8_6 {

	public static void main(String[] args) {
		practiceLibrary.Lab4Lib mm = new practiceLibrary.Lab4Lib();
		double[][] matrixA = 
				{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		double[][] matrixB = 
				{
				{0, 2.0, 4.0},
				{1, 4.5, 2.2},
				{1.1, 4.3, 5.2}};
		double[][] matrixC = mm.multiplyMatrix(matrixA, matrixB);
		mm.buildOutput(matrixC, "Multipy 3 x 3 Matrix");

		
		
		double[][] matrixD = 
			{
			{1.0, 2.0, 3.0},
			{4.0, 5.0, 6.0},
			{7.0, 8.0, 9.0}};
	double[][] matrixE = 
			{
			{0.0, 2.0, 4.0},
			{1.0, 4.5, 2.2},
			{1.1, 4.3, 5.2}};
	double[][] matrixF = mm.addMatrix(matrixD, matrixE);
	mm.buildOutput(matrixF, "Add 3 x 3 Matrix");

	}
}
