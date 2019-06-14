package com.second_task;

public class Main {

    public static void main(String[] args) {
		int q = 21;
		int w = 8;
		float i = (float)q/w;
		System.out.println("1: "+i) ;
		//1 задание
		int n = 73;
		String s =Integer.toString(n);
		char[] charArray = s.toCharArray();
		int aValue = Character.getNumericValue(charArray[0]);
		int bValue = Character.getNumericValue(charArray[1]);
		System.out.println("2:" + (aValue+bValue)) ;
		//2 задание
		float k = (float) 23.55672;
		System.out.println(Math.round(k));
		//3 задание
		int o = 0;
		int a = 0;
		int p = 2;
		int b = 2;
		int u = 5;
		int c = 5;
		a = o + p;
		b = u - o;
		c = o + p + u;
		System.out.println("a="+a+" b="+b+" c="+c);

    }

}
