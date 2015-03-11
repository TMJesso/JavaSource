package mediaLab;

public final class Videos extends Media {
	public Videos(){
		super();
	}
	public Videos(String title, String link){
		super(title,link);
		
	}
	public void play() {
		
			System.out.println("The video vcurrently playing is " + this.title);
				
	}

}
