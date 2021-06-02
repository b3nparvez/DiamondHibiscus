package com.company;
import java.util.*;

public class Main {

    /**
     * WELCOME TO THE MOST BEST PROGRAM EVER WHEN IT COMES TO BLACKJACK, this program is designed to be
     * exactly like blackjack. Here is how
     *
     * the user and two smart opponents(a.i) are given two cards. for the user, you can see your own cards
     * but for the opponents cards, you only see thier first card like in blackjack, you can't see
     * thier other cards that they can recive. if you would like a card. you say "hit" if you don't you
     * saw "nah". same rules apply for the A.I. face cards are worth over 10 corespoding on thier value,
     * J = 11 Q = 12  K= 13 and the ace card can be changed to an 11 or 1. at the end the totals are tallied up,
     * whoever has the highest score, wins but that's only if you didn't bust.
     * Your oponnets have names that are randomized so it won't feel too sad and unrealistic
     *
     * made by Suad Parvez
     *
     * java 11.1
     * @param args
     */
    public static void main(String[] args) {

        Random fate = new Random();//randomizer
        Scanner bob = new Scanner(System.in);

        String[] names = {"Suad", "Mery", "Kitty", "Arsalan", "Julian", "Dylan", "Brendan",
        "Shari", "Violet", "Florida Josh", "Afro Josh", "Ethan", "Jude", "James", "Randy", "Bob", "Nicca",
        "Steven", "Amir", "God", "Jack", "Ethan2.0", "Tori", "Naruto", "Your Mom", "Archer", "Lana",
        "AnimeLover28", "Ian", "Stephen", "Gusty", "Bella", "Ried", "Hendricks", "Jame", "Jamal",
        "Snake", "Sam Bridges", "Vincent", "Cathrine", "Kathrine", "Qathrine", "Rin", "Darcy", "Hannah", "Crystal"
        , "Kiara", "Daniela", "Darya", "Danny", "Ari", "Alina", "Laura", "Nina", "Shadman", "Pre-workout",
        "David", "Hassan", "Cayla", "Veronica", "Asian Alex", "Shakira", "Jlo", "Belle Delphine", "Keyera", "Paige", "brittney", "darcy"};
        int nice = names.length;
        int enemy = fate.nextInt(nice);
        int enemy2 = fate.nextInt(nice);
        String person;
        String person2;
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<String> peeps = new ArrayList<>();

        int bust = 22;//the failure zone
        int sum = 0;//sum of players card
        int sum1 = 0;//sum of enemy's cards
        int sum2 = 0;//sum of enemy's cards


        boolean play;//to see if they want to play
        int card;//random card given
        boolean hitme;//this shows that the player wants to keep going
        boolean hitme1;//this is for person to keep playing
        boolean hitme2;//this is for person2 to keep playing


        System.out.println("WELCOME PEASANT, TO THE GAME OF BLACKJACK! ready to lose you're money?");//shows encouraging message
        System.out.println("    (yes)       (no)");
        String choice = bob.next();//sees if person wants to play

        if(choice.equals("yes")){
            play = true;//makes the play option true so user can play
        }
        else{
            play = false;//makes it false if they don't want to play
            for(int i = 0; i <200; i++)
                System.out.println("Why must you hurt me like this");//don't pay attention to this
        }



        while(play != false) {//loop for the game

            //hands yahand = new hands();

            person = names[enemy];
            person2 = names[enemy2];
            peeps.add("YOU");//puts user into list
            peeps.add(person);//puts enemy into list
            peeps.add(person2);
            sum = 0;//initializes score
            sum1 = 0;
            sum2 = 0;
            scores.add(sum);
            scores.add(sum1);
            scores.add(sum2);
            hitme = true;//initializes the hit
            hitme1 = true;//initiallizes enemy hit
            hitme2 = true;//initiallizes 2nd enemy hit
            ArrayList<Integer> yaArray;

            ArrayList<Integer> yahand = new ArrayList<Integer>();//your hand
            ArrayList<Integer> theyhand1 = new ArrayList<Integer>();//the enemy's hand
            ArrayList<Integer> theyhand2 = new ArrayList<Integer>();//second enemy's hand
            hands ya = new hands(yahand);
            hands they1 = new hands(theyhand1);
            hands they2 = new hands(theyhand2);

            for(int i = 0; i < 2; i++){//loop to add starting cards for user
                //card = fate.nextInt(13)+1;
                //yahand.add(card);
                ya.givecard();
            }//end of for loop that adds starting cards
            for(int i = 0; i < 2; i++){//loop to add starting cards
                //card = fate.nextInt(13)+1;
                //theyhand1.add(card);
                they1.givecard();
            }//end of for loop that adds starting cards
            for(int i = 0; i < 2; i++){//loop to add starting cards
                //card = fate.nextInt(13)+1;
                //theyhand2.add(card);
                they2.givecard();
            }//end of for loop that adds starting cards



            while (hitme || hitme1 || hitme2) {//loop for cards being dealt


                System.out.println("These are your cards: ");
                for(int i = 0; i < ya.thesize(); i++){
                    System.out.println(" ");
                    //System.out.println(yahand.toString());
                    if(ya.gottem(i) == 11){
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  J  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        yahand.set(i,10);
                    }
                    else if(ya.gottem(i) == 12){
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  Q  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        yahand.set(i,10);
                    }
                    else if(ya.gottem(i) == 13){
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  K  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        yahand.set(i,10);
                    }
                    else if(ya.gottem(i) == 1){
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  A  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                    }
                    else{
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  " + ya.gottem(i) + "  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                    }
                    System.out.println(" ");
                }//end of for that prints user cards


                System.out.println("Here is " + person + "'s cards");
                if(they1.gottem(0)>10){
                    if (theyhand1.get(0) == 11) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  J  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        theyhand1.set(0,10);
                    } else if (they1.gottem(0) == 12) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  Q  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        theyhand1.set(0,10);
                    } else if (they1.gottem(0) == 13) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  K  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        theyhand1.set(0,10);
                    }//end of else if
                }
                else if(they1.gottem(0) == 1){
                    System.out.println(" _____");
                    System.out.println("|     |");
                    System.out.println("|  A  |");
                    System.out.println("|     |");
                    System.out.println(" _____");
                }//end of else if
                else{
                System.out.println(" _____");
                System.out.println("|     |");
                System.out.println("|  " + they1.gottem(0) + "  |");
                System.out.println("|     |");
                System.out.println(" _____");}
                for(int i = 1; i < they1.thesize(); i++){
                    //System .out.println(theyhand1.toString());
                    if(they1.gottem(i) > 10) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  ?  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        they1.set(i, 10);
                    }//end of if
                    else if(they1.gottem(i) == 1){
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  ?  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                    }//end of else if
                    else {
                        System.out.println(" ");
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  ?  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        System.out.println(" ");
                    }
                }//end of for that prints person's cards

                System.out.println("Here is " + person2 + "'s cards");
                if(they2.gottem(0)>10){
                    if (theyhand2.get(0) == 11) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  J  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        they2.set(0,10);
                    } else if (they2.gottem(0) == 12) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  Q  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        they2.set(0,10);
                    } else if (they2.gottem(0) == 13) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  K  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        they2.set(0,10);
                    }//end of else if
                }
                else if(they2.gottem(0) == 1){
                    System.out.println(" _____");
                    System.out.println("|     |");
                    System.out.println("|  A  |");
                    System.out.println("|     |");
                    System.out.println(" _____");
                }//end of else if
                else{
                    System.out.println(" _____");
                    System.out.println("|     |");
                    System.out.println("|  " + they2.gottem(0) + "  |");
                    System.out.println("|     |");
                    System.out.println(" _____");}
                for(int i = 1; i < they2.thesize(); i++){
                    //System .out.println(theyhand2.toString());
                    if(they2.gottem(i) > 10) {
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  ?  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        they2.set(i, 10);
                    }//end of if
                    else if(they2.gottem(i) == 1){
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  ?  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                    }//end of else if
                    else {
                        System.out.println(" ");
                        System.out.println(" _____");
                        System.out.println("|     |");
                        System.out.println("|  ?  |");
                        System.out.println("|     |");
                        System.out.println(" _____");
                        System.out.println(" ");
                    }
                }//end of for that prints person2's cards

                //AAAAAAAAAAAACCCCCCCCCCCCCCCCCCCCEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
                for(int i = 0; i < ya.thesize(); i++){//for loop that checks for ace and lets user change it
                    if(ya.gottem(i) == 1){             //if they want to
                        System.out.print("ya have an ace, would you like it to stay as a 1 or 11? ");
                        System.out.println("    ( 1 )      ( 11 ) ");
                        int ace = bob.nextInt();
                        ya.set(i,ace);
                    }
                }//end of for loop that checks for ace
                for(int i = 0; i < they1.thesize(); i++){//for loop that checks for ace and change it
                    if(they1.gottem(i) == 1){             //if they want to
                        int choose = fate.nextInt(2);
                        if(choose == 0){
                            they1.set(i,1);
                        }//end of if
                        else{
                            they1.set(i,11);
                        }//end of else
                    }//end of outer if
                }//end of for loop that checks for ace
                for(int i = 0; i < they2.thesize(); i++){//for loop that checks for ace change it
                    if(they2.gottem(i) == 1){             //if they want to
                        int choose = fate.nextInt(2);
                        if(choose == 0){
                            they2.set(i,1);
                        }//end of if
                        else{
                            they2.set(i,11);
                        }//end of else
                    }//end of outer if
                }//end of for loop that checks for ace
                //AAAAAAAAAAAAAAAAACCCCCCCCCCCCCCCCCCCCCCCCCCEEEEEEEEEEEEEEEEEEEEEEEEEEE

                sum = 0;
                for(int i = 0; i < ya.thesize(); i++){//adds up sum of cards
                    sum += ya.gottem(i);
                    scores.set(0,sum);
                }//end of for that sums up cards
                sum1 = 0;
                for(int i = 0; i < they1.thesize(); i++){//adds up sum of cards
                    sum1 += they1.gottem(i);
                    scores.set(1,sum1);
                }//end of for that sums up cards
                sum2 = 0;
                for(int i = 0; i < they2.thesize(); i++){//adds up sum of cards
                    sum2 += they2.gottem(i);
                    scores.set(2,sum2);
                }//end of for that sums up cards
                System.out.println("  ");
                System.out.println("This is your total so far: " + sum);
                //System.out.println("This is " + person + "'s total so far: " + sum1);
                //System.out.println("This is " + person2 + "'s total so far: " + sum2);


                //BBBBBBBBBUUUUUUUUUSSSSSSSSSTTTTTTTTTTTTTTTT
                if(sum >= bust){//if statment if user busted
                    System.out.println("  ");
                    System.out.println("OH WAIT LOL YOU BUSTED, YOU A BROKE BOI NOW");
                    System.out.println("YOU HAD A SCORE OF: " + sum);
                    scores.set(0,0);
                }//end of if user busted
                if(sum1 >= bust){//if person busted
                    System.out.println("  ");
                    System.out.println(person + " JUST GOT BUSTED, WHOOOO");
                    System.out.println(person + " HADA  SCORE OF: " + sum1);
                    scores.set(1,0);
                }//end of if person busted
                if(sum2 >= bust){//if person2 busted
                    System.out.println("  ");
                    System.out.println(person2 + " JUST GOT BUSTED, AWE YEAHHHHHH BOIIIIII");
                    System.out.println(person2 + " HAD A SCORE OF: " + sum2);
                    scores.set(2,0);
                }//end of if person2 busted
                //BBBBBBBBBBBUUUUUUUUUUSSSSSSSSTTTTTTTTTTTTTT
                //hands a = new hands(yahand);
                //hands(yahand);
                //user wanna get hit ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                if(sum < bust) {
                    if(hitme) {
                        System.out.println(" ");
                        System.out.println("Need another hit? ");//asks if wants to be hit
                        System.out.println("    (hit)    (nah)");//gives choise
                        String response = bob.next();//this is choice
                        if (response.equals("hit")) {//this is if they want more cards
                            //card = fate.nextInt(13) + 1;//picks random card
                            ya.givecard();//adds card to your hand
                        }//end of if
                        else if(response.equals("nah")){//this is if they are good
                            hitme = false;
                        }//end of else
                    }
                    else if(!hitme){
                        System.out.println(" ");
                        System.out.println("    do you feel anxious?");
                        System.out.println(" ");
                    }
                }
                else{
                    System.out.println(" ");
                    System.out.println("~~~lol you lost~~~");

                    hitme = false;
                }
                //person wanna get hit ++++++++++++++++++++++++++++++++++++++++
                if(sum1 < bust) {
                    if (hitme1 != false) {
                    if (sum1 == 21) {
                        hitme1 = false;
                    } else if (sum1 < 21 && sum1 >= 18) {
                        hitme1 = false;
                    } else if (sum1 < 18 && sum1 >= 0) {
                        hitme1 = true;
                        //card = fate.nextInt(13) + 1;
                        they1.givecard();
                    }
                }//end of if for hit
                }
                else{
                    System.out.println(" ");
                    System.out.println(person + " is now waiting FINAL JUDGMENT from GOD!!!~~~~~~~");
                    hitme1 = false;
                }
                //person2 wanna get hit ---------------------------------------
                if(sum2 < bust) {
                    if (hitme2 != false) {
                        if (sum2 == 21) {
                            hitme2 = false;
                        } else if (sum2 < 21 && sum2 >= 16) {
                            hitme2 = false;
                        } else {
                            hitme2 = true;
                            //card = fate.nextInt(13) + 1;
                            they2.givecard();
                        }
                    }
                }
                else{
                    System.out.println(" ");
                    System.out.println(person2 + " is now waiting FINAL JUDGMENT from GOD!!!~~~~~~~");
                    hitme2 = false;
                }
            }//end of inner while
            //System.out.println(scores.toString());
            //System.out.println(peeps.toString());
            int biggest = 0;
            String great = "";
            for(int i = 0; i < scores.size(); i++){
                if(scores.get(i) > biggest){
                    //System.out.println(scores.get(i));
                    biggest = scores.get(i);
                    great = peeps.get(i);
                }
            }
            System.out.println(" ");
            System.out.println(great + " HAS WON THE GAME WITH A WHOPPING SCORE OF: " + biggest);


            System.out.println(" ");
            System.out.println("WaNnA PlaAAAAAAAAAAy ANOther ROUND?????????");
            System.out.println("     ( yes )     ( no )");
            choice = bob.next();
            if(choice.equals("yes")){
                play = true;
            }
            else{
                play = false;
            }

        }//end of outter while
        System.out.println(" ");
        System.out.println("YOUR WELCOME");
        System.out.println("I just wasted time by being with you, you better thank me later");
        System.out.println(" ");
        System.out.println("You know what, i'm being too hard on you");
        System.out.println("Here, choose a random number between 1 and 5 for your prize");
        System.out.println("  (1)   (2)   (3)   (4)   (5)  ");
        int prizechoice = bob.nextInt();
        int thing = prizechoice - 1;
        String[] prizes = new String[5];
        prizes[0] = "COOKIE";
        prizes[1] = "DOLLAR";
        prizes[2] = "PILLOW";
        prizes[3] = "BOWL OF CURRY";
        prizes[4] = "THUMBS UP";
        //prizes[5] = "BOWL OF CURRY";
        try{
            System.out.println("CONGRATS YOU GOT A " + prizes[thing-1]);
        }
        catch (Exception e){
            System.out.println(" ");
            System.out.println("How did you mess this up i litterally even placed numbers out");
        }

    }//end of main program
}//end of blackjack
