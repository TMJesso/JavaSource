package myMediaLab;

public final class Movie extends Media {

	protected Movie() {
	}

	protected Movie(String title, String linkToFile) {
		super(title, linkToFile);
	}

	@Override
	public void play() {
		System.out.print(this.title + " (Movie)\n");
	}
	
//	public String toString() {
		//return title;
//	}


}
