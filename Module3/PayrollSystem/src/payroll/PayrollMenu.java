package payroll;

import java.io.FileNotFoundException;

public class PayrollMenu {

	public void fromWageBracketCSVtoDat() throws FileNotFoundException {
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

	/** create percentage files from the WithholdingTables_2015.csv file
	 * in order to properly parse this and convert the appropriate files
	 * all heading and unused areas must be deleted from the file
	 * so it is a bare comma delimited file
	 * 
	 * also there needs to be a heading value between each section
	 * <p>example:
	 * 
	 * <p>Weekly
	 * 
	 * <p>,,$44 ,$222 ,,$0.00 ,plus,10%,,$44 ,,,$165 ,$520 ,,$0.00 ,plus,10%,,$165 ,,
	 * <p> ...
	 * <p>...
	 * <p>...
	 * <p>Biweekly
	 * <p>,,$88 ,$443 ,,$0.00 ,plus,10%,,$88 ,,,$331 ,"$1,040 ",,$0.00 ,plus,10%,,$331 ,,
	 * <p>...
	 * <p>...
	 * <p> etc.
	 */
	public void convertDelimited() throws FileNotFoundException {
		PayrollLib gt = new PayrollLib();
		String filename = gt.getString("Enter the path and filename of the comma delimited file to convert\n\n(example: f:\\Programming\\Payroll\\WithholdingTables_2015)\n\nDo not include the extenstion because it will be added automaticly\nHowever, the file must be saved using a comma delimited format \nand have the csv extension!") + ".csv"; // "f:\\Programming\\Payroll\\WithholdingTables_2015.csv";
		gt.newloadPercent(filename);

	}
	

}
