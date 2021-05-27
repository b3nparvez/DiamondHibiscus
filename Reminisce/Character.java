import java.io.PrintWriter;

/**
 * A character represents a player in the game. 
 * The character class is an abstract class which creates a new player and initializes name and health stats.
 * @author Suad
 * @author Arsalan
 * @author Paige
 * */
public abstract class Character{

	private String name;
	private int health;

/**
  Creates a new character with their given name and health.
  @param name the name of the character.
  @param health the health of the character.
  */
	public Character(String name, int health){
		this.name = name;
		this.health = health;

	}
	public abstract void heal(int juice);
	public abstract void levelUp(int upgrade, int whip);
	public abstract void damage(int hit);
	public abstract String getname();
	public abstract boolean isAlive();
	public abstract void girlTaunt();
	public abstract void boyTaunt();
	public abstract void kill();
	public abstract int power();
	public abstract int health();
	public abstract String equippedWeapon();
	abstract void save(PrintWriter pw);
	public abstract void setHealth(int bob);
	public abstract void setName(String bob);	


}


