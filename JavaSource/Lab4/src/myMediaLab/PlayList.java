package myMediaLab;

import java.util.ArrayList;

public final class PlayList extends PlayableItem {
	ArrayList<Media> myPlayList;

	public PlayList(String title) {
		super(title);
		myPlayList = new ArrayList<Media>();
	}

	public void play() {
		for (Media e: myPlayList) {
//			System.out.println(this.title);
			e.play();
		}
	}
	
	public void addToPlayList(Song song) {
		myPlayList.add(song);
	}
	
	public boolean removeFromPlayList(Song song) {
		return myPlayList.remove(song);
	}
	

}
