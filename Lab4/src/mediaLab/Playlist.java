package mediaLab;

import java.util.ArrayList;

public class Playlist extends PlayableItem{
	ArrayList <Songs> listOfSongs = new ArrayList<Songs>(); 
	
	public Playlist(ArrayList <Songs> listOfSongs){
		this.listOfSongs = listOfSongs;
	}
	public void play(){
		for(Songs x: listOfSongs)
		{
			x.play();
		}
	}
	protected void addSong(Songs song){
		listOfSongs.add(song);
	}
	protected void removeSong(Songs song){
		listOfSongs.remove(song);
	}
	
}
