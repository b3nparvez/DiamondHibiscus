package com.company;

public class people {
    String name;//the name of the person
    int luck;//num to allot how much luck a person has

    people(String name , int luck){
        this.name = name;
        this.luck = luck;
    }//end of people constructor

    public int getLuck() {
        return luck;
    }

    public String getName() {
        return name;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setName(String name) {
        this.name = name;
    }

}//end of people
