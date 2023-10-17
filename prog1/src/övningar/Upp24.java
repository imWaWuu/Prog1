package övningar;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Upp24 {
public static void main(String[] args) {
	
	
	Scanner input = new Scanner( System.in );
	
	System.out.println("Ange Abdis ålder: ");
	int ålder = input.nextInt();
	
	System.out.println("Ange Elzaher ålder: ");
	int ålder1 = input.nextInt();
	
	System.out.println("Ange Saifs ålder: ");
	int ålder2 = input.nextInt();
	
	double medel= (ålder+ålder1+ålder2)/3.0;
	
	double summan= ålder+ålder1+ålder2;
	
	
	System.out.println("Medelvärdet är " +medel+ " \nSumman blir "+ summan);
	
			
	
}
}
