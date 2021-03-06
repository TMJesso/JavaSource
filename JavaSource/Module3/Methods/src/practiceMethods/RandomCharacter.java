package practiceMethods;

public class RandomCharacter {
	/** generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	/** generate a random lower case letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('\u0061', '\u007A');
	}
	
	/** generate a random upper case letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('\u0041', '\u005A');
	}
	
	/** generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('\u0030', '\u0039');
	}
	
	/** generate a random symbol */
	public static char getRandomSymbolCharacter() {
		return getRandomCharacter('\u0020', '\u002F');
	}
	
	/** generate a random extended symbol */
	public static char getRandomExtendedSymbolCharacter() {
		return getRandomCharacter('\u004A', '\u0040');
	}
	
	/** generate a random extended character */
	public static char getRandomExtendedCharacter() {
		return getRandomCharacter('\u005B', '\u0060');
	}
	
	/** generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0020', '\u00FF');
	}
}
