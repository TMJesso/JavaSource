import javax.swing.JOptionPane;

/*
 * 
 * * Author: Theral Jessop
 * Date: March 31, 2014
 * Description:
 * 4 different services
 * Service 1:$100
 * Service 2:$200
 * Service 3:$300
 * Service 4:$400
 * 
 * Variables:
 * service		** this is the primary variable
 * m_getservice ** this is used inside the for loop
 * 
 */
public class Exam02Q1 {

	public static void main(String[] args) {
		// declare variables
		int service;
		
		
		// get service from user and determine which service was provided
		service = Integer.parseInt(JOptionPane.showInputDialog("Enter the service provided (1 - 4)"));
		if(service > 0) {
			if (service < 5) {
				for (int m_getservice=1; m_getservice < 5;) {
									
					if (m_getservice==service) {
						service=service*100;
						JOptionPane.showMessageDialog(null, "Your total charge for Service "+m_getservice+" is $"+service);
					
					} else {
						m_getservice++;
					}
				}
				
			} else {
				JOptionPane.showMessageDialog(null, "You must enter a service between 1 and 4! Please try again!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "You must enter a service between 1 and 4! Please try again!");
		}
	
	}

}
