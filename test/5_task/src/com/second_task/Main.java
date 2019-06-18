package com.second_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]= new int[4];
        int aSort[] = new int [3];
        int max;
        System.out.println("Введите номер задания");
        int task = in.nextInt();
        switch (task) {
            case 1: {
                for (int i = 0; i < 2; i++) {
                    System.out.println("Введите " + (i + 1) + " число");
                    a[i] = in.nextInt();
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
                    a[i] = in.nextInt();
                }
                System.out.println("Наибольшее число :");
                max = a[0];
                for (int j = 1; j < 4; j++) {
                    if (max < a[j])
                        max = a[j];
                }
                System.out.println(max);

            }
            case 3: {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Введите " + (i + 1) + " число");
                    aSort[i] = in.nextInt();
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
            }
        }
    }
}
