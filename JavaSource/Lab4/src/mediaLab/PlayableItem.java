package mediaLab;

public abstract class PlayableItem {
	protected String title;
	
	//getter and setter for title
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public abstract void play();
}
