package övningar;

import java.util.Arrays;
import java.util.Scanner;

public class upp32 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("ange temp");
		int [] i = new int[3];
		
		i[0]= input.nextInt();
		
		i[1]= input.nextInt();
		
		i[2]= input.nextInt();
		
		int temp=i[0];
		
		i[0]=i[2];
		i[2]=temp;
		
		System.out.println(Arrays.toString(i));
		
		
	}

}
