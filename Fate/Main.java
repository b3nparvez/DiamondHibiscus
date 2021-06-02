package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	    Scanner bob = new Scanner(System.in);
	    Random divine = new Random();

        System.out.println(" ");
        System.out.println("                        Welcome to Fate");
        System.out.println("                   ");
        System.out.println("              How many people are in this game?");
        System.out.println(" ");


        int num = bob.nextInt();//asks how many people are there stores it in a num
        ArrayList<people> peeps = new ArrayList<>();
        people suad;
        for(int i = 0; i < num; i++){
            System.out.println(" ");
            System.out.println("              What is this person's name? ");
            System.out.println(" ");
            String name = bob.next();
            int luck = divine.nextInt(1000);
            suad = new people(name,luck);
            peeps.add(suad);
        }//end of for

        people x;
        for (int i = num-1 ; i > 0; i--) {//bubble sort the people
            for(int j = 0 ; j < i ; j++){
                if(peeps.get(j).getLuck() > peeps.get(j+1).getLuck()){
                    x = peeps.get(j);
                    peeps.set( j , peeps.get(j+1) );
                    peeps.set( j+1 , x);
                }//end of if
            }//end of inner for
        }//end of for

        System.out.println("                   ");
        System.out.println("                   ");
        int count;
        count = 1;
        for(int i = num-1 ; i >= 0 ; i--){//prints out the list in biggest luck to smallest luck
            System.out.println("         " + count + " ) " + peeps.get(i).getName()
                        + "    " + " luck factor : " + peeps.get(i).getLuck());
            System.out.println("                   ");
            count++;
        }//end of for

        System.out.println("                   this is the order the people go in");
        System.out.println("                   ");
        System.out.println("                   Would you like to try again?   ( y )  ( n )");
        System.out.println("                   ");
        String choice = bob.next();
        int newLuck;//variable to store new luck just in case
        while(choice.equals("y")){
            System.out.println("                   ");
            System.out.println("                   ");
            for(int i = 0; i < num ; i++){//gives out new luck number
                newLuck = divine.nextInt(1000);
                peeps.get(i).setLuck(newLuck);//sets peoples luck to a new number
            }//end of for
            for (int i = num-1 ; i > 0; i--) {//bubble sort the people
                for(int j = 0 ; j < i ; j++){
                    if(peeps.get(j).getLuck() > peeps.get(j+1).getLuck()){
                        x = peeps.get(j);
                        peeps.set( j , peeps.get(j+1) );
                        peeps.set( j+1 , x);
                    }//end of if
                }//end of inner for
            }//end of for
            count = 1;
            for(int i = num-1 ; i >= 0 ; i--){//prints out the list in biggest luck to smallest luck
                System.out.println("         " + count + " ) " + peeps.get(i).getName()
                        + "    " + " luck factor : " + peeps.get(i).getLuck());
                System.out.println("                   ");
                count++;
            }//end of for
            System.out.println("                   ");
            System.out.println("                 Keep going?  ( y )  ( n )  ");
            System.out.println("                   ");
            choice = bob.next();
        }//end of while

        int[][] test = new int[10][10];
        for(int i = 0 ; i < 5 ; i++){
            for(int p = 0 ; p < 5 ; p++){
                if(p==0) {
                    test[i][p] = 0;
                }else if(p==3) {
                    test[i][p] = 4;
                }else{ test[i][p] = 9;}
                if(i==2 && p==4){
                    test[i][p] = 3;
                }
            }//end of inner for

        }//end of outter for

        for(int i = 0 ; i < 5 ; i++){
            for(int p = 0 ; p < 5 ; p++){
                System.out.print(test[i][p]);
            }//end of inner for
            System.out.println(" ");
        }//end of outter for

    }//end of main
}//end of program main
