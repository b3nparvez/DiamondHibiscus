package com.company;

import java.util.Scanner;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.Random;
public class Main {

    public static void main(String[] args) {
        //long startTime = System.nanoTime();
        Scanner bob = new Scanner(System.in);//scanner for stuff
        //Random fate = new Random();

        System.out.println("  ");
        System.out.println(" Pennies matter too, type out money answers in double format. ex: 2.50 ");
        System.out.println(" Anyway");
        System.out.println("  ");
        System.out.println(" What's your end goal dude?");
        System.out.println(" ");
        double goal = bob.nextDouble();//varible to store end goal
        System.out.println(" ");
        System.out.println(" Good, but how much you saved up now?");
        System.out.println(" ");
        double saved = bob.nextDouble();//variabel to store money saved up so far
        if(saved == 0.0) { System.out.println("can you stop wasting money?");}
        System.out.println(" ");
        System.out.println(" What is today's date and when do you want to reach your goal? ");
        System.out.println("       start: ( M D YYYY )     end: ( M D YYYY )");
        System.out.println(" ");
        int startMonth = bob.nextInt() - 1;//it's minus one because the array order is one lower
        int startDay = bob.nextInt() - 1;//  than the day or month chosen   so if they said
        int startYear = bob.nextInt();//     1/23/2019 it'll be 0/22/2019 so the array can match
        int endMonth = bob.nextInt() - 1;//  the array since the array starts with 0 for placement
        int endDay = bob.nextInt() -1 ;
        int endYear = bob.nextInt();

        int[] months = new int[12];//array for months
        for(int i=0;i<months.length;i++){ months[i] = i+1; }//adds months

        int[] oddDays = new int[31];//array for 31 days in odd certain months
        for(int i=0;i<oddDays.length;i++){ oddDays[i] = i+1; }//adds days

        int[] evenDays = new int[30];//array for 30 days in even certain months
        for(int i=0;i<evenDays.length;i++){ evenDays[i] = i+1; }//adds days

        int[] febDays = new int[28];//array for 28 days for febuary
        for(int i=0;i<febDays.length;i++){ febDays[i] = i+1; }//adds days

        int[] leapfeb = new int[29];//array for 29 days in feb on leap year
        for(int i=0;i<leapfeb.length;i++) { leapfeb[i] = i+1; }//adds days


        int yearcount = startYear;//starts the year count on the year it starts to count
        int monthcount = startMonth;//starts the month count on the month it starts to count
        int daycount = startDay;//starts the day count on the day it starts to count
        int dayspassed = 0; //a count to see how many days passed
        int monthspassed = 0;//to see how many months passed


        boolean done = false;

        while(!done){

            if(months[monthcount] == 2){ //if it's febuary
                if(monthspassed!=0){daycount= 0;}//set count to zero every new month
                if(monthspassed!=0){startDay= 0;}//reset to count days till end day every new month
                if(yearcount % 4 == 0){//if it's a leap year

                    //if the month and year are the same then count till the end day
                    if(monthcount == endMonth && yearcount == endYear){
                        for(int i = daycount; i < endDay; i++){
                            dayspassed++;
                            startDay++;
                        }
                    }
                    else {
                        for (int i = daycount; i < leapfeb.length; i++) {//go through febuary on day it start
                            dayspassed++;//as it goes through add days to the count
                            startDay++;
                        }
                        monthspassed++;//add to how many months passed and to see if loop done once
                        monthcount++;
                    }
                }//end of leap year feb

                else {//if it's a normal year

                    //if the month and year are the same then count till the end day
                    if(monthcount == endMonth && yearcount == endYear){
                        for(int i = daycount; i < endDay; i++){
                            dayspassed++;
                            startDay++;
                        }
                    }
                    else {
                        for (int i = daycount; i < febDays.length; i++) {//go through febuary on day it start
                            dayspassed++;//as it goes through add days to the count
                            startDay++;
                        }
                        monthspassed++;//add to how many months passed and to see if loop done once
                        monthcount++;
                    }
                }
            }//end of febuary if


            else if(months[monthcount] == 8){ //if it's august

                if(monthspassed!=0){daycount= 0;}//set day to zero if loop done once
                if(monthspassed!=0){startDay= 0;}//reset to count days till end day every new month

                //if the month and year are the same then count till the end day
                if(monthcount == endMonth && yearcount == endYear){
                    for(int i = daycount; i < endDay; i++){
                        dayspassed++;
                        startDay++;
                    }
                }


                else {
                    for (int i = daycount; i < oddDays.length; i++) {//go through august on day it start
                        dayspassed++;//as it goes through add days to the count
                        startDay++;
                    }
                    monthspassed++;//add to how many months passed and to see if loop done once
                    monthcount++;
                }
            }//end of august if


            else if(months[monthcount] == 4 || months[monthcount] == 6 ||
                    months[monthcount] == 9 || months[monthcount] == 11){ //months with 30 days

                if(monthspassed!=0){daycount= 0;}//set day to zero if loop done once
                if(monthspassed!=0){startDay= 0;}//reset to count days till end day every new month

                //if the month and year are the same then count till the end day
                if(monthcount == endMonth && yearcount == endYear){
                    for(int i = daycount; i < endDay; i++){
                        dayspassed++;
                        startDay++;
                    }
                }

                else {
                    for (int i = daycount; i < evenDays.length; i++) {//go through on day it start
                        dayspassed++;//as it goes through add days to the count
                        startDay++;
                    }
                    monthspassed++;//add to how many months passed and to see if loop done once
                    monthcount++;
                }
            }//end of even month if


            else{ //months with 31 days

                if(monthspassed!=0){daycount= 0;}//set day to zero if loop done once
                if(monthspassed!=0){startDay= 0;}//reset to count days till end day every new month

                //if the month and year are the same then count till the end day
                if(monthcount == endMonth && yearcount == endYear){
                    for(int i = daycount; i < endDay; i++){
                        dayspassed++;
                        startDay++;
                    }
                }

                else{
                    for(int i = daycount; i < oddDays.length; i++) {//go through on day it start
                        dayspassed++;//as it goes through add days to the count
                        startDay++;
                    }
                    monthspassed++;//add to how many months passed and to see if loop done once
                    monthcount++;
                }
                if(monthcount==12){ yearcount++; }//it it's december and it passed add a year
                if(monthcount==12){ startDay = 0;}//if it passes december the new month is january
                if(monthcount==12){ monthcount = 0; }//sets for the new month january 1st
            }//end of odd month if



            if(startDay==endDay&&monthcount==endMonth&&yearcount==endYear){
                done =  true;
            }
            //if the counter for the day and month and year match up, then the loop is done

        }//end of while loop

        int weeks = dayspassed/7;//how many weeks you have to save money
        //int daysleft = dayspassed%7;//what is the remainder of days

        double total = goal - saved;

        double save_up = total / weeks;

        System.out.println(" ");
        System.out.println("   Your going to need to save up:  ");
        System.out.println("    $" + save_up+ " per week");
        System.out.println(" ");
        System.out.println("   That is in a total of " + dayspassed + " days");
        System.out.println(" ");
        System.out.println("   Which is about " + weeks+ " weeks ");
        System.out.println("   ");

        if(save_up > 50.0){System.out.println("   It may look hard but you can do this");}

        //long endTime = System.nanoTime();
        //long elapsedMS = (endTime - startTime) / 1000000;
        //System.out.println("Elapsed time = " + elapsedMS + " milliseconds.");

    }//end of budget thing
}//end of main