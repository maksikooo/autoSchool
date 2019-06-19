package com.second_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inInt = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        int a[]= new int[4];
        int aSort[] = new int [3];
        int max;
        String[] srt = new String[2];
        System.out.println("Введите номер задания");
        int task = inInt.nextInt();
        switch (task) {
            case 1: {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Введите " + (i + 1) + " число");
                    a[i] = inInt.nextInt();
                }
                System.out.println("Наименьшее число :");
                if (a[0] < a[1])
                    System.out.println(a[0]);
                else System.out.println(a[1]);

            }
            break;
            case 2: {
                for (int i = 0; i < 4; i++) {
                    System.out.println("Введите " + (i + 1) + " число");
                    a[i] = inInt.nextInt();
                }
                System.out.println("Наибольшее число :");
                max = a[0];
                for (int j = 1; j < 4; j++) {
                    if (max < a[j])
                        max = a[j];
                }
                System.out.println(max);

            }break;
            case 3: {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Введите " + (i + 1) + " число");
                    aSort[i] = inInt.nextInt();
                }
                int temp;
                for (int j= aSort.length-1;j> 0;j--){
                    for(int i=0;i<j;i++){
                        if (aSort[i] < aSort[i+1]) {
                            temp = aSort[i];
                            aSort[i]=aSort[i+1];
                            aSort[i+1]=temp;
                        }
                    }
                }
                for (int i = 0; i < 3; i++)
                    System.out.println(aSort[i]);
            }break;
            case 4: {
                for (int i=0 ; i<2 ; i++) {
                    System.out.println("Введите "+i+" имя");
                    srt[i] = inStr.nextLine();
                }
                if (srt[0].contains(srt[1])){
                    System.out.println("Имена идентичны");
                }else
                    if (srt[0].length()==srt[1].length()){
                        System.out.println("Длины имен равны");
                    }else
                    System.out.println(":(");
            }break;
            case 5:{ //обьеденил 5 и 6 т.к. одно и тоже почти

                System.out.println("Введите имя");
                srt[0] = inStr.nextLine();
                System.out.println("Введите возраст");
                int age = inInt.nextInt();
                if (age < 18){
                    System.out.println("Подрасти еще"+srt[0]);
                }else
                  if (age >20 ){
                      System.out.println("И 18-ти достаточно "+srt[0]);
                }

            }
            case 7:{
                Random random = new Random();
                int secret = random.nextInt(20+1);
                int value ;
                for (int i=0 ; i < 7 ;i++){
                    System.out.println("Попытка №"+(i+1));
                    value = inInt.nextInt();
                    if (value > secret){
                        System.out.println("Много");
                    }else
                        if (value < secret){
                            System.out.println("Мало");
                        }else{
                            System.out.println("Угадал");
                        break;}
                }
            }
        }
    }
}
