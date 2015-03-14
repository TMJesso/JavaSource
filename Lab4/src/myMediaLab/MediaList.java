package myMediaLab;

import java.util.ArrayList;

public final class MediaList extends PlayableItem {
	ArrayList<MediaList> myMediaPlayList = new ArrayList<>();
	Movie movies;
	Song songs ;
	public MediaList() {
	}

	public MediaList(String myMediaTitle, Movie movies) {
		super(myMediaTitle);
		this.movies = movies;

	}
	
	public MediaList(String myMediaTitle, Song songs) {
		super(myMediaTitle);
		this.songs = songs;
	}

	public void play() {
		//int counter = 0;
		boolean playTitle = true;
		String currentTitle = "";
		for (MediaList e: myMediaPlayList) {
			if (currentTitle != e.title) {
				playTitle = true;
				//counter=0;
			}
			if (playTitle) {
				currentTitle = e.title;
				System.out.println("\n" + e.title + "\n-------------------------------------");
			}
			System.out.println(e.songs == null ? e.movies : e.songs );
			//counter++;
			playTitle = false;
		}
	}
	
	public void addMoviePlayList(String title, Movie movies) {
		myMediaPlayList.add(new MediaList(title, movies));
	}
	
	public void addSongPlayList(String title, Song songs) {
		myMediaPlayList.add(new MediaList(title, songs));
	}
	
	public void removeFromPlayList(String title) {
		myMediaPlayList.remove(title);
	}
	
}


