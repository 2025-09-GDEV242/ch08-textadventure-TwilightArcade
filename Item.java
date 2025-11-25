
/**
 * Write a description of class Item here.
 * This is the item class 
 * @author (Trevor McQueen)
 * @version( version 1 11/24/2025)
 */
public class Item
{
    private String description;
    private int weight;
    
    /** 
     * create an item with a description and weight
     */
    
    public Item( String description, int weight)
    {
        this.description = description;
        this.weight= weight;
    }
    
    /**
     * get the items description.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Get the items weight.
     */
    
    public int getWeight()
    { 
        return weight;
    }   
    
    /**
     * get a long description of the item
     */
    public String getLongDescription()
    {
        return description + " (weight: " + weight + ")";
    }
}