import java.util.Scanner;

/**
 * The Dream class is the additional component added to the game because what's a game without some fantastic dialog?
 *  It is an interactional class composed mainly of dialog. 
 *  Players can enter into this dream sequence in various ways throughout the game. 
 *  @author Suad Parvez
 *  */

public class Dreams{

	int sad;

	/**
	 *constructor that makes a sadness meter basically a number variable for the flashbacks
	 */
	Dreams(){
		this.sad = 0;
	}
	/**
	 *this method is to return the meter value in integers  on how sad the dream was
	 @return sad 
	 */
	public int getSadness(){
		return this.sad;
	}//end of getsadness

	/**
	 *this method is to print out a pretty picture for ari's flashback
	 */
	public static void scene(){
		System.out.println("               @@");
		System.out.println("              @@@@@");
		System.out.println(" ");
		System.out.println("     _                                          @@");
		System.out.println("    |_|                                       @@@@@");
		System.out.println("                           __");
		System.out.println("                          |  |");
		System.out.println("       ``            __   |  |              ``");
		System.out.println("    ``   ``         |  |  |  |__               ``");
		System.out.println("                  __|  |__|  |  |");
		System.out.println("                 |  |  |  |  |  |");
		System.out.println("                 |  |  |  |  |  |__               * ****** *** ");
		System.out.println("_________________|  |  |  |  |  |  |_______________|__|_|___|__");
		System.out.println("                                                 ****   **** **");
		System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~                     |  |   | |  | ");
		System.out.println("          ~~~~~~~~~~~~~~~~~~~~~~~~~                    ");
		System.out.println("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
	}//end of scene

	/**
	 * this is a method to print out a nother pretty picture for garret's flashback
	 */
	public static void scene2(){

		System.out.println("                                        ");
		System.out.println("                 @@@                          @@           _  ");
		System.out.println("                @@@@@                                     |_|");
		System.out.println("                                 ``                       ");
		System.out.println("                        ``			``	");
		System.out.println("          ___      			@@@	");
		System.out.println("          | |                      @@@@@       ");
		System.out.println("          |_|                             ");
		System.out.println("           |                             ");
		System.out.println("        ___|__________;_                                 ");
		System.out.println("        ||||||||||||||/                       ");
		System.out.println("        |            /                       ");
		System.out.println("        |           /                     ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^                                        ");
		System.out.println("                                        ");
		System.out.println("                               ^^^^^^^^^^^^^^          ");
		System.out.println("       ^^^^^^^^^^^^^^^^^^^^^^                                     ");
		System.out.println("                                            ");
		System.out.println("                                        ");
		System.out.println("                             ^^^^^^^^^^^^^^           ");
		System.out.println("        ^^^^^^^^^^^^^^^                                        ");
		System.out.println("                                         ");
		System.out.println("                                            ");
		System.out.println("                                            ");
	}//end of scene2

	/**
	 *this is a method to just put a bunch of screams and discord on the screan via strings it's done through a for loop
	 */
	public static void scream(){
		for(int i = 0; i <200 ; i++){
			System.out.println("          aaa         a     a      aaaaaaaaaaaaa    aaaaaa       aaaaaaaa");
		}
		for(int i = 0; i <200 ; i++){
			System.out.println("          aaaa        aa    aa     aaaaaaaaa         aaaaaa       aaaaaaaa");
		}
		for(int i = 0; i <200 ; i++){
			System.out.println("          aaa         a     a      aaaaaaaaaaaaa    aaaaaa       aaaaaaaa");
		}
		for(int i = 0; i <200 ; i++){
			System.out.println("          aaaaaaa    aaaaa  aaa      aaaaaaaaaaaaa    aaaaaa       aaaaaaaa");
		}
		for(int i = 0; i <200 ; i++){
			System.out.println("          aaaaaaaa     a     a      aaaaaaa            aaaa       aaaaaaaaaaa");
		}
		for(int i = 0; i <500 ; i++){
			System.out.println("         WHY   WHY   WHY   WHY    WHY   WHY    WHY    WHY    WHY    WHY   WHY ");
		}
		Dreams.blank(5);
	}//end of scream


	/**
	 * this method is to print out a black space.
	 @param yee varible used to print black space.
	 */
	public static void blank(int yee){
		for(int i =0; i < yee ; i++){
			System.out.println(" ");
		}
	}//end of blank method

	/**
	 * this is the method that initiates the ari dream, it's a flash back that goes back in time that lets the uesr know what
	 * happend back in the past, your choices affects ari's stats
	 */
	public void ariDream(){
		Scanner bob = new Scanner(System.in);
		Dreams.blank(100);		
		Dreams.scene();
		System.out.println("         Ari, what a time that was. We met in the land of BING BANG, not to be confused with BING BONG  ");
		System.out.println("         Everything was so nice back then, what happend???");
		Dreams.blank(3);
		System.out.println("                 ***remember this is a fuzzy memorey of yours, so the story molds to your desicions***");
		System.out.println("                       ***bad choices leads to a sadder story, which gives ari more trama***");
		System.out.println("                     ***more trama can make ari stronger, try to make this a happy memorey***");
		String blip = bob.next();
		Dreams.blank(2);
		System.out.println("                              7 years ago ");
		System.out.println(" ");
		blip = bob.next();
		String repeat;
		boolean loop = true;
		do{//keep having this dream until you recal exactly what happend
			System.out.println("        ");
			Dreams.scene();
			System.out.println("        Ari and i were sitting next to a tree, a beutiful tree, it grows curry, such delicious curry");
			System.out.println("        Ari's head rested on my shoulder, we were both are comfortable, we felt the warm breeze of the BING BANG");
			System.out.println("        Did i punched Ari? or gave her a kiss      'punch'   'kiss'");
			String choice = bob.next();
			if(choice.equals("kiss")){
				System.out.println(" ");
				Dreams.scene();
				System.out.println("        +sad points");
				this.sad++;
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("        oh yeah i reached in for a kiss, but i accidently missed and kissed her dad instead");
				System.out.println("        ");
				System.out.println("        Ari:  Hey what the heck?!!?! That's my dad!!");
				System.out.println("        ");
				blip = bob.next();
				System.out.println("        Man, that was really akward. i had to do somthing to make it up");
				System.out.println("        Did i punched Ari? or gave her some flowers?   'punch'  'flowers'");
				System.out.println("        ");
				choice = bob.next();
				if(choice.equals("punch")){
					Dreams.scene();
					System.out.println("        Oh yeah i punched Ari, but i was so weak/small body and Ari was such a strong woman that ");
					System.out.println("        It didn't hurt whatsoever and she though i were flirting with her");
					System.out.println("        ");
					System.out.println("        Ari:  oooh i like a man that can consensually take charge");
					System.out.println("        Ari:  You remind me of Roy Paino; I love that man, just like i love you");
					System.out.println("        ");
					blip = bob.next();
					System.out.println("        That's a very serious statment she just made, i've only known her for a week and Roy Paino is ");
					System.out.println("        almost as strong as michael jackson, which is pretty lit if you ask me.");
					System.out.println("        Did i tell her to slow things down? or felt the same tell her tospeed it up?   'slow'   'fast'");
					choice = bob.next();
					if(choice.equals("slow")){
						Dreams.scene();
						System.out.println(" ");
						System.out.println("        +sad points");
						this.sad++;
						System.out.println("        ");
						System.out.println("        that's right, i told  her i  want to take things slow since our astrology signs don't match");
						System.out.println("        i also gave her some twinkies 2 days ago and now my house is on fire and my cat is missing");
						System.out.println("        ");
						System.out.println("        Ari:  SLOW ? SLOW!!??? AFTER ALL WE'VE BEEN THROUGH? GOD I CAN'T BELIVE YOU ");
						System.out.println("        Ari:  I don't think you really care about our relationship.... sad face");
						System.out.println("        ");
						blip = bob.next();
						Dreams.blank(100);
						System.out.println("        So that's what happend huh? She's probably in the room i'm about to go into... ");
						System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
						System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
						System.out.println("        ");
						System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
						repeat = bob.next();
						if(repeat.equals("yes")){
							loop = false;//aks if the dream is correct if so then ends dream
						}
						else{
							loop = true;//if not then keeps loop and retarts sad meter
							this.sad = 0;
						}
						Dreams.blank(100);
					}//end of slow if
					else if(choice.equals("fast")){
						Dreams.scene();
						System.out.println("        ");
						System.out.println("        I remember now, i told her i'd want to take things fast. ");
						System.out.println("        ");
						System.out.println("        Ari: what ew your such a creep! why can't i just meet a nice guy for once?");
						System.out.println("        Ari: i hate you how dare you say that without signing the treaty of 1874");
						System.out.println("        Ari: the law cleary states that you need to beat my grandmother in a dance battle");
						System.out.println("        Ari: and yet you fail to do even that");
						System.out.println("        ");
						System.out.println("        Man that did not go good.. ");
						blip = bob.next();
						Dreams.blank(100);
						System.out.println("        So that's what happend huh? She's probably in the room i'm about to go into... ");
						System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
						System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
						repeat = bob.next();
						if(repeat.equals("yes")){
							loop = false;//asks if the dream is correct if so ends the dream
						}
						else{
							loop = true;
							this.sad = 0;
						}
						Dreams.blank(100);
					}//end of fast if choice
				}//end of punch if
				else if(choice.equals("flowers")){
					Dreams.scene();
					System.out.println(" ");
					System.out.println("        +sad points");
					this.sad++;
					System.out.println("        ");
					System.out.println("        lol i gave her flowers i remember that");
					System.out.println("        ");
					System.out.println("        Ari: OH GOD ROSES I'M ALLERGIC OMG ARE YOU TRYING TO UN-ALIVE ME");	
					System.out.println("        Air: ***coughs up the red stuff in people's viens***");
					System.out.println("        ");
					blip = bob.next();
					System.out.println("        ");
					System.out.println("        yeah that didn't work out so well, i forgot she was allergic to roses");
					System.out.println("        what did i do next to try and fix things??");
					System.out.println("        Did i call her an ambulance? or did i dab on her??      'doctor'  'dab' ");
					System.out.println("        ");
					choice = bob.next();
					if(choice.equals("doctor")){
						Dreams.scene();
						System.out.println(" ");
						System.out.println("        +sad points");
						this.sad++;
						System.out.println("        ");
						System.out.println("        lol that was such a dumb idea what was i thinking??");
						System.out.println("        ");
						blip = bob.next();
						Dreams.scream();
						System.out.println("        ");
						System.out.println("        ");
						System.out.println("        So that's what happend huh? She's probably in the room i'm about to go into... ");
						System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
						System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
						repeat = bob.next();
						if(repeat.equals("yes")){
							loop = false;//ask if the dream is correct is so then the dream ends
						}
						else {
							loop = true;
							this.sad = 0;
						}
						Dreams.blank(100);
					}//end of if for doctors
					else if(choice.equals("dab")){
						Dreams.scene();
						System.out.println("        ");
						System.out.println("        ");
						System.out.println("        i'm pretty sure i told her to suck it up");
						System.out.println("        and then dabbed like really hard, like it was a deep dab to the ground");
						System.out.println("        ");
						System.out.println("        Ari: ***sniffle***  your right, i'm a strong individual. it's 2019");
						System.out.println("        Ari: You really opend my eyes about some things... like taxes");
						System.out.println("        Ari: Do we really need them? the sherif secret police just uses them for the ");
						System.out.println("        Ari: Secret furry fest party event every year.");
						System.out.println("        Ari: I guess i'll turn into a super villian now.... thank you");
						System.out.println("        ");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        ");
						System.out.println("        yeah that didn't turn out how i wanted");
						System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
						System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
						repeat = bob.next();
						if(repeat.equals("yes")){//asks if the dream is correct if so
							loop = false;//ends the dream
						}
						else {
							loop = true;
							this.sad = 0;
						}
						Dreams.blank(100);
					}//end of suck it up choice
				}//end of flowers  
			}//end of kiss choice  
			if(choice.equals("punch")){
				Dreams.scene();
				System.out.println("        ");
				System.out.println("        ");
				System.out.println("        That's right i just socked her in the face, she was wide open to like BAM");
				System.out.println("        It's too bad i was realy weak because she actually thout i was trying to hold her face");
				System.out.println("        Her eyes, the reaction she had, i could see her falling deeper in love with me");
				System.out.println("        ");
				System.out.println("        Ari: your really romantic ya know that?");
				System.out.println("        Ari: I'm so lucky to have you");
				System.out.println("        ");
				blip = bob.next();
				System.out.println("        ");
				System.out.println("        Well not the reaction i was expecting but that was fine");
				System.out.println("        But the reason i brought her here was to tell that i... I'M PREGANANT WITH JULAIN'S KID");
				System.out.println("        Did i tell her that i was preganant ? or that i played call of duty like a soy beta male?    'confess'  'soyboy'");
				System.out.println("        ");
				choice = bob.next();
				if(choice.equals("soyboy")){
					Dreams.scene();
					System.out.println("        ");
					System.out.println("        i... i told her i played call of duty... and not actual good games like MGS or Breath of the wild");
					System.out.println("        OR EVEN SUDOKU! GOD, ANYTHING BUT COD WHY DID IT HAVE TO BE COD ON XBOXONE OF ALL CONSOLES");
					System.out.println("        ");
					System.out.println("        Ari: .... it's okay... it's okay that your a soyboy.. i kinda knew from how sweaty your hands always were");
					System.out.println("        Ari: I still love you ");
					System.out.println("        ");
					blip = bob.next();
					System.out.println("        ");	
					System.out.println("        i couldn't belive she still acceptaded me like that.. what did i do next?");
					System.out.println("        Did i try to punch her again? or did i lean in for a kiss?      'punch'    'kiss'");
					System.out.println("        ");
					choice = bob.next();
					if(choice.equals("punch")){
						Dreams.scene();
						System.out.println("        ");
						System.out.println("        that's right i punched her again... but man i was so small body and weak..");
						System.out.println("        ");
						System.out.println("        Ari: your hands are so soft ***grabs my hand and kisses it***");
						System.out.println("        Ari: you just always know how to make my heart race don't you?");
						System.out.println("        Ari: ... we can't keep doing this though. I need to go. i have duties in the east to uphold");
						System.out.println("        Ari: BLING SHING needs me, i need to go.. even if it means leaving the love of my life");
						System.out.println("        ");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        I'm very that was the best route");
						System.out.println("        Cuz Just like that she was gone... i swore to stop being a beta male. And she went off to BLING SHING");
						System.out.println("        But when she came back she was different.. she wasn't the same anymore. was it from not seeing me??");
						System.out.println("        ");
						System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
						System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
						repeat = bob.next();
						if(repeat.equals("yes")){//asks if the dream is correct, if so
							loop = false;//then ends the dream
						}
						else{
							loop = true;
							this.sad = 0;
						}
						Dreams.blank(100);
					}//end of punch option
					else if(choice.equals("kiss")){
						Dreams.scene();
						System.out.println(" ");
						System.out.println("        +sad points");
						this.sad++;
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("        oh yeah i reached in for a kiss, but i accidently missed and kissed her dad instead");
						System.out.println("        ");
						System.out.println("        Ari:  Hey what the heck?!!?! That's my dad!!");
						System.out.println("        Ari:  You always do this!! Why can't i just be enough for you? ");
						System.out.println("        Ari:  God you just have to kill the mood... i'm leaving you");
						System.out.println(" ");
						Dreams.blank(100);
						System.out.println("        And just like that she was gone. taken for granted. why was dad even there???");
						System.out.println("	    I havn't hear from her since until recently");
						System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
						System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
						blip = bob.next();
						System.out.println("        ");
						System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
						repeat = bob.next();
						if(repeat.equals("yes")){//asks if they would like to proceed
							loop = false;//if yess the dream quites
						}
						else { 
							loop = true;
							this.sad = 0;
						}
						Dreams.blank(100);	
					}//end of kiss option
				}//end of soyboy choice
				else if(choice.equals("confess")){
					Dreams.scene();
					System.out.println(" ");
					System.out.println("        +sad points");
					this.sad++;
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("        Ari: lol it's okay so am i");
					System.out.println("        Ari: Don't get me wrong this is so messed up, like ooooh drama But have you seen Julian's hair?");
					System.out.println("        Ari: Almost as good as Suad's");
					System.out.println("        Ari: But anyway we probably shouldnt be with each other so i'm breaking up with you");
					System.out.println("        Ari: kinda chose the wrong option there bud, and you were on a role weren't you?");
					System.out.println(" ");
					System.out.println("        +sad points");
					this.sad++;
					System.out.println(" ");
					blip = bob.next();
					System.out.println("        ");
					System.out.println("        And just like that we was gone. ");
					System.out.println("        I havn't hear from her since until recently");
					System.out.println("        Jeff from HR told me she went crazy, she just roams the area, doging and weaving anything that come by");
					System.out.println("        If i want to save this land i need to defeat her before she steals more curry");
					blip = bob.next();
					System.out.println("        ");
					System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
					repeat = bob.next();
					if(repeat.equals("yes")){//asks if they would like tp proceed basically
						loop = false;//if yes then the dream quites
					}
					else{ 
						loop = true;
						this.sad = 0;
					}
					Dreams.blank(100);
				}//end of confess choice
			}//end of punch choice
		}while(loop);//keep having the dream until you really recall how things happend
	}//end of ariDream

	/**
	 * this method is for the dream sequence for garret to see what happend in the past 
	 */
	public void garretDream(){
		Scanner bob = new Scanner(System.in);
		Dreams.blank(100);
		Dreams.scene2();
		System.out.println("           Garret huh? i remember i used to be with him. he was a strange man...   what happend? ");
		System.out.println("            ");
		System.out.println("            ");
		System.out.println("                                              4 years ago ");
		System.out.println("            ");
		String choice;
		String blop = bob.next();
		Dreams.blank(100);
		boolean go = true;
		do{
			Dreams.blank(20);
			Dreams.scene2();
			System.out.println("            it was just me and garret. and all the marrage applitcations he had stuffed around the ship");
			System.out.println("            we were standing by the railing of the ship looking out into the sea. sucha perfect day");
			System.out.println("     ");
			System.out.println("            Garret: Your eyes look pretty when there's tear in them ");
			System.out.println("            Garret: I'm so glad you don't notice when i watch you sleep ");
			System.out.println(" ");
			blop = bob.next();
			System.out.println("            ");
			System.out.println("            Never in my life have i ever wanted to sleep with the lights on as much as this moment");
			System.out.println("            What did i say in response ? did i jump off the boat or slap him?");
			System.out.println("                  'jump'     'slap'");
			System.out.println("            ");
			choice = bob.next();
			if(choice.equals("jump")){
				Dreams.blank(20);
				Dreams.scene2();
				System.out.println("             ");
				System.out.println("             Oh yeah i yeeted off that boat. i didn't care where i would go i just couldn't");
				System.out.println("             And yet i turn my head and there wss Garret, swimming with me ");
				System.out.println("             ");
				blop = bob.next();
				System.out.println("             Garret: i didn't know you were such a good swimmer honey buns");
				System.out.println("             Garret: you almost lost me there sugar plum");
				System.out.println("             Garret: it's a good thing our love is so strong that it makes me follow you anywhere");
				System.out.println("             ");
				blop = bob.next();
				System.out.println("             And of course god wants me to suffer because the next thing i knew he dragged me back to the boat");
				System.out.println("             Natrually, i'd want to get away from that phsyco. But what did i do in my predicatmint?");
				System.out.println("             Did i play dead? or did i just stay quiet");
				System.out.println("                   'dead'   'quiet'  ");
				System.out.println("             ");
				choice = bob.next();
				if(choice.equals("dead")||choice.equals("quiet")){
					Dreams.blank(20);
					Dreams.scene2();
					System.out.println("             ");
					System.out.println("             Oh yeah it didn't matter cuz he's insane");
					System.out.println("             ");
					blop = bob.next();
					System.out.println("             Garret: listen i know we just met each other 5 days ago");
					System.out.println("             Garret: but i really want to marry you... what's your name again?");
					System.out.println("             Garret: doens't matter, our love will fight through it");
					System.out.println("             ");
					System.out.println("             I'm going to wake up with my face skinned off aren't i?");
					System.out.println("             ");
					System.out.println("             But strangley he disapeared");
					System.out.println("             I havn't seen him for a strangly long time. The only other time i heard from or about him is today");
					System.out.println("             this mission, when he stole the curry from SCHOP SCHOP. maybe things would've been different if he");
					System.out.println("             wasn't such a wierdo. But i guess that's just how things go");
					blop = bob.next();
					System.out.println("        ");
					System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
					choice = bob.next();
					if(choice.equals("yes")){//asks if they would like tp proceed basically
						go = false;//if yes then the dream quites
					}
					else{
						go  = true;
						this.sad = 0;
					}
					Dreams.blank(100);
				}
			}//end of jump first choice 
			else if(choice.equals("slap")){
				Dreams.blank(20);
				Dreams.scene2();
				System.out.println("             I remember i slapped the chesnuts out of him. You could hear the smack from a block way");
				System.out.println("             As i retracted my hand back to my side, garret looked back at me with a shocked look");
				System.out.println("             ");
				blop = bob.next();
				System.out.println("             Garret: Oh man that... was almost has hard as my wife's boyfriend slaps me");
				System.out.println("             Garret: I say you have some real talent in this, you should file my taxes");
				System.out.println("             Garret: whenever i make a mistake in filing my taxes my wife's boyfriend hits me");
				System.out.println("             ");
				System.out.println("             ");
				blop = bob.next();
				System.out.println("             Why has god left me in this situation i wonder. I'm not sure. I just wanted to watch some birds");
				System.out.println("             I think i did one of two actions. but i'm not sure. did i try to leave? ");
				System.out.println("                       'yes'    'no'");
				choice = bob.next();
				if(choice.equals("yes")){
					Dreams.blank(20);
					Dreams.scene2();
					System.out.println("             I'm not sure how i left. I could've sworn he wouldn've followed me");
					System.out.println("             But i'm not going to question it");
					System.out.println("             I havn't seen him for a strangly long time. The only other time i heard from or about him is today");
					System.out.println("             this mission, when he stole the curry from SCHOP SCHOP. maybe things would've been different if he");
					System.out.println("             wasn't such a wierdo. But i guess that's just how things go");
					blop = bob.next();
					System.out.println("        ");
					System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
					choice = bob.next();
					if(choice.equals("yes")){//asks if they would like tp proceed basically
						go = false;//if yes then the dream quites
					}
					else{
						go  = true;
						this.sad = 0;
					}
					Dreams.blank(100);
				}
				else if(choice.equals("no")){
					Dreams.blank(20);
					Dreams.scene2();
					System.out.println("             ");
					System.out.println("             lol ther's no way i decided to stay, i just walked away. didn't even look back");
					System.out.println("             I'm still curious as to why he didn't stop me, but i guess somthing in him clicked");
					System.out.println("             But i'm not going to question it");
					System.out.println("             I havn't seen him for a strangly long time. The only other time i heard from or about him is today");
					System.out.println("             this mission, when he stole the curry from SCHOP SCHOP. maybe things would've been different if he");
					System.out.println("             wasn't such a wierdo. But i guess that's just how things go");
					blop = bob.next();
					System.out.println("        ");
					System.out.println("        but is that what really happend? am i sure that's how it went down?  'yes'  'no'");
					choice = bob.next();
					if(choice.equals("yes")){//asks if they would like tp proceed basically
						go = false;//if yes then the dream quites
					}
					else{
						go = true;
						this.sad = 0;
					}
					Dreams.blank(100);
				}
			}//end of choice for beg  first choice
		}while(go);//to keep going until rememebr how the flashback went 
	}//end of garretDream



}//end of Dreams class	
