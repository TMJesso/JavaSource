package myMediaLab;

public abstract class Media extends PlayableItem {
	protected String linkToFile;
	
	public Media () {
		this.title = "";
		this.linkToFile = "";
	}
		public Media(String title, String linkToFile) {
		super(title);
		this.linkToFile = linkToFile;
	}
	
	public String getLinkToFile() {
		return this.linkToFile;
	}
	
	public void setLinkToFile(String linkToFile) {
		this.linkToFile = linkToFile;
	}
	
	public abstract void play();

}
