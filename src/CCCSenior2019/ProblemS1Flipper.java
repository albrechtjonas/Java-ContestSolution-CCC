package CCCSenior2019;

import java.util.Scanner;

public class ProblemS1Flipper {
	
	private Scanner scanner;
	
	private int[][] grid=new int[][] {{1,2},{3,4}};
	
	public static void main(String[]args) {
		new ProblemS1Flipper();
	}
	
	private ProblemS1Flipper() {
		System.out.println("Original Grid");
		printGrid(grid);
		
		System.out.println("\nOperation?");
		
		scanner=new Scanner(System.in);
		
		String input=scanner.nextLine();
		
		char[] commands=input.toCharArray();
		
		for(char c: commands) {
			if(c=='H') {
				grid=horizontalFlip(grid);
			}else if(c=='V') {
				grid=verticalFlip(grid);
			}
		}
		
		System.out.println("Final Grid");
		printGrid(grid);
	}
	
	private int[][] verticalFlip(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			int left=grid[i][0];
			int right=grid[i][1];
			
			grid[i][1]=left;
			grid[i][0]=right;
		}
		return grid;
	}
	
	private int[][] horizontalFlip(int[][] grid) {
		int[] one=grid[0];
		int[] two=grid[1];
		
		grid[0]=two;
		grid[1]=one;
		
		return grid;
	}
	
	private void printGrid(int[][] grid) {
		for(int x=0;x<grid.length;x++) {
			for(int y=0;y<grid[x].length;y++) {
				System.out.print(grid[x][y]+" ");
			}
			System.out.println();
		}
	}
}
