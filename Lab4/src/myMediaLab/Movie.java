package myMediaLab;

public final class Movie extends Media {

	public Movie() {
	}

	public Movie(String title, String linkToFile) {
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
