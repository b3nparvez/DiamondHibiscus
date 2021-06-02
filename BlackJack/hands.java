package com.company;

import java.util.ArrayList;
import java.util.Random;

public class hands {
    private ArrayList<Integer> hand;

    /**
     * this is a constsructor that makes the hand able to be utilized by the program
     * @param a
     */
    public hands(ArrayList<Integer> a){
        this.hand = a;
    }

    /**
     * this method gives a random card to whatever hand it's being given too
     * @return
     */
    public int givecard(){
        Random fate = new Random();
        int card = fate.nextInt(13)+1;
        hand.add(card);
        return card;
    }

    /**
     * this method get's the size of the hand!!
     * @return
     */
    public int thesize(){
        int size = hand.size();
        return size;
    }

    /**
     * this method gets the element in the position of the hand
     * @param position
     * @return
     */
    public int gottem(int position){
        int thing = hand.get(position);
        return thing;
    }

    /**
     * this method switches a value of a card in a hand!!
     * @param postion
     * @param value
     * @return
     */
    public int set(int postion, int value){
        int thing = hand.set(postion,value);
        return thing;
    }
}
