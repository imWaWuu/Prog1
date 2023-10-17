package uppgifter;

import java.util.Scanner;

public class upp23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		System.out.println("Substantiv: ");
		String Substantiv = input.nextLine();
		
		System.out.println("Pluraländrelse: ");
		String Pluraländrelse = input.nextLine();
		
		
		System.out.println(" en " + Substantiv );
		System.out.println("flera" + Substantiv+Pluraländrelse);

		
		
	}

}
