package myCalculator;

public class Face {
	private boolean faceState;
	
	public Face() {
		this.faceState = true;
	}

	/**
	 * @return the faceState
	 */
	public boolean isFaceState() {
		return faceState;
	}

	/**
	 * @param faceState the faceState to set
	 */
	public void setFaceState(boolean faceState) {
		this.faceState = faceState;
	}
	
	public void makeItHappy() {
		this.faceState = true;
	}
	
	public void makeItSad() {
		this.faceState = false;
	}
}
