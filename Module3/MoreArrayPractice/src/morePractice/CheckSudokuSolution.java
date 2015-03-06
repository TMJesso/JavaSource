package morePractice;

public class CheckSudokuSolution {
	public static void main(String[] args) {
		practiceLibrary.Lab4Lib sudoku = new practiceLibrary.Lab4Lib();
		// read a Sudoku solution
		int[][] grid = sudoku.readASolution();
		
		System.out.println(sudoku.isValid(grid) ? "Vaid solution" : "Invalid solution");
	}
}
