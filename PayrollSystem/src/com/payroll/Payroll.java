package com.payroll;

import java.io.FileNotFoundException;

import payroll.PayrollMenu;

public class Payroll {

	public static void main(String[] args) {

	}

	/** get file names<br><br>
	 * 	0 = "weeklySinglePercent.dat"<br>
	 *	1 = "weeklyMarriedPercent.dat"<br>
	 *	2 = "weeklySingleWageBracket.dat"<br>
	 *	3 = "weeklyMarriedWageBracket.dat"<br>
	 *	4 = "biweeklySinglePercent.dat"<br>
	 *	5 = "biweeklyMarriedPercent.dat"<br>
	 *	6 = "biWeeklySingleWageBracket.dat"<br>
	 *	7 = "biWeeklyMarriedWageBracket.dat"<br>
	 *	8 = "semimonthlySinglePercent.dat"<br>
	 *	9 = "semimonthlyMarriedPercent.dat"<br>
	 *	10 = "semiMonthlySingleWageBracket.dat"<br>
	 *	11 = "semiMonthlyMarriedWageBracket.dat"<br>
	 *	12 = "monthlySinglePercent.dat"<br>
	 *	13 = "monthlyMarriedPercent.dat"<br>
	 *	14 = "monthlySingleWageBracket.dat"<br>
	 *	15 = "monthlyMarriedWageBracket.dat"<br>
	 *	16 = "quarterlySinglePercent.dat"<br>
	 *	17 = "quarterlyMarriedPercent.dat"<br>
	 *	18 = "semiannualSinglePercent.dat"<br>
	 *	19 = "semiannualMarriedPercent.dat"<br>
	 *	20 = "annualSinglePercent.dat"<br>
	 *	21 = "annualMarriedPercent.dat"<br>
	 *	22 = "dailySinglePercent.dat"<br>
	 *	23 = "dailyMarriedPercent.dat"<br>
	 *	24 = "dailySingleWageBracket.dat"<br>
	 *	25 = "dailyMarriedWageBracket.dat"

	 * @param index
	 * 
	 * @return fileName String path and the name of the file
	 */
	protected static String getFileNames(int index) {
		String[] fileName = new String[26];
		fileName[0] = "Payroll/tax/weeklySinglePercent.dat";
		fileName[1] = "Payroll/tax/weeklyMarriedPercent.dat";
		fileName[2] = "Payroll/tax/weeklySingleWageBracket.dat";
		fileName[3] = "Payroll/tax/weeklyMarriedWageBracket.dat";
		fileName[4] = "Payroll/tax/biweeklySinglePercent.dat";
		fileName[5] = "Payroll/tax/biweeklyMarriedPercent.dat";
		fileName[6] = "Payroll/tax/biWeeklySingleWageBracket.dat";
		fileName[7] = "Payroll/tax/biWeeklyMarriedWageBracket.dat";
		fileName[8] = "Payroll/tax/semimonthlySinglePercent.dat";
		fileName[9] = "Payroll/tax/semimonthlyMarriedPercent.dat";
		fileName[10] = "Payroll/tax/semiMonthlySingleWageBracket.dat";
		fileName[11] = "Payroll/tax/semiMonthlyMarriedWageBracket.dat";
		fileName[12] = "Payroll/tax/monthlySinglePercent.dat";
		fileName[13] = "Payroll/tax/monthlyMarriedPercent.dat";
		fileName[14] = "Payroll/tax/monthlySingleWageBracket.dat";
		fileName[15] = "Payroll/tax/monthlyMarriedWageBracket.dat";
		fileName[16] = "Payroll/tax/quarterlySinglePercent.dat";
		fileName[17] = "Payroll/tax/quarterlyMarriedPercent.dat";
		fileName[18] = "Payroll/tax/semiannualSinglePercent.dat";
		fileName[19] = "Payroll/tax/semiannualMarriedPercent.dat";
		fileName[20] = "Payroll/tax/annualSinglePercent.dat";
		fileName[21] = "Payroll/tax/annualMarriedPercent.dat";
		fileName[22] = "Payroll/tax/dailySinglePercent.dat";
		fileName[23] = "Payroll/tax/dailyMarriedPercent.dat";
		fileName[24] = "Payroll/tax/dailySingleWageBracket.dat";
		fileName[25] = "Payroll/tax/dailyMarriedWageBracket.dat";
		
		return fileName[index];
		
	}
	
	/** generate tax files using my library of code<br><br>
	 * 
	 * @author Theral Jessop<br>
	 * 
	 * @throws FileNotFoundException
	 */
	public static void  generateTaxFiles() throws FileNotFoundException {
		PayrollMenu generateTaxFiles = new PayrollMenu();
		generateTaxFiles.fromPercentageCSVtoDat();
		generateTaxFiles.fromWageBracketCSVtoDat();

	}
	
}


