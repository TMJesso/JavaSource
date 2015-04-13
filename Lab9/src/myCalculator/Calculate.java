package myCalculator;
import javax.swing.*;
public class Calculate {
	private float displayValue;
	
	public Calculate() {
		this.displayValue = 0.0f;
	}
	
	/**
	 * @return the displayValue
	 */
	public float getDisplayValue() {
		return displayValue;
	}

	/**
	 * @param displayValue the displayValue to set
	 */
	public void setDisplayValue(float displayValue) {
		this.displayValue = displayValue;
	}

	public void add(float value) {
		this.displayValue += value;
	}
	
	public void subtract(float value) {
		this.displayValue -= value;
	}
	
	public void multiply(float value) {
		this.displayValue *= value;
	}
	
	public void divide(float value) {
		if (value == 0) {
			JOptionPane.showMessageDialog(null,"Divide by zero prohibited!!!");
		} else {
			this.displayValue /= value;
		}
	}

}
