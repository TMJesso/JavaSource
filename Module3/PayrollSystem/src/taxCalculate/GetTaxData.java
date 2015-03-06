package taxCalculate;

import java.io.FileNotFoundException;

public class GetTaxData {

	public static void main(String[] args) throws FileNotFoundException {
		payroll.PayrollLib gt = new payroll.PayrollLib();
		String[][] file = new String[10][2];
		file[0][0] = "f:\\Programming\\Payroll\\singleWeekly.csv";
		file[0][1] = "f:\\Programming\\Payroll\\data\\weeklySingleWageBracket.dat";
		
		file[1][0] = "f:\\Programming\\Payroll\\singleBiWeekly.csv";
		file[1][1] = "f:\\Programming\\Payroll\\data\\biWeeklySingleWageBracket.dat";
		
		file[2][0] = "f:\\Programming\\Payroll\\singleSemiMonthly.csv";
		file[2][1] = "f:\\Programming\\Payroll\\data\\semiMonthlySingleWageBracket.dat";
		
		file[3][0] = "f:\\Programming\\Payroll\\singleMonthly.csv";
		file[3][1] = "f:\\Programming\\Payroll\\data\\monthlySingleWageBracket.dat";
		
		file[4][0] = "f:\\Programming\\Payroll\\singleDaily.csv";
		file[4][1] = "f:\\Programming\\Payroll\\data\\dailySingleWageBracket.dat";
		
		file[5][0] = "f:\\Programming\\Payroll\\marriedWeekly.csv";
		file[5][1] = "f:\\Programming\\Payroll\\data\\weeklyMarriedWageBracket.dat";
		
		file[6][0] = "f:\\Programming\\Payroll\\marriedBiWeekly.csv";
		file[6][1] = "f:\\Programming\\Payroll\\data\\biWeeklyMarriedWageBracket.dat";
		
		file[7][0] = "f:\\Programming\\Payroll\\marriedSemiMonthly.csv";
		file[7][1] = "f:\\Programming\\Payroll\\data\\semiMonthlyMarriedWageBracket.dat";
		
		file[8][0] = "f:\\Programming\\Payroll\\marriedMonthly.csv";
		file[8][1] = "f:\\Programming\\Payroll\\data\\monthlyMarriedWageBracket.dat";
		
		file[9][0] = "f:\\Programming\\Payroll\\marriedDaily.csv";
		file[9][1] = "f:\\Programming\\Payroll\\data\\dailyMarriedWageBracket.dat";
		int row = 0, col = 0;
		for (int x = 0; x < file.length; x++) {
		//int x = 5;
			row = gt.getNumberofRows(file[x][0]);
			if (x < 5) {
				col = gt.getNumberofColumns(file[x][0]);
			} else {
				col = gt.getNumberofColumns(file[x][0])+1;
			}
			int[][] allTaxCode = new int[row][col];
			int[][] singleRate = new int[allTaxCode.length][13];
			int[][] marriedRate = new int[allTaxCode.length][13];
			gt.sayOutput("x is : " + x ,1);
			allTaxCode = gt.loadWageBracket(file[x][0], allTaxCode);
			if (x <= 4) {
				singleRate = gt.processWageBracket(allTaxCode, singleRate);
				// this is for testing and debugging only				
				//gt.buildOutput(singleRate, "Single Rate");
				gt.writeWageBracket(singleRate, file[x][1]);
			} else {
				marriedRate = gt.processWageBracket(allTaxCode, marriedRate);
				// this is for testing and debugging only
				//gt.buildOutput(marriedRate, "Married Rate");
				gt.writeWageBracket(marriedRate, file[x][1]);
			}
		}
	}
	
	
	/*
	 * Keep this method for reference for now
	private void myMethod() throws FileNotFoundException {
		practiceLibrary.PayrollLib gt = new practiceLibrary.PayrollLib();
		String filename = "f:\\Programming\\Payroll\\singleWeekly.csv";
		
		double[][] allTaxCode = new double[gt.getNumberofRows(filename)][gt.getNumberofColumns(filename)];
		double[][] singleRate = new double[gt.getNumberofRows(filename)][gt.getNumberofColumns(filename)];
		double[][] marriedRate = new double[gt.getNumberofRows(filename)][gt.getNumberofColumns(filename)];
		allTaxCode = gt.loadWageBracket(filename, allTaxCode);
			
		String newName = "f:\\Programming\\Payroll\\weeklySingleWageBracket.dat";
		gt.writePercent(singleRate, newName);
		newName = "f:\\Programming\\Payroll\\weeklyMarriedWageBracket.dat";
		
		gt.buildOutput(singleRate, "Single Rate");

	}
	*/

}
