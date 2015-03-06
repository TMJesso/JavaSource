package practiceMethods;

public class TestRandomCharacter {
	/** main method */
	public static void main(String[] args) {
		final int NUMBER_OF_CHARS = 175;
		final int CHARS_PER_LINE = 25;
		char ch=' ';
		// print random characters between 'a' and 'z', 25 chars per line
		for (int t = 0; t<4; t++) {
			for (int i = 0; i < NUMBER_OF_CHARS; i++) {
				switch (t) {
					case 0: ch = RandomCharacter.getRandomLowerCaseLetter(); break;
					case 1: ch = RandomCharacter.getRandomUpperCaseLetter(); break;
					case 2: ch = RandomCharacter.getRandomDigitCharacter(); break;
					case 3: ch = RandomCharacter.getRandomCharacter(); break;
				default: ch=' ';break;
				}
				if ((i + 1) % CHARS_PER_LINE == 0) {
					System.out.println(ch);
				} else {
					System.out.print(ch);
				}
			}
		}
	}

}
