package com.second_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0 ;i <8; i++){
            System.out.println("Введите "+(i+1)+"число");
            a[i] = in.nextInt();
        }
        for (int j=9;j>=0; j--){
            System.out.println(a[j]);
        }
    }
}
