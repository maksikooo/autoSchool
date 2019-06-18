package com.second_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] strArray = null;
        String  max =null;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку слов");
        String str = in.nextLine();
        strArray =str.split(" ");
        max = strArray[0];
        for (int i=1; i < strArray.length; i++){
        if (max.length() < strArray[i].length()){
            max=strArray[i];
            }
        }
        System.out.println(max);
    }
}
