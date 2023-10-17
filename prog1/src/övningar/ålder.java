package övningar;

import java.util.Scanner;

public class ålder {
	public static void main(String[] args) {
		Scanner input = new Scanner( String[] args );
		System.out.println("Skriv namn:");
String namn = input.nextLine();

System.out.println("skriv ålder: ");
int ålder = input.nextLine();

System.out.println("Skriv längd: ");
double längd = input.nextDouble();

System.out.println(namn+ " är "+ålder+" år gammal och");
	}

}
