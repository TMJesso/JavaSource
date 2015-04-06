package chapter11;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject() {
	}
	
	public RectangleFromSimpleGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
		/*
		 * book form
		 * setColor(color);
		 * setFilled(filled);
		 * 
		 */
	}
	
	/** return width
	 * 
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	
	/** set a new width
	 * 
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/** return height
	 * 
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	
	/** set a new height
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** return area
	 * 
	 * @return area
	 */
	public double getArea() {
		return width * height;
	}
	
	/** return perimeter
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
