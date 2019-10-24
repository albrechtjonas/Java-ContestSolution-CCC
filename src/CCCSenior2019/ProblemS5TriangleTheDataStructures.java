package CCCSenior2019;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemS5TriangleTheDataStructures {
	
	private Scanner scanner;
	
	private int triangleSize;
	
	private int subTriangleSize;
	
	private int[][] triangle;
	
	private int sum;
	
	private ArrayList<int[]> list=new ArrayList<int[]>();
	
	public static void main(String[]args) {
		new ProblemS5TriangleTheDataStructures();
	}
	
	private ProblemS5TriangleTheDataStructures() {
		scanner=new Scanner(System.in);
		
		String[] lineOne=scanner.nextLine().split(" ");
		
		for(String s: lineOne) {
			if(triangleSize==0) {
				triangleSize=Integer.valueOf(s);
			}else {
				subTriangleSize=Integer.valueOf(s);
			}
		}
	
		triangle=new int[triangleSize][];
		
		for(int i=0;i<triangleSize;i++) {
			String[] line=scanner.nextLine().split(" ");
			
			int[] numbers=new int[line.length];
			
			for(int x=0;x<numbers.length;x++) {
				numbers[x]=Integer.valueOf(line[x]);
			}
			
			triangle[i]=numbers;
		}
		System.out.println("Here is the triangle you gave...");
		print(triangle);
		
		for(int x=0;x<triangle.length;x++) {
			for(int y=0;y<triangle[x].length;y++) {
				if(isGood(x,y)) {
					int[] subTriangle=new int[subTriangleSize*(subTriangleSize+1)/2];
					
					int index=0;
					
					int depth=1;
					
					System.out.println("At "+x+","+y+" can form a subTriangle with a size of "+subTriangleSize);
					
					for(int q=x;q<x+subTriangleSize;q++) {
						for(int w=y;w<y+depth;w++) {
							subTriangle[index]=triangle[q][w];
							index++;
						}
						depth++;
					}
					list.add(subTriangle);
				}
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print("\nIn list Index "+i+": ");
			printOneDimension(list.get(i));
			sum+=getMax(list.get(i));
			System.out.println(" with a max value of "+getMax(list.get(i))+" Accumulated value: "+sum);
			
		}
		System.out.println("The total sum is "+sum);
		
	}
	private int getMax(int[] array) {
		int max=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	private void printOneDimension(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	private boolean isGood(int x,int y) {
		if(x+subTriangleSize>triangle.length) {
			return false;
		}else {
			for(int i=x;i<triangle.length;i++) {
				if(triangle[i].length<y+subTriangleSize-(subTriangleSize-1)) {
					return false;
				}
			}
		}
		
		return true;
	}
	private void print(int[][] array) {
		for(int x=0;x<array.length;x++) {
			for(int y=0;y<array[x].length;y++) {
				System.out.print(array[x][y]+" ");
			}
			System.out.println();
		}
	}
}
