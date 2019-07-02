package com.second_task.figur;

public abstract class   figur{
    private String name;
    private int coord;
    public void setName(String name){
        this.name = name;
    };
    public String getName(){
        return name;
    };
    public void setCoordinate(int coord){
        this.coord = coord;
    };
    public int getCoordinate() {
        return 0;
    };
    public int getArea() {
        return 0;
    };
}
