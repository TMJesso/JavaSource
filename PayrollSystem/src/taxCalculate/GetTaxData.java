package taxCalculate;

import java.io.FileNotFoundException;

public class GetTaxData {

	public static void main(String[] args) throws FileNotFoundException {
			payroll.PayrollLib gt = new payroll.PayrollLib();
		String[][] file = new String[10][2];
		file[0][0] = "Payroll/xls/singleWeekly.csv";
		file[0][1] = "Payroll/tax/weeklySingleWageBracket.dat";
		
		file[1][0] = "Payroll/xls/singleBiWeekly.csv";
		file[1][1] = "Payroll/tax/biWeeklySingleWageBracket.dat";
		
		file[2][0] = "Payroll/xls/singleSemiMonthly.csv";
		file[2][1] = "Payroll/tax/semiMonthlySingleWageBracket.dat";
		
		file[3][0] = "Payroll/xls/singleMonthly.csv";
		file[3][1] = "Payroll/tax/monthlySingleWageBracket.dat";
		
		file[4][0] = "Payroll/xls/singleDaily.csv";
		file[4][1] = "Payroll/tax/dailySingleWageBracket.dat";
		
		file[5][0] = "Payroll/xls/marriedWeekly.csv";
		file[5][1] = "Payroll/tax/weeklyMarriedWageBracket.dat";
		
		file[6][0] = "Payroll/xls/marriedBiWeekly.csv";
		file[6][1] = "Payroll/tax/biWeeklyMarriedWageBracket.dat";
		
		file[7][0] = "Payroll/xls/marriedSemiMonthly.csv";
		file[7][1] = "Payroll/tax/semiMonthlyMarriedWageBracket.dat";
		
		file[8][0] = "Payroll/xls/marriedMonthly.csv";
		file[8][1] = "Payroll/tax/monthlyMarriedWageBracket.dat";
		
		file[9][0] = "Payroll/xls/marriedDaily.csv";
		file[9][1] = "Payroll/tax/dailyMarriedWageBracket.dat";
		int row = 0, col = 0;
		for (int x = 0; x < file.length; x++) {
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
	 * 
	private void myMethod() throws FileNotFoundException {
		payroll.PayrollLib gt = new payroll.PayrollLib();
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
