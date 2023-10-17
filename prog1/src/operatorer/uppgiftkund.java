package operatorer;

import java.util.Scanner;

public class uppgiftkund {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ange varans pris");
		
		int pris=input.nextInt();
		
		System.out.println("ange belopp som kunden ger");
		
		int belopp = input.nextInt();
		
		int tillbaka = belopp-pris;
		
		int tusen = tillbaka/1000;
		
		int rest = tillbaka%1000;
		
		int femhundra = rest/500;
		
		rest= rest%500;
		
		int tvåhundra= rest/200;
		
	    rest= rest%200;
		
		int hundra= rest/100;
		
		rest=rest%100;
		
		int tjugo= rest/20;
		
		rest=rest%20;
		
		int tio=rest/10;
		
		rest=rest%10;
		
		int fem=rest/5;
		
		rest=rest%5;
		
		int två=rest/2;
		
		rest=rest%2;
		
		int ett=rest/1;
		
		rest=rest%1;
		
		System.out.println(tusen+" st tusen lappar "+femhundra+" st femhundra lappar "+tvåhundra+" st tvåhundra lappar "+hundra+" st hundra lappar ");
		
	}
	}
