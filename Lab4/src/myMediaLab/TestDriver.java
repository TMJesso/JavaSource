package myMediaLab;

public class TestDriver {

	public static void main(String[] args) {
		Song[] mySongs = new Song[5];
		mySongs[0] = new Song("Brazil - Song", "D:\\Data\\Songs\\");
		mySongs[1] = new Song("By the Time This Night is Over - Song", "D:\\Data\\Songs\\");
		mySongs[2] = new Song("The Champion's Theme - Song", "D:\\Data\\Songs\\");
		mySongs[3] = new Song("Forever in Love -  Song", "D:\\Data\\Songs\\");
		mySongs[4] = new Song("Jasmine Flower - Song", "D:\\Data\\Songs\\");
		
		Media[] multiMedia = new Media[10];
		multiMedia[5] = new Song("Brazil - Multi Media", "D:\\Data\\Songs\\");
		multiMedia[6] = new Song("By the Time This Night is Over - Multi Media", "D:\\Data\\Songs\\");
		multiMedia[7] = new Song("The Champion's Theme - Multi Media", "D:\\Data\\Songs\\");
		multiMedia[8] = new Song("Forever in Love -  Multi Media", "D:\\Data\\Songs\\");
		multiMedia[9] = new Song("Jasmine Flower - Multi Media", "D:\\Data\\Songs\\");
		multiMedia[0] = new Movie("Anna Karenina - Multi Media", "D:\\Data\\Movies\\");
		multiMedia[1] = new Movie("Little Men - Multi Media", "D:\\Data\\Movies\\");
		multiMedia[2] = new Movie("Adventures of Huckleberry Finn - Multi Media", "D:\\Data\\Movies\\");
		multiMedia[3] = new Movie("Call of the Wild - Multi Media", "D:\\Data\\Movies\\");
		multiMedia[4] = new Movie("Tale of Two Cities - Multi Media", "D:\\Data\\Movies\\");
		
		
		Movie[] myMovies = new Movie[5];
		myMovies[0] = new Movie("Anna Karenina - Movie", "D:\\Data\\Movies\\");
		myMovies[1] = new Movie("Little Men - Movie", "D:\\Data\\Movies\\");
		myMovies[2] = new Movie("Adventures of Huckleberry Finn - Movie", "D:\\Data\\Movies\\");
		myMovies[3] = new Movie("Call of the Wild - Movie", "D:\\Data\\Movies\\");
		myMovies[4] = new Movie("Tale of Two Cities - Movie", "D:\\Data\\Movies\\");
		
		
		PlayList playList = new PlayList("My Favorite Songs", mySongs);
		System.out.println(playList.title);
		playList.play();
		MediaList mediaList = new MediaList("My Favorite Movies and Songs 1", mySongs);
		System.out.println(mediaList.title);
		mediaList.play();
		mediaList = new MediaList("My Favorite Movies and Songs 2", myMovies);
		System.out.println(mediaList.title);
		mediaList.play();
		mediaList = new MediaList("My Favorite Movies and Songs 3", multiMedia);
		System.out.println(mediaList.title);
		mediaList.play();
		mediaList = new MediaList("My Favorite Movies and Songs 4", myMovies);
		System.out.println(mediaList.title);
		mediaList.play();


	}

}
