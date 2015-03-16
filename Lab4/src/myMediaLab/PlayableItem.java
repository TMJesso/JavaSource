package myMediaLab;

public abstract class PlayableItem {
	protected String title;
	
	public PlayableItem() {
		this.title = "";
	}
	public PlayableItem(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void play();
	
}
