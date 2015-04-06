package myMediaLab;

public final class Song extends Media {

	public Song() {
	}
	
	public Song(String title, String linkToFile) {
		super(title, linkToFile);
	}

	@Override
	public void play() {
		System.out.print(this.title + " (Song)\n");
	}

//	public String toString() {
//		return title;
//	}
	
}
