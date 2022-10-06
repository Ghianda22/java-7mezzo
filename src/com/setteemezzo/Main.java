package com.setteemezzo;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[] deck = new int[40];
		boolean found = true;
		
		for(int i = 0; i<40; i++) {
			do {
				found = true;
				int randomNum = r.nextInt(40)+1;
				for(int j = 0; j < i; j++) {
					if(deck[j] == randomNum) {
						found = false;
					}
				}
				if(found) deck[i] = randomNum;
			}while(!found);
			
			System.out.println(deck[i]);
		}
		
		
		
		
		
	}
}
