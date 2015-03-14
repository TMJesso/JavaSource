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
		
		PlayList myPlayList = new PlayList();
		MediaList myMediaList = new MediaList();
		for (int x = 0; x < mySongs.length; x++) {
			myPlayList.addToPlayList("Favorite Songs", mySongs[x]);
			myMediaList.addMoviePlayList("Favorite Movies and Songs", myMovies[x]);
			myMediaList.addSongPlayList("Favorite Movies and Songs", mySongs[x]);
		}
	
		for (int x = 0; x < myMovies.length; x++) {
			myPlayList.addToPlayList("Favorite Songs", mySongs[x]);
			myMediaList.addSongPlayList("Other Favorite Movies and Songs", mySongs[x]);
			myMediaList.addMoviePlayList("Other Favorite Movies and Songs", myMovies[x]);
		}
		myPlayList.play();
		myMediaList.play();
		
	}

}
