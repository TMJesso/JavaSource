package mylab7;
import java.util.*;

/** LinkedStringLog implements StringLogInterface<br>
 * adapted from ArrayStringLog by Dale/Joyce/Weems<br>
 * fields:<br>
 * 		name (String)<br>
 * 		log (ArrayList<String><br>
 * 		lastIndex (int) = -1<br>
 * 
 * @author Theral Jessop<br>
 * Mar 30, 2015<br>
 * LinkedStringLog.java<br>
 *
 */
public class LinkedStringLog implements StringLogInterface {
	  protected String name;              // name of this StringLog
	  protected ArrayList<String> log;             // array that holds strings
	  protected int lastIndex = -1;       // index of last string in array

	  /** LinkedStringLog default constructor<br>
	   * Creates a new ArrayList String and log name set to null
	   * 
	   */
	  public LinkedStringLog() {
		  this.name = null;
		  this.log = new ArrayList<>();
	  }
	  
	  /** LinkedStringLog non-default constructor<br>
	   * Creates a new Arraylist String and log name<br>
	   * 
	   * 
	   * @param name String this is the name of the log
	   */
	  public LinkedStringLog(String name) {
		  this.name = name;
		  this.log = new ArrayList<>();
	  }
	  
	  // get
	  
	  /** get name<br>
	   * 
	   * @return <strong>name</strong> String this is the name of the log
	   */
	  public String getName(){
		  return this.name;
	  }
	  
	  // set
	  
	  /** set name<br>
	   * 
	   * @param name String this sets the name of the log
	   */
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	
	/** insert<br><br>
	 * this addes the String element into the ArrayList and increments<br>
	 * the index counter, lastIndex, by 1<br>
	 * 
	 * 
	 */
	public void insert(String element) {
		log.add(element);
		lastIndex++;
	}

	/** isFull()<br><br>
	 * checks to see if the ArrayList is full<br><br>
	 * Since an ArrayList is limited by the available memory<br>
	 * it is basically infinite<br>
	 * and therefore will always return false<br>
	 * 
	 */
	public boolean isFull() {
		return false;
	}
	
	/** isEmpty()<br><br>
	 * Check to see if the ArrayList is empty<br><br>
	 * Since we keep track of the index values we can check<br>
	 * the value to see if it is -1 for empty (true) or not empty (false)<br>
	 * 
	 * @return boolean true if lastIndex is -1 or false if > -1<br>
	 */
	public boolean isEmpty() {
		return ((lastIndex==-1)? true : false);
	}
	
	/** how many<br><br>
	 * Determine how many times the String element is found in the ArrayList<br>
	 * 
	 * @param element String the string to search for in the ArrayList
	 * @return <strong>number</strong> int value of # of times it is found
	 */
	public int howMany(String element) {
		  int number = 0;
		  int location = 0;
		  while (location <= lastIndex) {
			  if (element.equalsIgnoreCase(log.get(location))) {
				  number++;
			  }
			  location++;
		  }
		  return number;
	}

	/** uniqInsert<br><br>
	 * Determines whether a string already exists in the ArrayList<br>
	 * before it is allowed to add it if it does not<br>
	 * 
	 * @param element String the string to add
	 * @return boolean true if it was successfully added or false it it already exists
	 */
	public boolean uniqInsert(String element) {
		  if((contains(element))) {
			  return false;
		  }
			  insert(element);
			  return true;
	}
	
	/** size()<br><br>
	 * Determines the number of strings that are in the ArrayList<br>
	 * 
	 * @return <strong>lastIndex</strong> int the number of elements in the ArrayList
	 * 
	 */
	public int size() {
		return lastIndex;
	}

	/** contains<br><br>
	 * Determines whether String element exists in the ArrayList<br>
	 * if it does, return true, else return false<br>
	 * 
	 * @param element String the string value to search for
	 * @return boolean true if it is there or false if it is not
	 * 
	 */
	public boolean contains(String element) {
		int location = 0;
		while (location <= lastIndex) {
			if (element.equalsIgnoreCase(log.get(location))) {
				return true;
			} else {
				location++;
			}
		}
		return false;
	}

	/** clear()<br><br>
	 * Reset the ArrayList<br>
	 * and set the lastIndex value to -1<br>
	 * 
	 */
	public void clear() {
		log.clear();
		lastIndex = -1;
	}
}
