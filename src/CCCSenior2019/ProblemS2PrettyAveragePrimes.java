package CCCSenior2019;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemS2PrettyAveragePrimes {
	
	private ArrayList<Integer> primes=new ArrayList<Integer>();
	
	private Scanner scanner;
	
	public static void main(String[]args) {
		new ProblemS2PrettyAveragePrimes();
	}
	
	private ProblemS2PrettyAveragePrimes() {
		scanner=new Scanner(System.in);
		
		System.out.println("Number?");
		
		int number=scanner.nextInt();
		
		for(int x=0;x<number*10;x++) {
			if(isPrimeNumber(x)) {
				for(int y=number*10;y>0;y--) {
					if(isPrimeNumber(y) && (x+y)/2==number && (x+y)%2==0 && (!primes.contains(x)) && (!primes.contains(y))) {
						System.out.println(number+"="+"("+x+"+"+y+")/2");
						primes.add(x);
						primes.add(y);
					}
				}
			}
		}
	}
	
	private boolean isPrimeNumber(int number) {
		
		if(number==0 || number==1) {
			return false;
		}
		
		for(int i=1;i<number;i++) {
			if(number%i==0 && i!=1 && i!=number) {
				return false;
			}
		}
		return true;
	}
}
