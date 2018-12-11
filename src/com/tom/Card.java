package com.tom;

public class Card {
//	String suits = "\u2663\u2666\u2665\u2660";
	char[] suits = {'\u2663','\u2666','\u2665','\u2660'};
	int value;
//	int symbol;
	int suit;
	public Card(int value){
		this.value = value;
	}
	public String get(){
//		int type = value/13;
//		int num = value%13 +1;
//		return (num+""+suits.charAt(type);
		String s = value%13+1+""+suits[value/13]+" ";
		return s;
	}

}
