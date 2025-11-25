import java.util.ArrayList;
/**
 * Write a description of class Player here.
 *
 * @author (Trevor McQueen)
 * @version (11/24/2025)
 */
public class Player
{
  private Room currentRoom;
  private ArrayList<Item> inventory;
  
  /**
   * player starts in room
   */
  public Player(Room startingRoom)
  { 
      currentRoom = startingRoom;
      inventory = new ArrayList<>();
    }
    /**
     * the room the player is currently in
     */
  public Room getCurrentRoom()
  { 
      return currentRoom;
    }
    
    /**
     * move the player to another room
     */
  public void setCurrentRoom(Room room)
  { 
      currentRoom = room;
    }
  public Item removeItem(String name)
  { 
      for(Item i : inventory) {
          if(i.getDescription().equalsIgnoreCase(name)) {
              inventory.remove(i);
              return i;
          }
      }
      return null;
    }
    /**
     * description of items the player carries
     */
    public String getInventoryDescription()
    { 
        if(inventory.isEmpty()) {
            return " You are carrying nothing.";
        }
        
        StringBuilder s = new StringBuilder("You are carrying:\n");
        
        for(Item i : inventory) {
            s.append(" _ ").append(i.getLongDescription()).append("\n");
        }
        
        return s.toString();
    }
    /**
     * add an item to the players inventory
     */
    public void addItem(Item item)
    {
        inventory.add(item);
    }
}