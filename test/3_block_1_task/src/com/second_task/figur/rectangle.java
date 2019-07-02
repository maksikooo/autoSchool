package com.second_task.figur;

public class rectangle extends figur{
    private String name;
    private int coord;
    @Override
    public int getArea() {
        return super.getArea();
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public int getCoordinate() {
        return coord;
    }
    public void setCoordinate(int coord) {
    }
}
