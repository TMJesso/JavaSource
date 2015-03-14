package myMediaLab;

public class TestDriver {

	public static void main(String[] args) {
		Song[] mySongs = new Song[5];
		mySongs[0] = new Song("Brazil - Song", "D:\\Data\\Songs\\");
		mySongs[1] = new Song("By the Time This Night is Over - Song", "D:\\Data\\Songs\\");
		mySongs[2] = new Song("The Champion's Theme - Song", "D:\\Data\\Songs\\");
		mySongs[3] = new Song("Forever in Love -  Song", "D:\\Data\\Songs\\");
		mySongs[4] = new Song("Jasmine Flower - Song", "D:\\Data\\Songs\\");
		
		Movie[] myMovies = new Movie[5];
		myMovies[0] = new Movie("Anna Karenina - Movie", "D:\\Data\\Movies\\");
		myMovies[1] = new Movie("Little Men - Movie", "D:\\Data\\Movies\\");
		myMovies[2] = new Movie("Adventures of Huckleberry Finn - Movie", "D:\\Data\\Movies\\");
		myMovies[3] = new Movie("Call of the Wild - Movie", "D:\\Data\\Movies\\");
		myMovies[4] = new Movie("Tale of Two Cities - Movie", "D:\\Data\\Movies\\");
		
		PlayList playList = new PlayList("My Favorite Songs", mySongs);
		MediaList mediaList = new MediaList("My Favorite Movies and Songs", mySongs);
		mediaList = new MediaList("My Favorite Movies and Songs", myMovies);
		mediaList = new MediaList("My Favorite Movies and Songs", mySongs);
		mediaList = new MediaList("My Favorite Movies and Songs", myMovies);

/*
		for (int x = 0; x < mySongs.length; x++) {
			playList = new PlayList("My Favorite Songs", mySongs);
			mediaList = new MediaList("My Favorite Movies and Songs", mySongs);
			mediaList = new MediaList("My Favorite Movies and Songs", myMovies);
			mediaList = new MediaList("My Favorite Movies and Songs", mySongs);
			mediaList = new MediaList("My Favorite Movies and Songs", myMovies);
		}
*/		
/*
		for (int x = 0; x < mySongs.length; x++) {
			playList.addToPlayList( mySongs[x]);
			mediaList.addMediaPlayList( myMovies[x]);
			mediaList.addMediaPlayList( mySongs[x]);
		}
	
		for (int x = 0; x < myMovies.length; x++) {
			playList.addToPlayList(mySongs[x]);
			mediaList.addMediaPlayList( mySongs[x]);
			mediaList.addMediaPlayList( myMovies[x]);
		}
*/	
		playList.play();
		mediaList.play();
		
//		System.out.println(playList.removeFromPlayList(mySongs[0]) ? "Removed" : "Not Removed");
//		System.out.println(playList.removeFromPlayList(mySongs[0]) ? "Removed" : "Not Removed");
//		System.out.println(playList.removeFromPlayList(mySongs[0]) ? "Removed" : "Not Removed");
//		System.out.println(playList.removeFromPlayList(mySongs[0]) ? "Removed" : "Not Removed");
//		System.out.println(mediaList.removeFromPlayList(myMovies[2]) ? "Removed" : "Not Removed");
//		System.out.println(mediaList.removeFromPlayList(myMovies[2]) ? "Removed" : "Not Removed");
//		System.out.println(mediaList.removeFromPlayList(myMovies[2]) ? "Removed" : "Not Removed");
//		System.out.println(mediaList.removeFromPlayList(myMovies[2]) ? "Removed" : "Not Removed");
	
		System.out.println(playList.title);
		playList.play();
		System.out.println(mediaList.title);
		mediaList.play();

	}

}
