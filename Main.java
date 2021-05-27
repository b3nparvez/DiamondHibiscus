import java.util.*;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Files;
/**
 * a main class that makes a scanner and a inventory object
 * it prints out the options and then asks what the player wants to do
 * each option utilizes the methods in the other classes, it quites if you press 6 
 * it's in a do while so it never stops unless you want it to stop.
 @author Suad
 @author Arsalan
 @author Paige
 */
public class Main{
	public static void main(String[] args) throws Exception{
		Scanner bob = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("                    ~  WELCOME TO ONE ROOM DUNGEON GAME ~");
		System.out.println("      ");
		System.out.println("                 YOU, THE HERO HAS ENTERED THE DEMON'S KINGS ");
		System.out.println("                 CASTLE. SADLY, HIS CASTLE ONLY HAS THREE ROOM"); 
		System.out.println("               BECAUSE HE HAS A SMALL BRAIN AND GOT RIPPED OFF");
		System.out.println("            BY THE MOST FAMOUS AND HANDSOME CON-ARTIST, SUAD PARVEZ.");
		System.out.println("        YOU ARE HERE TO KILL THE DEMON KING, GARRETTE DAYKWON AND ARI.");
		System.out.println("       BECAUSE THEY HAVE STOLEN ALL THE CURRY IN THE LAND OF 'SCHOP SCHOP' ");
		System.out.println("              RESTORE THIS LANDS GLORY AND DEFEAT THE DEMON KING!");
		System.out.println("   ");
		System.out.println("    ");
		System.out.println(" How to play:");
		System.out.println("              You, the Hero, will be represented on the board by the '+' symbol.");
		System.out.println("              Your enemy, the Demon King Garret, will be represented by the ':(' symbol.");
		System.out.println("              He is known for being thirsty and pacing back and forth. Watch out, he is tough as fudge");
		System.out.println("              Ari THE WOMAN will be represented by the '?' symbol.");	
		System.out.println("              She has gone crazy and roams aimlessly around the room, you may need to chase her.");
		System.out.println("       ");	
		System.out.println("              Move throughout the board collecting as many items '<$>' as you can to defeat the game.");
		System.out.println("              If you do happen to run into either enemy, you must dual it out to see who wins!");
		System.out.println("              Preferably you please, bob already went in there and we have no idea where he is..");
		System.out.println("    ");
		System.out.println("                                 Press 'w' to move UP. ");
		System.out.println("                                 Press 's' to move DOWN. ");
		System.out.println("                                 Press 'a' to move LEFT. ");
		System.out.println("                                 Press 'd' to move RIGHT. ");
		System.out.println("                                 Press 'i' to access inventroy. ");
		System.out.println("                                 Press 'q' to activate not alive mode.");
		System.out.println("                                 Press 'l' to load previous game.");
		System.out.println("  ");

		Inventory stuff;
		Dreams dream1;
		Room room; Room room2; Room room3;

		/**
		  utilizes the file save method.
		  */
		System.out.println("Would you like to load your previous game? 'y' 'n'");
		String x = bob.next();
		if (x.equals("y")){
			try{
				
				FileInputStream fileIn = new FileInputStream("data.txt");
       			        Scanner suad = new Scanner(fileIn);

				String nam = suad.nextLine();
				
				String calass = suad.nextLine();
				System.out.println(calass);
				int life = suad.nextInt();
				


			}catch (FileNotFoundException e){
				System.out.println("File Not Found");
				return;
			}



		}//end of if for saying yes to load

		stuff = new Inventory(100000000);
		dream1 = new Dreams();
		room = new Room(20,20);
		room2 = new Room(20,20);
		room3 = new Room(20,20);

		ArrayList<Character> people = new ArrayList<Character>();
		System.out.println(" ");
		System.out.println("                       WHAT IS YOUR NAME HERO??");
		System.out.println(" ");
		System.out.print("                                  ");
		String Name = bob.next();

		System.out.println(" ");
		System.out.println("                          WHAT IS YOUR CLASS??");
		System.out.println("              (FratBoi)  (JucciBoi)  (NerdBoi)  (Arsalan) ");
		System.out.println(" ");
		System.out.print("                                    ");
		String Class = bob.next();
		people.add(new Hero(Name, 100, Class));

		stuff.noobGear();//to give the hero a default gear weapon and armour

		System.out.println(" ");
		System.out.println("             Remember " + people.get(0).getname() + ", to see the instrucitons, press 'p'.");
		System.out.println(" ");
		System.out.println("           Now remember not to ask any questions becuase this is a video game");
		System.out.println("   ");
		System.out.println("   ");


		people.add(new Enemy("Garret THE DEMON KING", 200, new Item(ItemType.weapon,"BasketBall", 4, 70, 70)));
		people.add(new Enemy("Ari THE WOMAN", 200, new Item(ItemType.weapon,"Cellphone", 345,543,60)));
		String input = " ";//declares and initializes the input variable
		//fully creates the rooms
		room.create();
		room2.create2();
		room3.create3();



		while(people.get(0).isAlive()){//keeps going until player is dead 
			System.out.println(" ");

			//prints out board depending on location
			if(room.isHere()){//if in the first room
				room.print();//prints out the room
			}//end of if
			else if(room2.isHere()){//if in the second room
				if(people.get(2).isAlive()){//checks to see if ari is alive
					room2.printA();//if so print out room with her in it
				}
				else{
					room2.printG();//if not, print out room without her cuz she dead
				}
			}//end of else if
			else if(room3.isHere()){//if in the third room
				if(people.get(1).isAlive()){//check to see if garret is alive
					room3.printG();//if so print out the room wit hhim in it
				}
				else{
					room3.printA();//if not print out room without him cuz he dead
				}
			}//end of else if

			System.out.println(" ");
			System.out.println("              ");
			System.out.print("                      ");
			input = bob.next();//input from user

			//if stemtnet for giving best gear
			if(input.equals("suad")){
				stuff.godGear();
			}
			//if statment for movment 
			if(input.equals("w") || input.equals("a") || input.equals("s") || input.equals("d")){
				if(room.isHere()){
					room.MOVE(input);//to move the character in the room
				}
				else if(room2.isHere()){
					room2.MOVE(input);
				}
				else if(room3.isHere()){
					room3.MOVE(input);
				}

				if(room3.isHere() && room3.garretFight() && people.get(1).isAlive()){
					System.out.println(" WHAT? YOUR FACING " + people.get(1).getname() + "!! YOU BETTER WATCH OUT.");
					System.out.println(" HE WAS LOOKING AT YOU THROUGH HIS TELESCOPE BEFORE YOU CAME HERE!");
					System.out.println(" AND HE LIKED WHAT HE SAW. PROBABLY ENOUGH TO WANT A BABY WITH YOU!");
					System.out.println(" DON'T ASK HOW I KNOW THAT WE DON'T HAVE TIME");
					System.out.println(" ");
					while(people.get(0).isAlive() && people.get(1).isAlive()){
						//enemy damage - the armor is the damage the enemy can deal
						int enemyhit = people.get(1).power() - stuff.protection();
						//your weapons damage is the damage you can do
						int brohit = stuff.power() + stuff.buff();
						System.out.println("Press 'k' to attack");
						String attack = bob.next();
						if(attack.equals("k")){
							//the enemy gets damaged by the hero's hit
							people.get(1).damage(brohit);//the hero's hit is in the parameter
							System.out.println(" ");
							System.out.println("You attacked Garret with your " + stuff.currentWeapon() + ". You did " + brohit + " damage to him!");
							System.out.println(" His health is now " + people.get(1).health());
							System.out.println(" ");
						}
						else{
							System.out.println(" ");
							System.out.println("your so dumb that wasn't the letter k");
							System.out.println("you deserve to perish!");
							System.out.println(" ");
							people.get(0).kill();
						}
						if(people.get(1).isAlive() && people.get(0).isAlive()){
							people.get(0).damage(enemyhit);
							System.out.println(" ");
							System.out.println("Garret hit you with his " + people.get(1).equippedWeapon() + ". It did " + enemyhit + " damage!");
							people.get(1).boyTaunt();
							System.out.println("your health is now " + people.get(0).health());
							System.out.println(" ");
						}
					}//end of while fight
					if(!people.get(0).isAlive()){
						System.out.println(" ");
						System.out.println(people.get(0).getname() + "!?!?!?! YOU CAN'T DIE NOW!!!");
						for(int i = 0 ; i < 6; i++){
							System.out.println("AAAAAAHHHHHHHHHHHHHHH");
						}
						people.get(1).boyTaunt();
					}//end of losing message
					if(people.get(0).isAlive()){
						System.out.println(" ");
						System.out.println(" You have defeated " + people.get(1).getname() + "!!!!!");
						System.out.println(" ");
						people.get(0).boyTaunt();
					}
				}//end of if for garret interaction  interaction

				if(room2.isHere() && room2.ariFight() && people.get(2).isAlive()){
					System.out.println(" ");
					System.out.println(" HOLY COW IT'S " + people.get(2).getname() + "!! SHE IS WELL KNOWN FOR COMPLAINING");
					System.out.println(" NO MAN CAN HANDLE THE PURE TEENAGE DRAMA SHE IS CAPABLE OF SUMMONING");
					System.out.println(" IF YOU DON'T BEAT HER QUICK SHE'LL DROWN YOU IN BORING SPEECHES");
					System.out.println(" ");
					while(people.get(0).isAlive() && people.get(2).isAlive()){
						//enemy damage - the armor is the damage the enemy can deal
						int enemyhit = people.get(2).power() - stuff.protection();
						//your weapons damage is the damage you can do
						int brohit = stuff.power() + stuff.buff();
						System.out.println(" ");
						System.out.println("Press 'k' to attack");
						System.out.println(" ");
						String attack = bob.next();
						if(attack.equals("k")){
							//the enemy gets damaged by the hero's hit
							people.get(2).damage(brohit);//the hero's hit is in the parameter
							System.out.println(" ");
							System.out.println("You attacked " + people.get(2).getname() + "  with your " + stuff.currentWeapon() + ". You did " + brohit + " damage to her!");
							System.out.println(" Her health is now " + people.get(2).health());
							System.out.println(" ");
						}
						else{
							System.out.println(" ");
							System.out.println("your so dumb that wasn't the letter k");
							System.out.println("you deserve to perish");
							System.out.println(" ");
							people.get(0).kill();
						}
						if(people.get(2).isAlive()&& people.get(0).isAlive()){
							people.get(0).damage(enemyhit);
							System.out.println(" ");
							System.out.println("Ari hit you with her " + people.get(2).equippedWeapon() + ". It did " + enemyhit + " damage!");
							people.get(2).girlTaunt();
							System.out.println("your health is now " + people.get(0).health());
							System.out.println(" ");
						}
						System.out.println(" ");
						people.get(0).girlTaunt();
					}//end of while fight
					if(!people.get(0).isAlive()){
						System.out.println(" ");
						System.out.println(people.get(0).getname() + "!?!?!?! YOU CAN'T DIE NOW!!!");
						for(int i = 0 ; i < 8; i++){
							System.out.println("AAAAAAHHHHHHHHHHHHHHH");
						}
					}//end of losing message
					if(people.get(0).isAlive()){
						System.out.println(" ");
						System.out.println(" You have defeated " + people.get(2).getname() + "!!!!!");
						System.out.println(" ");
						people.get(0).girlTaunt();
					}
				}//end of if for ari fight interaction

				if(people.get(1).isAlive()){//if garret is alive, make him move
					room3.enemymoveGarret();
				}
				if(people.get(2).isAlive()){//if ari is alive , make her move
					room2.enemymoveAri();
				}	
			}//end of if for movement


			//if statment to see if there is a door or staris leading to other area
			if(room.isHere() && room.onDoor()){//if the player is in the first room

				System.out.println(" ");
				System.out.println(" 			NANI?!?!? Your near a door, it leads to the next room..." );
				System.out.println(" 			Want to go through it? 'yes' 'no' ");
				System.out.println(" ");
				//ask them if they want to enter and go to next room
				String response = bob.next();
				if(response.equals("yes")){
					System.out.println(" ");
					System.out.println("		What a brave person you are");
					for(int i = 0; i < 300 ; i++){
						System.out.println(" YYYYYYYYYYYYYYYYYYYYYYYYYYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEETTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
					}
					System.out.println(" ");
					room.ghost();//clear out the players position in the current room
					room2.ghost();//clear our the room leading up just in case
					room2.teleportTo(1,2);//add the players position in the coming room
					System.out.println(" ");
					if(people.get(2).isAlive()){
						dream1.ariDream();//initiates the flashback to show what happend with ari
						if(dream1.getSadness() >=3  ){//if the flashback was level 3 sad increas ari's health to 300
							people.get(2).levelUp(300,90);
						}
						else if(dream1.getSadness() == 2 ){//if level 2 sad increase her health to 250
							people.get(2).levelUp(250,80);
						}
						else if(dream1.getSadness() == 1){//if level 1 sad increase her health to 220
							people.get(2).levelUp(220,70);
						}
					}//end of if for flashback sequence
					System.out.println(" 		Welcome to the second room");
					System.out.println(" ");
				}
				else{
					System.out.println(" 		um because you didn't say 'yes' i cannot consensually let you go through");
					System.out.println(" ");
				}

			}
			else if(room2.isHere() && room2.onStairs()){

				System.out.println(" ");
				System.out.println("                    NANI?!?!? Your near somes stairs, it leads to the next room... up above...spoooooookyyyyyy" );
				System.out.println("                    Want to go up it? 'yes' 'no' ");
				System.out.println(" ");
				//ask them if they want to enter and go to next room
				String response = bob.next();
				if(response.equals("yes")){
					System.out.println(" ");
					System.out.println("            Get ready for a lot of walking");
					for(int i = 0; i < 300 ; i++){
						System.out.println(" YYYYYYYYYYYYYYYYYYYYYYYYYYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEETTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
					}
					System.out.println(" ");
					room2.ghost();//clear the players position in the current room 
					room3.ghost();//clear the players position in the coming room just in case
					room3.teleportTo(1,1);//put the player in the next room
					if(people.get(1).isAlive()){
						dream1.garretDream();
					}
					System.out.println(" ");
					System.out.println("            Welcome to the third room");
					System.out.println(" ");
				}
				else{
					System.out.println("            that doens't sound like a 'yes'");
					System.out.println(" ");
				}
			}//end of else if for room2 and stairs

			else if(room2.isHere() && room2.onDoor()){//and they are at a door to go back down 
				System.out.println(" ");
				System.out.println("            		        HHHHHHHHHHMMMMMMMMMMMMM  that's the door that leads back to the other room." );
				System.out.println("            			        Want to go through it? 'yes' 'no' ");
				System.out.println(" ");
				//ask them if they want to enter and go to next room
				String response = bob.next();
				if(response.equals("yes")){
					System.out.println(" ");
					System.out.println("            okaaayyyyy");
					for(int i = 0; i < 300 ; i++){
						System.out.println(" YYYYYYYYYYYYYYYYYYYYYYYYYYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEETTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
					}
					System.out.println(" ");
					room.ghost();//clears the player's position in the current room
					room2.ghost();//clears the player's position in the room they're going to just in case
					room.teleportTo(9,12);//put the players position in the room down below
					System.out.println(" ");
					System.out.println("            Welcome to the first room");
					System.out.println(" ");
				}
				else{
					System.out.println("            Come back when your answer is 'yes'");
					System.out.println(" ");
				}
			}//end of if

			else if(room3.isHere() && room3.onStairs()){//if they are in the third room

				System.out.println(" ");
				System.out.println("              				      These are the same stairs you went up from, taking these again will take you downy" );
				System.out.println("               					     Want to go down it? 'yes' 'no' ");
				System.out.println(" ");
				//ask them if they want to enter and go to last room
				String response = bob.next();
				if(response.equals("yes")){
					System.out.println(" ");
					System.out.println("            Get ready for a lot of walking");
					for(int i = 0; i < 300 ; i++){
						System.out.println(" YYYYYYYYYYYYYYYYYYYYYYYYYYEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEETTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
						System.out.println("    ");
					}
					System.out.println(" ");
					room2.ghost();//clears the players position in the room they are going to just in case
					room3.ghost();//clears the players position in the room they are currently in
					room2.teleportTo(18,17);//adds the players location in the laast room where the stairs end
					System.out.println(" ");
					System.out.println("       			     Welcome to the second room");
					System.out.println(" ");
				}
				else{
					System.out.println("   				         that doens't sound like a 'yes'");
					System.out.println(" ");
				}

			}//end of if there is a door if statment

			//for the input if you need to look at directions again
			if(input.equals("p")){
				System.out.println(" ");
				System.out.println("                         How to play:");
				System.out.println("                                                        You, the Hero, will be represented on the board by the '+' symbol.");
				System.out.println("        					        Your enemy, the Demon King Garret, will be represented by the ':(' symbol. He is super sad so he walks in a path");
				System.out.println("    					            Ari THE WOMAN will be represented by the '?' symbol. She is CRAZY so you need to chase her");
				System.out.println("       ");
				System.out.println("         					       Move throughout the board collecting as many items '<$>' as you can to find a powerful weapon.");
				System.out.println("            					    If you do happen to run into either enemy, you must dual it out to see who wins!");
				System.out.println("    ");
				System.out.println("      			                             Press 'w' to move UP. ");
				System.out.println(" 				                                  Press 's' to move DOWN. ");
				System.out.println("                           				        Press 'a' to move LEFT. ");
				System.out.println("               			                    Press 'd' to move RIGHT. ");
				System.out.println("               				                    Press 'i' to access inventroy ");
				System.out.println("                            			       Press 'q' to activate not alive mode");
				System.out.println(" ");
			}//end of if for printing controls

			if(input.equals("q")){
				System.out.println("Would you like to save and quit?");
				String yo = bob.next();
				if (yo.equals("y")){
					try{
						FileOutputStream file = new FileOutputStream("data.txt");
						PrintWriter pw = new PrintWriter(file);



						Character Me = people.get(0);
						Me.save(pw);//saves Character's info such as (name, class, health, isAlive));


						Character Ari = people.get(1);
						Ari.save(pw);//saves the health of ari


						Character Garret = people.get(2);
						Garret.save(pw);//saves the health of Garret

						room2.save2(pw);//saves the coordinates of Ari


						room3.save(pw);//saves the coordinates of Garret

						room.save3(pw);//saves the coordinates of Hero
						room2.save3(pw);//If in room2 it saves those coordinates
						room3.save3(pw);//If in room3 it saves those coordinates
						room.save4(pw);//saves the coordinates of Items
						room2.save4(pw);//saves the coordinates of Items in room2
						room3.save4(pw);//saves the coordinates of Items in room3
						stuff.save(pw);//saves the current weapon of the player
						stuff.save2(pw);//saves the current armor of the player
						stuff.save3(pw);//saves the inventory of the player


						pw.close();

					}catch(FileNotFoundException e){
						System.out.println("not found");
					}
					people.get(0).kill();
				}else{
					people.get(0).kill();
				}

			}//end of if for quit

			//input for LOADING game
			if(input.equals('l')){
				try{
					FileInputStream file = new FileInputStream("data.txt");
					Scanner in = new Scanner (file);

				}catch (FileNotFoundException e){
					System.out.println("File Not Found");
				}


			}


			//input for inventory
			if(input.equals("i")){
				boolean go = true;//variable to make loop go forever until it's false

				do{

					System.out.println(" ");
					System.out.println("                           Your current weapon is " + stuff.currentWeapon());
					System.out.println("                     Your current Armor is " + stuff.currentArmor());
					System.out.println(" ");
					System.out.println("                                    1. Print the inventory");
					System.out.println("                         2. Drop an item");
					System.out.println("               3. Equip weapon");
					System.out.println("                           4. Equip armor");
					System.out.println("                    5. Use heal ");
					System.out.println("                                        6. Equip buff");
					System.out.println("                                    7. quit");
					System.out.println(" ");
					int choice = bob.nextInt();
					switch(choice){
						case 1://print inventory
							stuff.print();
							break;
						case 2://drop item
							stuff.drop();	
							break;
						case 3://equp weapon
							stuff.equipWeapon();
							break;
						case 4://equp armor
							stuff.equipArmor();
							break;
						case 5://heals
							int juice = stuff.heal();
							people.get(0).heal(juice);
							break;
						case 6://equip buff
							stuff.equipBuff();
						case 7://exit
							System.out.println("    ");
							System.out.println("                        Do you want to get back in the game?    'y'  'n'   ");
							String select = bob.next();
							if (select.equals("y")){
								go = false;
								break;
							}else{
								go = false;
							}



					}//end of swtich
				}while(go);//end of do while
			}//end of if of inventory choice


			if(room.itemonfloor()){
				stuff.add(room.pickup());
			}//end of if for checking if item is on the floor.
			if(room2.itemonfloor()){
				stuff.add(room2.pickup());
			}
			if(room3.itemonfloor()){
				stuff.add(room3.pickup());
			}


			if(!people.get(1).isAlive() && !people.get(2).isAlive()){
				for(int i = 0 ; i < 5 ; i++){
					System.out.println(" 							    YYYYYYYYAAAAAAAAAAAAAAAAAAAAAAAAYYYYYYYYYYY");
					System.out.println("                 							    YOU HAVE WON ");
				}
				System.out.println(" ");
				System.out.println("    						  YOU HAVE DONE IT, YOU HAVE KILLED THE DEMON KING AND HER QUEEN");
				System.out.println("    							  The curry can now be restored to the land of 'SCHOP SCHOP'");
				System.out.println("      						       Now you can finally rest in peace and die. ");
				System.out.println("              						       Are you ready to die? ");
				System.out.println(" ");
				System.out.print("                                                                          ");
				String response = bob.next();
				System.out.println(" ");
				System.out.println("                                      What's that?? I can't hear you because I am a virtual machine. Oh well.. lolz You probably said 'yes' ");
				System.out.println("                                                               Thank you for your service " + Name + ". Good game.");
				System.out.println(" ");
				people.get(0).kill();
			}//end of if for winning message 


		}//end of while alive check
	}//end of main

	}//end of Main
