package theral;
public abstract class ThreeDimension extends Shape {
		double dimension1;
		double dimension2;
		double dimension3;

	public ThreeDimension(double dim1, double dim2, double dim3, String color, Point point) {
		super(color, point);
		this.dimension1 = dim1;
		this.dimension2 = dim2;
		this.dimension3 = dim3;
	}

	abstract public double getArea();

	abstract public double getVolume();

	// get

	/** get Dimension 1
	 *
	 * @return dimension1
	 */
	public double getDimension1() {
		return this.dimension1;
	}

	/** get Dimension 2
	 *
	 * @return dimension2
	 */
	public double getDimension2() {
		return this.dimension2;
	}

	// set

	/** set Dimension 1
	 *
	 * @param dimension1
	 */
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}

	/** set Dimension 2
	 *
	 * @param dimension2
	 */
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}

}
