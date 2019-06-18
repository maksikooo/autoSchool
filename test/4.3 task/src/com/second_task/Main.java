package com.second_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] str = new String[10];
	int[] strLength =new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i <10 ; i++){
            System.out.println("Введите строку "+(i+1));
            str[i]= in.nextLine();
            strLength[i]=str[i].length();
        }
        for (int j=0; j < 10; j++){
            System.out.println(strLength[j]);
        }

    }
}
