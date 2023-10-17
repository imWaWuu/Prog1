package övningar;

import java.util.Scanner;

public class uppg22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange ett tal");
		
		int tal = input.nextInt();
		
		double svar = Math.pow(tal, 2);
		System.out.println("kvadraten på"+tal+"blir"+svar);
		
	
		
		
	}

}
