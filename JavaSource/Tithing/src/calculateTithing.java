import java.util.ArrayList;
import java.util.ListIterator;





public class calculateTithing {

	
	public static void main(String[] args) {
		String getMenu = InputHelper.getInput("1. Calculate Tithing, 2. Enter $$$ and Slips, 3. Exit: ");
		int m_menu = Integer.parseInt(getMenu);
		// figure out how to use float
		
		
		switch (m_menu) {
			case 1: // calculate tithing
		
				String payAmount = InputHelper.getInput("Enter your pay amount or 'x' to exit: ");
				double intpayAmount=0.00d;
				double tithingAmount=0.00d;
				boolean m_pay = true;
				if (payAmount == "x" || payAmount == "X") {
					m_pay = false;	
				} else {
					intpayAmount = Double.parseDouble(payAmount);
					tithingAmount = intpayAmount * .10d;
					//tithingAmount = Double(tithingAmount);
					int getInteger = (int) tithingAmount;
					double getDifrence = tithingAmount-getInteger;
					double isGreater = Double(getDifrence);
					int isInt = (int) isGreater;
					double isDiff = isGreater-isInt;
					String addZero="";
					if (isDiff <= .1) {
						addZero = "0";
					}
					
				System.out.println("You have $" + tithingAmount + addZero +" in thithing that you need to put away or give to Bishop");
				m_pay = true;
				}
				
				if (m_pay) {
					
				}
				break;
		
			case 2: // enter $$$ and slips
				ArrayList<String> money = new ArrayList<String>();
				ArrayList<String> tithing = new ArrayList<String>();
				int m_counter=0;
				int t_counter=0;
				Boolean loop = true;
				String input1;
				String input2;
				while (loop==true) {
					if (m_counter==0) {
						input1 = InputHelper.getInput("Enter money for tithing or 'x' to exit: ");
					} else {
						input1 = InputHelper.getInput("");
					}
		
					if (input1.equals("x") || input1.equals("X")) {
						loop = false;
					} else {
						money.add(input1);
						m_counter ++;
					}
				}
				loop = true;
				while (loop==true) {
					if (t_counter==0) {
						input2 = InputHelper.getInput("Enter tithing slip amount or 'x' to exit: ");
					} else {
						input2 = InputHelper.getInput("");
					}
					
					if (input2.equals("x") || input2.equals("X")) {
						loop = false;
					} else {
						tithing.add(input2);
						t_counter ++;
						
					}
				}
				int m1 = 0;
				int t1 = 0;
				ListIterator<String> listMoney = money.listIterator();
				ListIterator<String> listTithing = tithing.listIterator();
				while (listMoney.hasNext()) {
					m1 = m1 + Integer.parseInt(listMoney.next());
				}
				while (listTithing.hasNext()) {
					t1 = t1 + Integer.parseInt(listTithing.next());
				}
				
				System.out.println("$" + m1 + " was calculated with " + m_counter + " bills.");
				System.out.println("$" + t1 + " was calculated with " + t_counter + " tithing slips.");
				int result=0;
				
				if (m1 > t1) {
					result = m1-t1;
					System.out.println("You have more money than tithing slips by $" + result);
				}
					else if (t1 > m1) {
						result = t1-m1;
						System.out.println("You have more tithing slips than money by $" + result);
						} else if (m1==t1) {
							result = m1-t1;
							if (result==0) {
								System.out.println("Your tithing has been reconciled! " + result+"."+result + result);
							} else {
								System.out.println("There was an error in the calculations.  Please run again...");
							}
						}
				break;
			case 3:
				System.out.println("Finished!");
				break;
		}
	}

	private static double Double(double d) {
		double p = d*100;
		int t = (int) (p);
		double r = t/100;
		
		return r;
	}
}
		
			


