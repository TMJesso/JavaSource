package executive;
import keyLib.GenLibrary;
public class TestKeyGen {

	public static void main(String[] args) {
		GenLibrary gl = new GenLibrary();
		boolean positive = true;
		double[][] numbers = new double[31][3];
		double[] genPos = new double[20];
		double[] genNeg = new double[20];
		for (int x = 0; x < numbers.length; x++) {
				numbers[x][0] = ((gl.genRandom(1, 9)) * (-1.0));
				numbers[x][1] = gl.genRandom(30, 100);
				numbers[x][2] = gl.genRandom(1, 10);
		}
		
		for (int x = 0; x < genPos.length; x++) {
			genPos[x] = gl.genKey(numbers[x][0], numbers[x][1], numbers[x][2], (positive));
			genNeg[x] = gl.genKey(numbers[x][0], numbers[x][1], numbers[x][2], !(positive));
		}
		
		for (int x = 0; x < genPos.length; x++) {
			System.out.print((x + 1) + ". " +genPos[x] + " : " + genNeg[x] + " : " + numbers[x][0] + ", " + numbers[x][1] + ", " + numbers[x][2] +"\n");
		}		
	}
}
