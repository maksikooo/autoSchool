package com.second_task.figur;

public class figur {
    private String name;
    private  int coordinate;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name; //насколько я понимаю this здесь не нужен
    }
    public void setCoordinate(int coordinate){
        this.coordinate = coordinate;
    }

    public int getCoordinate() {
        return coordinate;
    }
    public int getArea(int a,int  b){
        return a*b;
    }
}
