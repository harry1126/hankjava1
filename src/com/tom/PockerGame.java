package com.tom;

import java.util.Random;

public class PockerGame {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0]=25;
		nums[4]=76;
		System.out.println(nums[0]);
		System.out.println(nums.length);
		for(int i=0;i<nums.length;i++){
			System.out.println(i);
		}
		char f=0x2665;
		System.out.println(f);
		Random random = new Random();
		for(int i=1;i<52;i++){
		int number = random.nextInt(13)+1;
		int flowers = random.nextInt(4);
		System.out.print(number);
		char a = 0;
			switch(flowers){
			case 0 : 
				a=0x2663;
				break;
			case 1:
				a=0x2665;
				break;
			case 2:
				a=0x2666;
				break;
			case 3:
				a = 0x2660;
				break;
				
			}			
			System.out.println(a);
			}
		
		}	
}
