package myMediaLab;

public final class Movie extends Media {

	public Movie() {
	}

	public Movie(String title, String linkToFile) {
		super(title, linkToFile);
	}

	@Override
	public void play() {
	
	}
	
	public String toString() {
		return this.title;
	}


}
