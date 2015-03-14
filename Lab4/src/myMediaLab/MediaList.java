package myMediaLab;

import java.util.ArrayList;

public final class MediaList extends PlayableItem {
	ArrayList<MediaList> myMediaPlayList = new ArrayList<>();
	Object obj;
	protected MediaList() {
	}

	protected MediaList(String myMediaTitle, Object obj) {
		super(myMediaTitle);
		this.obj = obj;

	}
	
	public void play() {
		boolean playTitle = true;
		String currentTitle = "";
		for (MediaList e: myMediaPlayList) {
			if (currentTitle != e.title) {
				playTitle = true;
				}
			if (playTitle) {
				currentTitle = e.title;
				System.out.println("\n" + e.title + "\n-------------------------------------");
			}
			System.out.println(e.obj);
			playTitle = false;
		}
	}
	
	protected void addMediaPlayList(String title, Object obj) {
		myMediaPlayList.add(new MediaList(title, obj));
	}
	
	protected boolean removeFromPlayList(Object obj) {
		return myMediaPlayList.remove(obj);
	}
	
}


