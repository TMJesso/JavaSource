package myMediaLab;

public abstract class Media extends PlayableItem {
	protected String linkToFile;
	
	protected Media () {
		this.title = "";
		this.linkToFile = "";
	}
	
	protected Media(String title, String linkToFile) {
	super(title);
	this.linkToFile = linkToFile;
	}
	
	protected String getLinkToFile() {
		return this.linkToFile;
	}
	
	protected void setLinkToFile(String linkToFile) {
		this.linkToFile = linkToFile;
	}
	
	public abstract void play();

}
