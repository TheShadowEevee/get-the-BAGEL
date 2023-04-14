/**
 *  Copyright (c) 2023 Michael Malloy, Enter-Name
 *  CNIT 25501 Final Project - 
 */

public class Player {
    
    // Define Player Variables
    public static String name;
    public static int HP = 100;
    public static int[] location = {0, 0}; // Intented to represent (x, y) or (column, row) on a 2D plane, starting in center
    
    private static int maxTravelable = 10; // Prevent moving to a space further than x
    
    
    // Initialize Player Class Variables
    public void setupPlayer(String name) {
        this.name = name;
        this.HP = 100;
        this.location[0] = 0;
        this.location[1] = 0;
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
    public boolean moveNorth() { // Moving towards negative maxTravelable
        this.location[0] -= 1;
        
        if ( this.location[0] < -this.maxTravelable ) {
            this.location[0] = -this.maxTravelable;
            return false;
        }
        
        return true;
    }
    
    public boolean moveSouth() { // Moving towards maxTravelable
        this.location[0] += 1;
        
        if ( this.location[0] > this.maxTravelable ) {
            this.location[0] = this.maxTravelable;
            return false;
        }
        
        return true;
    }
    
    public boolean moveWest() { // Moving towards negative maxTravelable
        this.location[1] -= 1;
        
        if ( this.location[1] < -this.maxTravelable ) {
            this.location[1] = -this.maxTravelable;
            return false;
        }
        
        return true;
    }
    
    public boolean moveEast() { // Moving towards maxTravelable
        this.location[1] += 1;
        
        if ( this.location[1] > this.maxTravelable ) {
            this.location[1] = this.maxTravelable;
            return false;
        }
        
        return true;
    }
    
}
