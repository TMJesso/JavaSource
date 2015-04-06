package mediaLab;

public final class Songs extends Media {
	public Songs(){
		super();
	}
	public Songs(String title, String link){
		super(title,link);
		
	}
	public void play() {
		System.out.println("The song currently playing is " + this.title);
	}
}
