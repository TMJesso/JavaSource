package mediaLab;

public abstract class Media extends PlayableItem {
	protected String linkToFile;
	//inherited from PlayableItem
	public Media(){
		this.linkToFile = "C:\\";
		super.setTitle("Title of Movie");
	}
	public Media(String title, String link){
		this.linkToFile = link;
		super.setTitle(title);
		
	}
	//setter and getter
	public void setLinkToFile(String linkToFile){
		this.linkToFile = linkToFile;
	}
	public String getLinkToFile(){
		return this.linkToFile;
	}
}
