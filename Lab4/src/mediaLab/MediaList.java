package mediaLab;

import java.util.ArrayList;

public class MediaList extends PlayableItem{
	ArrayList <Media> listOfItems = new ArrayList<Media>(); 
	public MediaList(ArrayList <Media> listOfItems){
		this.listOfItems = listOfItems;
	}
	public void play(){
		for(Media x: listOfItems)
		{
			System.out.println(x.getTitle());
		}
	}
	protected void addItem(Media item){
		listOfItems.add(item);
	}
	protected void removeItem(Media item){
		listOfItems.remove(item);
	}
}
