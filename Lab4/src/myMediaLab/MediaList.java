package myMediaLab;

import java.util.ArrayList;

public final class MediaList extends PlayableItem {
	ArrayList<Media> myMediaPlayList;
	Media mediaItem;
	protected MediaList() {
	}

	protected MediaList(String title, Media[] mediaItem) {
		super(title);
		myMediaPlayList = new ArrayList<Media>();
		for (int x = 0; x < mediaItem.length; x++) {
			addMediaPlayList(mediaItem[x]);
		}
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
	
	protected boolean removeFromPlayList(Media mediaItem) {
		return myMediaPlayList.remove(mediaItem);
	}
	
}


