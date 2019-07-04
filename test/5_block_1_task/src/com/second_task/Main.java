package com.second_task;

import java.awt.*;
import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

import com.second_task.randomStr;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер задания");
        String i ;
        Scanner read = new Scanner(System.in);
        i = read.next();
        switch (i) {
            case "1": {
                Set<String> set = new HashSet<String>();
                set.add("арбуз");
                set.add("банан");
                set.add("вишня");
                set.add("груша");
                set.add("дыня");
                set.add("ежевика");
                set.add("жень-шень");
                set.add("земляника");
                set.add("ирис");
                set.add("картофель");
                for (String x : set) {
                    System.out.println(x);
                }
            }
            break;
            case "2": {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("арбуз", "ягода");
                map.put("банан", "трава");
                map.put("вишня", "ягода");
                map.put("груша", "фрукт");
                map.put("дыня", "овощ");
                map.put("ежевика", "ягода");
                map.put("жень-шень", "корень");
                map.put("земляника", "ягода");
                map.put("ирис", "цветок");
                map.put("картофель", "клубень");
                for (HashMap.Entry<String, String> x : map.entrySet()) {
                    System.out.println(x.getKey() + " - " + x.getValue());
                }
            }
            break;
            case "3": {
                HashMap<String, cat> cats = new HashMap<String, cat>();
                cat blea1 = new cat();
                blea1.setName("dolgo1");
                cats.put(blea1.getName(), blea1);
                cat blea2 = new cat();
                blea2.setName("dolgo2");
                cats.put(blea2.getName(), blea2);
                cat blea3 = new cat();
                blea3.setName("dolgo3");
                cats.put(blea3.getName(), blea3);
                cat blea4 = new cat();
                blea4.setName("dolgo4");
                cats.put(blea4.getName(), blea4);
                cat blea5 = new cat();
                blea5.setName("dolgo5");
                cats.put(blea5.getName(), blea5);

                for (HashMap.Entry<String, cat> x : cats.entrySet()) {
                    System.out.println(x.getKey() + " - " + x.getValue());
                }

            }
            break;
            case "4": {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("арбуз2", "ягода");
                map.put("банан2", "трава");
                map.put("вишня2", "ягода");
                map.put("груша2", "фрукт");
                map.put("дыня2", "овощ");
                map.put("ежевика2", "ягода");
                map.put("жень-шень2", "корень");
                map.put("земляника2", "ягода");
                map.put("ирис2", "цветок");
                map.put("картофель2", "клубень");
                for (HashMap.Entry<String, String> x : map.entrySet()) {
                    System.out.println(x.getKey());
                }
            }
            break;
            case "5": {
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("арбуз1", "ягода");
                map.put("банан1", "трава");
                map.put("вишня1", "ягода");
                map.put("груша1", "фрукт");
                map.put("дыня1", "овощ");
                map.put("ежевика1", "ягода");
                map.put("жень-шень1", "корень");
                map.put("земляника1", "ягода");
                map.put("ирис1", "цветок");
                map.put("картофель1", "клубень");
                for (HashMap.Entry<String, String> x : map.entrySet()) {
                    System.out.println(x.getValue());
                }
            }
            break;
            case "6": {
                HashMap<String, object> objects = new HashMap<String, object>();
                object bleat1 = new object();
                bleat1.setName("dolgo1");
                objects.put(bleat1.getName(), bleat1);
                object bleat2 = new object();
                bleat2.setName("dolgo2");
                objects.put(bleat2.getName(), bleat2);
                object bleat3 = new object();
                bleat3.setName("dolgo3");
                objects.put(bleat3.getName(), bleat3);
                object bleat4 = new object();
                bleat4.setName("dolgo4");
                objects.put(bleat4.getName(), bleat4);
                object bleat5 = new object();
                bleat5.setName("dolgo5");
                objects.put(bleat5.getName(), bleat5);
                for (HashMap.Entry<String, object> x : objects.entrySet()) {
                    System.out.println(x.getKey() + " - " + x.getValue());
                }

            }
            break;
            case "7": {
                ArrayList<String> list = new ArrayList<String>();
                list.add("Ku");
                list.add("Kuku");
                list.add("Kue");
                list.add("Kuss");
                list.add("Kus");
                System.out.println(list.size());
                for (String l : list) {
                    System.out.println(l);
                }
            }
            break;
            case "8": {
                String max = "";
                ArrayList<String> list = new ArrayList<String>();
                System.out.println("Введите строку");
                list.add(read.next());
                System.out.println("Введите строку");
                list.add(read.next());
                System.out.println("Введите строку");
                list.add(read.next());
                System.out.println("Введите строку");
                list.add(read.next());
                System.out.println("Введите строку");
                list.add(read.next());
                for (String tmp : list) {
                    if (max.length() < tmp.length()) {
                        max = tmp;
                    }
                }
                for (String tmp : list) {
                    if (max.length() == tmp.length()) {
                        System.out.println(tmp);
                    }
                }
            }
            break;
            case "9": {
                String min;
                ArrayList<String> listmin = new ArrayList<String>();
                System.out.println("Введите строку.");
                listmin.add(read.next());
                System.out.println("Введите строку.");
                listmin.add(read.next());
                System.out.println("Введите строку.");
                listmin.add(read.next());
                System.out.println("Введите строку.");
                listmin.add(read.next());
                System.out.println("Введите строку.");
                listmin.add(read.next());
                min = listmin.get(0);
                for (String tmp : listmin) {
                    if (min.length() > tmp.length()) {
                        min = tmp;
                    }
                }
                for (String tmp : listmin) {
                    if (min.length() == tmp.length()) {
                        System.out.println(tmp);
                    }
                }
            }
            break;
            case "10": {
                ArrayList<String> list = new ArrayList<String>();
                System.out.println("Введите строку");
                list.add(0, read.next());
                System.out.println("Введите строку");
                list.add(0, read.next());
                System.out.println("Введите строку");
                list.add(0, read.next());
                System.out.println("Введите строку");
                list.add(0, read.next());
                System.out.println("Введите строку");
                list.add(0, read.next());
                for (String str : list) {
                    System.out.println(str);
                }
            }
            break;
            case "11": {
                ArrayList<String> list = new ArrayList<String>();
                System.out.println("Введите  строку");
                list.add(read.next());
                System.out.println("Введите  строку");
                list.add(read.next());
                System.out.println("Введите  строку");
                list.add(read.next());
                System.out.println("Введите  строку");
                list.add(read.next());
                System.out.println("Введите  строку");
                list.add(read.next());
                String tmp;
                for (int j = 0; j < 13; j++) {
                    tmp = list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                    list.add(0, tmp);
                }
                for (String str : list) {
                    System.out.println(str);
                }
            }
            break;
            case "12": {
                Set<String> set = new HashSet<String>();
                randomStr r = new randomStr();
                for (int j = 0; j < 5; j++)
                    set.add(r.generateRandomWord(5));
            }
            break;
            case "13": {
                Set<Integer> set = new HashSet<Integer>();
                Random r = new Random();
                for (int j = 0; j < 20; j++) {
                    set.add(r.nextInt(50));
                }
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    if (it.next() > 10) {
                        it.remove();
                    }
                }
                Iterator<Integer> iter = set.iterator(); // вывод результата
                while (iter.hasNext())
                    System.out.println(iter.next());
            }
            break;
            case "14": {
                String mapValue = "Кло";
                int qty = 0;
                Map<String, String> map = new HashMap<String, String>();
                map.put("Бло", "Кgло");
                map.put("Как", "же");
                map.put("Много", "Значений");
                map.put("Одинаковых", "Нужно");
                map.put("Пихать", "в");
                map.put("Массивы", "ы");
                map.put("Бyло", "Кло");
                map.put("Бuло", "Кло");
                map.put("ЫЫк", "Кло");
                map.put("ыы", "s");
                for (Map.Entry<String, String> tmp : map.entrySet()) {
                    //вывод значений map  System.out.println(tmp.getKey()+" : "+tmp.getValue());
                    if (tmp.getValue() == mapValue) {
                        qty++;
                    }
                }
                System.out.println(qty);
            }
            break;
            case "15": {
                Map<String, LocalDate> map = new HashMap<String, LocalDate>();
                map.put("Бла", LocalDate.of(2015, 12, 30));
                map.put("S", LocalDate.of(2015, 10, 30));
                map.put("Er", LocalDate.of(2015, 11, 30));
                map.put("QE", LocalDate.of(2015, 1, 30));
                map.put("Rt", LocalDate.of(2015, 8, 30));
                map.put("Fs", LocalDate.of(2015, 6, 3));
                map.put("FG", LocalDate.of(2015, 7, 30));
                map.put("qee", LocalDate.of(2015, 5, 30));
                map.put("tt", LocalDate.of(2015, 12, 30));
                System.out.println("Не отфильтрованный map - " + map);
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, LocalDate> tmp = (Map.Entry<String, LocalDate>) it.next();
                    if ((tmp.getValue().getMonthValue() > 5) & (tmp.getValue().getMonthValue() < 9)) {
                        it.remove();
                    }
                }
                for (Map.Entry<String, LocalDate> tmp1 : map.entrySet()) {
                    System.out.println(tmp1.getKey() + ":" + tmp1.getValue());
                }
            }
            break;
            case "16": {
                Map<String, String> map = new HashMap<String, String>();
                Map<String, String> mapUnique = new HashMap<>();
                map.put("Бло2", "Кgло");
                map.put("Как2", "же");
                map.put("Много2", "Значений");
                map.put("Одинаковых2", "Нужно");
                map.put("Пихать2", "в");
                map.put("Массивы2", "ы");
                map.put("Бyло2", "Кло");
                map.put("Бuло2", "Кло");
                map.put("ЫЫк", "Кло");
                map.put("ыы", "s");
                System.out.println(map);
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, String> str = (Map.Entry<String, String>) iterator.next();
//                    if (iterator.);
//                    iterator.remove();
                    if (!mapUnique.containsValue(str.getValue())) {
                        mapUnique.put(str.getKey(), str.getValue());
                    }
                }
                System.out.println(mapUnique);
            }break;
            case "17":{
                Map<String, String> map = new HashMap<String, String>();
                map.put("Бло1", "Кgло");
                map.put("Как1", "же");
                map.put("Много1", "Значений");
                map.put("Пихать1", "Нужно");
                map.put("Пихать1", "в");
                map.put("Пихать1", "ы");
                map.put("Бyло1", "Кло");
                map.put("Бuло1", "Кло");
                map.put("ЫЫк1", "Кло");
                map.put("ыы1", "s");
                System.out.println(map);
            }default:{
                System.out.println("Goodbye");
            }
        }
    }
}