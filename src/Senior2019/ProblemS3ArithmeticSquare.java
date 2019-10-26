package CCCSenior2019;

public class ProblemS3ArithmeticSquare {
	
	private String[][] grid= {{"14","X","X"},{"X","X","18"},{"X","16","X"}};
	
	public static void main(String[]args) {
		new ProblemS3ArithmeticSquare();
	}
	
	private ProblemS3ArithmeticSquare() {
		for(int y=0;y<grid.length;y++) {
			for(int x=0;x<grid[y].length;x++) {
				if(grid[x][y].equals("X")) {
					
				}
			}
		}
		
		printArray();
		
		
		
	}
	
	private void printArray() {
		for(int x=0;x<grid.length;x++) {
			for(int y=0;y<grid[x].length;y++) {
				System.out.print(grid[x][y]+",");
			}
			System.out.println();
		}
	}
}
