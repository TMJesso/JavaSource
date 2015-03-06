/*
 * IUK
 * Professor: Dr. Awny Alnusair
 *  Name: Theral Jessop
 * Course: INFO 211
 * Date: January 28, 2015
 * Lab 2:
 * Sports Team
 * Description:
* input user enters area code 317, 765, 574
 * 
 * 317 = Indy Area
 * 765 = Kokomo Area
 * 574 = Logansport Area
 * 
 * Please try again
 * Keep trying until you enter a valid area code
 * 
 * 
 * 
 */
package decisions;
import javax.swing.*;
public class AreaCode {

	public static void main(String[] args) {
		int areacode=0;
		boolean checkInput=true;
		while (checkInput) {
			areacode=Integer.parseInt(JOptionPane.showInputDialog("Enter a zip code"));
			
			switch (areacode) {
			case 765: JOptionPane.showMessageDialog(null, "Kokomo Area");checkInput=false;break;
			case 317: JOptionPane.showMessageDialog(null, "Indy Area");checkInput=false;break;
			case 574: JOptionPane.showMessageDialog(null, "Logansport Area");checkInput=false;break;
			default: JOptionPane.showMessageDialog(null, "Invalid Entry!!");break;
			}
		}
	}

}
