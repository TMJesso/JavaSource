package payroll;

import java.io.FileNotFoundException;

public class PayrollMenu {

	/** from wage bracket CSV to Dat <br><br>
	 * convert the comma delimited file from IRS tax withholding sheets<br>
	 * 
	 * @author Theral Jessop<br>
	 * Copyright (c) 2015 Theral Jessop All Rights Reserved<br>
	 * 
	 * @throws FileNotFoundException
	 */
	public void fromWageBracketCSVtoDat() throws FileNotFoundException {
		payroll.PayrollLib gt = new payroll.PayrollLib();
		String[][] file = new String[9][2];
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
		
		file[4][0] = "Payroll/xls/marriedWeekly.csv";
		file[4][1] = "Payroll/tax/weeklyMarriedWageBracket.dat";
		
		file[5][0] = "Payroll/xls/marriedBiWeekly.csv";
		file[5][1] = "Payroll/tax/biWeeklyMarriedWageBracket.dat";
		
		file[6][0] = "Payroll/xls/marriedSemiMonthly.csv";
		file[6][1] = "Payroll/tax/semiMonthlyMarriedWageBracket.dat";
		
		file[7][0] = "Payroll/xls/marriedMonthly.csv";
		file[7][1] = "Payroll/tax/monthlyMarriedWageBracket.dat";
		
		file[8][0] = "Payroll/xls/marriedDaily.csv";
		file[8][1] = "Payroll/tax/dailyMarriedWageBracket.dat";
		
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

	/** create percentage files from the WithholdingTables_(year of tax files to convert).csv file
	 * in order to properly parse this and convert the appropriate files
	 * all heading and unused areas must be deleted from the file
	 * so it is a bare comma delimited file<br><br>
	 * 
	 * also there needs to be a heading value between each section
	 * <p>example:<br><br>
	 * 
	 * Weekly<br>
	 * 
	 * ,,$44 ,$222 ,,$0.00 ,plus,10%,,$44 ,,,$165 ,$520 ,,$0.00 ,plus,10%,,$165 ,,<br>
	 *  ...<br>
	 * ...<br>
	 * ...<br><br>
	 * Biweekly<br>
	 * ,,$88 ,$443 ,,$0.00 ,plus,10%,,$88 ,,,$331 ,"$1,040 ",,$0.00 ,plus,10%,,$331 ,,<br>
	 * ...<br>
	 * ...<br>
	 * ...<br><br>
	 *  etc.<br>
	 *  
	 *  @author Theral Jessop<br>
	 *  Copyright (c) 2015 Theral Jessop All Rights Reserved<br>
	 */
	public void fromPercentageCSVtoDat() throws FileNotFoundException {
		PayrollLib gt = new PayrollLib();
		String filename = gt.getString("Enter the path and filename of the comma delimited file to convert\n\n(example: Payroll/xls/WithholdingTables_2015)\n\nDo not include the extenstion because it will be added automaticly\nHowever, the file must be saved using a comma delimited format \nand have the csv extension!") + ".csv"; // "Payroll/xls/WithholdingTables_2015.csv";
		gt.newloadPercent(filename);

	}
	

}
