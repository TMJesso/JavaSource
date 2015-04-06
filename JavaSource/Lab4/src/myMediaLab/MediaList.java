package myMediaLab;

import java.util.ArrayList;

public final class MediaList extends PlayableItem {
	ArrayList<Media> myMediaPlayList;
	public MediaList() {
	}

	public MediaList(String title) {
		this.title = title;
		myMediaPlayList = new ArrayList<Media>();
	}
	
	public void play() {
		for (Media e: myMediaPlayList) {
			//System.out.println(this.title);
			e.play();
		}
	}	
	public void addMediaPlayList(Media mediaItem) {
		myMediaPlayList.add(mediaItem);
	}
	
	public boolean removeFromPlayList(Media mediaItem) {
		return myMediaPlayList.remove(mediaItem);
	}
	
}


