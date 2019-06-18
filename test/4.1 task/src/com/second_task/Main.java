package com.second_task;

public class Main {

    public static void main(String[] args) {
        int[] a =null;
	    int max = 0;
        a= new initializeArray().main();
	    max = new max().main(a);
	    System.out.println(max) ;
    }
}
