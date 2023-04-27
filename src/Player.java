/**
 *  Copyright (c) 2023 Michael Malloy, Enter-Name
 *  CNIT 25501 Final Project - GET THE bagel
 */

public class Player {
    
    // Define Player Variables
    public static String name;
    public static int HP;
    public static int[] location = {0, 0}; // Level, Room
    public static int facing;
    
    private static int maxTravelable = 9; // Prevent moving to a space further than x
    
    
    // Initialize Player Class Variables
    public Player(String name) {
        this.name = name;
        this.HP = 100;
        this.location[0] = 1; // Start on the first level
        this.location[1] = 1; // Start in the first room
        this.facing = 0;
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
    public void changeRoom(int[] room) {
        this.location[0] = room[0];
        this.location[1] = room[1];
    }
    
}
