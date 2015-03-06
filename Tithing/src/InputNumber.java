import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputNumber {
	public static String getNumber(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		// convert to double
		//double inputNumber = Double.parseDouble(stdin);
		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}

