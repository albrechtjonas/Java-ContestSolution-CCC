package Senior2018;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemS1VoronoiVillages {
	
	private Scanner scanner;
	
	private int totalVillages;
	
	private double[] villages;
	
	private ArrayList<Double> values=new ArrayList<Double>();
	
	public static void main(String[]args) {
		new ProblemS1VoronoiVillages();
	}
	
	private ProblemS1VoronoiVillages() {
		scanner=new Scanner(System.in);
		
		totalVillages=scanner.nextInt();
		
		villages=new double[totalVillages];
		
		while(totalVillages>0) {
			villages[villages.length-totalVillages]=scanner.nextDouble();
			totalVillages--;
		}
		
		sort();
		
		for(int i=0;i<villages.length;i++) {
			if(i>0 && i<villages.length-1) {
				double local=Math.abs(villages[i]-villages[i-1])/2+Math.abs(villages[i]-villages[i+1])/2;
				values.add(local);
			}
		}
		
		System.out.println(findMin());
		
	}
	
	private double findMin() {
		
		double min=values.get(0);
		
		for(int i=0;i<values.size();i++) {
			if(values.get(i)<min) {
				min=values.get(i);
			}
		}
		return min;
	}
	
	private void sort() {
		for(int i=0;i<villages.length;i++) {
			int min=i;
			
			for(int x=i;x<villages.length;x++) {
				if(villages[x]<villages[min]) {
					min=x;
				}
			}
			
			double value=villages[min];
			
			villages[min]=villages[i];
			villages[i]=value;
		}
		return;
	}
}
