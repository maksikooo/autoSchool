package com.second_task;

public class Main {

    public static void main(String[] args) {
	String task = "Это строка для задания.Что то еще дописать.";
        boolean b = dividesByTwo(task.length());
        System.out.println("Первый символ:"+task.charAt(0));
        System.out.println("Последний символ:"+task.charAt(task.length()-1));
        if (b == false){
            int a = task.length()/2;
            System.out.println("Средний символ:" + task.charAt(a));
        }
        String[] strArray = task.split("(?<=\\.)");
        System.out.println(strArray[0]);
        String[] spaceArrray =strArray[0].split(" ");
        System.out.println("Количество пробелов: "+ (spaceArrray.length-1));  // не указано количество пробелов всей строки task или до точки(вывел до точки)
    }

    static boolean dividesByTwo(int a){
        return (a%2==0);
    }
}
