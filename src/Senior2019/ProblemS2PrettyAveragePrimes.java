package Senior2019;

import java.util.Scanner;

public class ProblemS2PrettyAveragePrimes {
	
	private Scanner scanner;
	
	public static void main(String[]args) {
		new ProblemS2PrettyAveragePrimes();
	}
	
	private ProblemS2PrettyAveragePrimes() {
		scanner=new Scanner(System.in);
		
		int number=scanner.nextInt();
		
		for(int x=0;x<number*4;x++) {
			if(isPrimeNumber(x)) {
				for(int y=number*4;y>0;y--) {
					if(isPrimeNumber(y) && (x+y)/2==number && (x+y)%2==0) {
						System.out.println(x+" "+y);
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
