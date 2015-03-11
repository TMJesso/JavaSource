package mediaLab;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		//arraylist of songs and videos
		ArrayList<Songs> listOfSongs = new ArrayList<Songs>();
		ArrayList<Media> listOfMedia = new ArrayList<Media>();
		//new objects
		Songs song1 = new Songs();
		Videos video1 = new Videos();
		Songs song2 = new Songs("Free Bird","C:\\users\\Aaron\\documents\\song2");
		Videos video2 = new Videos("Numa Numa Dance","C:\\users\\Aaron\\documents\\video2");
		Songs song3 = new Songs("Best song in the world","C:\\users\\Aaron\\documents\\song3");
		Videos video3 = new Videos("FunnyCatVideo","C:\\users\\Aaron\\documents\\video3");
		//add objects to arraylist
		listOfSongs.add(song1);
		listOfSongs.add(song2);
		listOfMedia.add(song3);
		listOfMedia.add(video1);
		listOfMedia.add(video2);
		
		Playlist newPlayList = new Playlist(listOfSongs);
		newPlayList.addSong(song3);
		newPlayList.play();
		
		MediaList newMediaList = new MediaList(listOfMedia);
		newMediaList.addItem(video3);
		newMediaList.play();
	}

}
