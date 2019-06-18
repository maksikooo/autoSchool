package com.second_task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[10] ;
        Scanner in = new Scanner(System.in);
        for (int i = 0 ; i<10 ; i++){
            a[i]= in.nextInt();
        }
        for (int j = 0 ; j< 5 ;j++) {
            a[a.length - 1 - j] ^= a[j] ^= a[a.length - 1 - j];
            a[j] ^= a[a.length - 1 - j];
        }
        for (int y = 0 ; y<10 ; y++) {
            System.out.println(a[y]);
        }
    }
}