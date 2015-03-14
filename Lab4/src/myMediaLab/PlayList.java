package myMediaLab;

import java.util.ArrayList;

public final class PlayList extends PlayableItem {
	ArrayList<Media> myPlayList;
	Song song;

//	protected PlayList() {
//	}
	
	protected PlayList(String title, Song[] song) {
		super(title);
		myPlayList = new ArrayList<Media>();
		for (int x = 0; x < song.length; x++) {
			addToPlayList(song[x]);
		}
	}

	public void play() {
		for (Media e: myPlayList) {
//			System.out.println(this.title);
			e.play();
		}
	}
	
	protected void addToPlayList(Song song) {
		myPlayList.add(song);
	}
	
	protected boolean removeFromPlayList(Song song) {
		return myPlayList.remove(song);
	}
	

}
