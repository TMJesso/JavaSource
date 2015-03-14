package myMediaLab;

import java.util.ArrayList;

public final class PlayList extends PlayableItem {
	ArrayList<PlayList> myPlayList = new ArrayList<>();
	Song songs;

	protected PlayList() {
	}
	
	protected PlayList(String title, Song songs) {
		super(title);
		this.songs = songs;
	}

	public void play() {
		int counter = 0;
		for (PlayList e: myPlayList) {
			if (counter < 1) {
				System.out.println("\n" + e.title + "\n-------------------------------------");
			}
			System.out.println(e.songs);
			counter++;
		}
	}
	
	protected void addToPlayList(String title, Song songs) {
		myPlayList.add(new PlayList(title, songs));
	}
	
	protected boolean removeFromPlayList(Song songs) {
		int index = myPlayList.indexOf(this.songs);
		if (index == -1) {
			return false;
		}
		return (myPlayList.remove(index) != null);
	}
	

}
