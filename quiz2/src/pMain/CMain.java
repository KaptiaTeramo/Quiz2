package pMain;

import java.util.Scanner;

public class CMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many years do you have remaining? ");
		int Years = input.nextInt();
				
		System.out.print("What is the tuition rate? ");
		double Rate = input.nextDouble();
		
		System.out.print("What is the yearly increase? ");
		double Increase = input.nextDouble();
		
		double cost = 0;
		
		for(int i = Years - 1; i >= 0; --i){
			cost += Rate*((Increase * i) + 1);
		}
		
		System.out.printf("The total tuiton cost is %.2f", cost);
		input.close();
	}
}

