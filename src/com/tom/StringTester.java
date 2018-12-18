package com.tom;

public class StringTester {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(n!=99);
		String s1 = "Hello world";
		String s2 = new String("Jack Tom Eric");
		System.out.println(s1.equals(s2));
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		System.out.println(s1.substring(0,8));
		System.out.println(s1.substring(2));
		for (int i = s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println(s2.lastIndexOf("c"));
//		Jack boss Eric
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0,5)+"boss"+s2.substring(index+name.length()));

		int nn = Integer.parseInt("12");
		float f = Float.parseFloat("55.3");
		nn++;
		System.out.println(nn);
		Integer ii = nn;
		System.out.println(ii);
	}

}
