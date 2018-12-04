package com.tom;

import java.util.Random;

public class Poker {
//	int cards[] = new int[52];
	Card[] cards = new Card[52];
	public Poker(){
		for(int i=0;i<52;i++){
//			cards[i]=i;
			cards[i]= new Card(i); 
	}
		}
	public void shuffle(){
		for(int i=0;i<52;i++){
			int r = new Random().nextInt(52);
			Card tmp = cards[i];
			cards[i] = cards[r];
			cards[r]= tmp;
			
		}
	}
	
	public void print()  { 
		for (int i=0;i<52;i++){
//		int flowers = cards[i]/13;
//			char a = 0;
//			switch(flowers){
//			case 0 : 
//				a=0x2663;
//				break;
//			case 1:
//				a=0x2665;
//				break;
//			case 2:
//				a=0x2666;
//				break;
//			case 3:
//				a = 0x2660;
//				break;	
//			}
			System.out.print(cards[i].get()+"");
		if(i%13==12){
			System.out.println(0);
		}
		}		
		
			
	}
}
