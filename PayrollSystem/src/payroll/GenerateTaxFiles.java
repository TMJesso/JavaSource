package payroll;

import java.io.FileNotFoundException;

public class GenerateTaxFiles {

	public static void main(String[] args) throws FileNotFoundException {
		PayrollMenu generateTaxFiles = new PayrollMenu();
		generateTaxFiles.fromPercentageCSVtoDat();
		generateTaxFiles.fromWageBracketCSVtoDat();
	}

}
