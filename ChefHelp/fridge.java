package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class fridge {

    public static ArrayList<food> fridge;

    public fridge(){
        fridge = new ArrayList<>();
    }

    public void putIn(food food){
        fridge.add(food);
    }//end of putInt
    public void putIn( int num, food food){
        for(int i = 0; i < num; i++) {
            fridge.add(food);
        }
    }//end of put in


    public void throwOut(food food){
        fridge.remove(food);
    }
    public void throwOut(int num, food food){
        for(int i = 0; i < num; i++){
            fridge.remove(food);
        }
    }

    /**
     * this method lists the foods in the fridge
     * it will do this in alphabetical order
     * and then print out the results so it's easier to see
     */
    public void listFood() throws InterruptedException {
        String []items = new String[fridge.size()];
        System.out.println(" ");
        int space = 0;//a counter for the array list
        for (food food: fridge) {//for each item in fridge, list them out
            items[space] = food.getName();//puts the name of the item in the array list
            space++;//increases counter
        }//end of for
        items = Stream.of(items).sorted().toArray(String[]::new);//sorts the strings to alphabetical order
        System.out.print("Here are the contents of your fridge > ");
        System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(Arrays.toString(items));//prints it out
        System.out.println(" ");
        System.out.println(" ");
    }//end of listFood


}//end of main fridge
