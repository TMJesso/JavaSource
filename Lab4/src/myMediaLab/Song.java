package myMediaLab;

public final class Song extends Media {

	protected Song() {
	}
	
	protected Song(String title, String linkToFile) {
		super(title, linkToFile);
	}

	@Override
	public void play() {
		System.out.print(this.title + "\n");
	}

//	public String toString() {
//		return title;
//	}
	
}
