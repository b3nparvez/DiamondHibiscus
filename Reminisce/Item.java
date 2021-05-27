
/**
 * this item class is to set parameters for the item, the name wieght and value and strength
 * there is a get wieth method that gets the weight 
 * and a get alue method that gets the value 
 * and a get name method that gets the name 
 * and a get type method that gets the type of the item
 * and a to string method that prints out the data into string 
 @author Suad
 @author Arsalan
 @author Paige
 */
public class Item{
	
	private ItemType type;
	private String name;
	private int weight;
	private int value;
	private int strength;
	
	/**
	  Constructor for Item.
	  @param type the kind of item, could be a waepon or armor.
	  @param name name of the item.
	  @param weight the weight of the item.
	  @param value how much value the item has.
	  @param strength how much power the item has.
	  */
	Item(ItemType type, String name, int weight, int value, int strength){
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.strength = strength;

	}//end of item
	
	/**
	  A method that retrieves the weight in the form of an integer.
	  @return the weight.
	  */
	public int getWeight(){
		return this.weight;
	}//end of get wieght
	
	/*
	   A method that retrieves the value of an item in the form of an integer.
	   @return the value.
	   */
	public int getValue(){
		return this.value;
	}//end of get value

	/**
	  A method that retrieves the name of an item.
	  @return the name of the item.
	  */
	public String getName(){
		return this.name;
	}//end of getname
	
	/**
	  A method that retrieves the item type of an item.
	  @return the item type.
	  */
	public ItemType getType(){
		return this.type;
	}//end of getType

	/**
	  A method that returns the item in a readable format.
	  @return the name, weight, value, and strength.
	  */
	public String toString(){
		return name + "  : " + weight + " pounds " + value + " dollars  " + strength+ " Power.";
	}//end of toString

	/**
	  A method that retrieves the power of an item.
	  @return the power of an item.
	  */
	public int getPower(){
		return strength;
	}//end of power 
	
	/**
	 * this method is to set the power of a weapon to a certain value if it got upgraded
	 * @param increase the number of strenth the weapon will be upgraded to in int
	 */
	public void setPower(int increase){
		this.strength = increase;
	}//end of setPower

}//end of Item
