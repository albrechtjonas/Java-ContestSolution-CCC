package Senior2018;

import java.util.Scanner;

public class ProblemS2Sunflowers {
	
	private Scanner scanner;
	
	private int size;
	
	private int[][] flowers;
	
	public static void main(String[]args) {
		new ProblemS2Sunflowers();
	}
	
	public ProblemS2Sunflowers() {
		scanner=new Scanner(System.in);
		
		size=Integer.valueOf(scanner.nextLine());
		
		flowers=new int[size][];
		
		for(int i=0;i<size;i++) {
			String[] line=scanner.nextLine().split(" ");
			
			int[] number=new int[line.length];
			
			for(int x=0;x<number.length;x++) {
				number[x]=Integer.valueOf(line[x]);
			}
			
			flowers[i]=number;
		}
		
		while(!isSolved()) {
			flowers=rotate();
		}
		
		print();
	}
	
	private int[][] rotate() {
		int[][] array=new int[size][size];
		
		for(int x=0;x<flowers.length;x++) {
			for(int y=0;y<flowers[x].length;y++) {
				array[x][y]=flowers[flowers.length-y-1][x];
			}
		}
		
		return array;
	}
	
	private boolean isSolved() {
		int value=flowers[0][0];
		
		for(int x=0;x<flowers.length;x++) {
			for(int y=0;y<flowers[x].length;y++) {
				if(flowers[x][y]<value) {
					return false;
				}
			}
		}
		return true;
	}
	
	private void print() {
		for(int x=0;x<flowers.length;x++) {
			for(int y=0;y<flowers[x].length;y++) {
				System.out.print(flowers[x][y]+" ");
			}
			System.out.println();
		}
	}
}
