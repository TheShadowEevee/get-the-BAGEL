/**
 *  Copyright (c) 2023 Michael Malloy, Enter-Name
 *  CNIT 25501 Final Project - 
 */

public class Player {
    
    // Define Player Variables
    public static String name;
    public static int HP;
    public static int[] location = {0, 0}; // Level, Room
    
    private static int maxTravelable = 9; // Prevent moving to a space further than x
    
    
    // Initialize Player Class Variables
    public void setupPlayer(String name) {
        this.name = name;
        this.HP = 100;
        this.location[0] = 1; // Start on the first level
        this.location[1] = 1; // Start in the first room
    }
    
    
    // Update Player Name
    public void changeName(String name) {
        this.name = name;
    }
    
    
    // Player HP Modifications
    public void increaseHP(int heal) {
        this.HP += heal;
        
        if ( this.HP > 100 ) {
            this.HP = 100;
        }
    }
    
    public void decreaseHP(int damage) {
        this.HP -= damage;
        
        if ( this.HP < 0 ) {
            this.HP = 0;
        }
    }
    
    
    // Player Location Change
    public boolean levelUp() { // Moving towards negative maxTravelable
        this.location[0] += 1;
        
        if ( this.location[0] > this.maxTravelable ) {
            this.location[0] = this.maxTravelable;
            return false;
        }
        
        return true;
    }
    
    public boolean roomUp() { // Moving towards maxTravelable
        this.location[1] += 1;
        
        if ( this.location[1] > this.maxTravelable ) {
            this.location[1] = this.maxTravelable;
            return false;
        }
        
        return true;
    }
    
    public boolean roomDown() { // Moving towards negative maxTravelable
        this.location[1] -= 1;
        
        if ( this.location[1] < 0 ) {
            this.location[1] = 0;
            return false;
        }
        
        return true;
    }
    
}
