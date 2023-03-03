package com.bridgeLabz;

import java.util.Random;
import java.util.Scanner;

public class StartPosition {
public static void main(String []args) {
	int position=0;
	int d1=0;
	System.out.println("Welcome to snake and ladder game");
	System.out.println("the player is at Position :: 0");

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first player1 name :");
	String p1=sc.nextLine();
	Random random=new Random();

	d1=random.nextInt(6)+1;
	System.out.println("The dice number is ::" +d1);


	
}
}
