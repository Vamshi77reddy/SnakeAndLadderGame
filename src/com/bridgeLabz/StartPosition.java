package com.bridgeLabz;

import java.util.Random;
import java.util.Scanner;

public class StartPosition {

		public static int snake(int pos,String p) {
			int pos1=pos;
			switch(pos) {
			case 99:
					pos1=14;
					System.out.println("OOps snake bite to "+p+" :99 to 14");
					break;
			case 92:
					pos1=54;
					System.out.println("OOps snake bite to "+p+":92 to 54");
					break;
			case 85:
					pos1=47;
					System.out.println("OOps snake bite to "+p+" :85 to 47");
					break;
			case 78:
					pos1=40;
					System.out.println("OOps snake bite to "+p+" :78 to 40");
					break;
			case 55:
					pos1=25;
					System.out.println("OOps snake bite to "+p+" :55 to 25");
					break;
			case 49:
					pos1=10;
					System.out.println("OOps snake bite to "+p+" :49 to 10");
					break;
			default:
					break;
			}
			return pos1;
		}
		public static int ladder(int pos,String p) {
			int pos1=pos;
			switch(pos) {
			case 3:
				pos1=22;
				System.out.println("Hurry ladder up to "+p+" :3 to 22");
				break;
			case 11:
				pos1=69;
				System.out.println("Hurry ladder up to "+p+" :11 to 69");
				break;
			case 21:
				pos1=61;
				System.out.println("Hurry ladder up to "+p+" :21 to 61");
				break;
			case 34:
				pos1=53;
				System.out.println("Hurry ladder up to "+p+" :34 to 53");
				break;
			case 39:
				pos1=58;
				System.out.println("Hurry ladder up to "+p+" :39 to 58");
				break;
			case 74:
				pos1=86;
				System.out.println("Hurry ladder up to "+p+" :74 to 86");
				break;
			default:
				break;
			}
			return pos1;
		}
public static void main(String []args) {
	int position=0;
int 	r=0;
	int d1=0;
	System.out.println("Welcome to snake and ladder game");
	System.out.println("the player is at Position :: 0");

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first player1 name :");
	String p1=sc.nextLine();
	Random random=new Random();
	StartPosition obj=new StartPosition();
	while(r==0 || position==100){
	d1=random.nextInt(6)+1;
	position=position+d1;
	position=obj.snake(position,p1);
	position=obj.ladder(position,p1);
	}
	System.out.println("The dice number is ::" +d1);
	
	System.out.println(p1+"'s position is "+position);
	

	
}
	}
