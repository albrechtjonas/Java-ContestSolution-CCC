package Senior2019;

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

		for(int x=0;x<triangle.length;x++) {
			for(int y=0;y<triangle[x].length;y++) {
				if(isGood(x,y)) {
					int[] subTriangle=new int[subTriangleSize*(subTriangleSize+1)/2];
					
					int index=0;
					
					int depth=1;
					
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
			sum+=getMax(list.get(i));
		}
		System.out.println(sum);
		
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
	
	private boolean isGood(int x,int y) {
		
		int depth=1;
		
		if(x+subTriangleSize>triangle.length) {
			return false;
		}else {
			for(int i=x;i<triangle.length;i++) {
				if(triangle[i].length<y+depth) {
					return false;
				}
				depth++;
			}
		}
		
		return true;
	}
}
