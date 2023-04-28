public class CurrentRoom {
    /**
     * doors: this is an array of int arrays, these arrays should be the addresses of the room on the OTHER side
     * of the "door", and "door" is a general term for any exit from a room, so staircase or actual door
     * the "doors" should be organised by North, than East, South, and finally West, and each "door" should
     * be {floor, room}, no door is {-1,-1}
     */
    static int[][] currentDoors = {{2,0},{1,1},{0,0},{-1,-1}};

    /**
     * this is the description of the room, can be pulled and printed when you enter the room
     */
    static String currentDescription = "In this sterile white room, you see a staircase going up in the North, a door to the East, and a staircase going down in the South.";

    /**
     * this is if the doors/staircases are locked or not, this is changed by the puzzle class
     * if true = doors are locked, you can't move rooms; false = doors are unlocked, you can move
     */
    static boolean isLocked = false;

    /**
     * updateRoom() takes the new room's address and finds the case for it and updates the static variables for that room.
     * @param address = address array of the new room
     */
    static void updateRoom(int[] address){
        System.out.print("updateRoom() started");

        String strAddress = address[0] + "," + address[1];
        switch (strAddress) {
            case "0,0":
                currentDescription = "In this brightly lit part of the basement covered in torches, there is a staircase going up in the North, a door going to the East, and a podium in the middle.";
                currentDoors[0][0] = 1;
                currentDoors[0][1] = 0;
                currentDoors[1][0] = 0;
                currentDoors[1][1] = 1;
                currentDoors[2][0] = -1;
                currentDoors[2][1] = -1;
                currentDoors[3][0] = -1;
                currentDoors[3][1] = -1;
                isLocked = true;
                break;
            case "0,1":
                currentDescription = "The basement is darker here than expected and is covered in cobwebs, there is a staircase going up in the North, a door the East, a door to the West, and a podium in the middle.";
                currentDoors[0][0] = 1;
                currentDoors[0][1] = 1;
                currentDoors[1][0] = 0;
                currentDoors[1][1] = 2;
                currentDoors[2][0] = -1;
                currentDoors[2][1] = -1;
                currentDoors[3][0] = 0;
                currentDoors[3][1] = 0;
                isLocked = true;
                break;
            case "0,2":
                currentDescription = "You have found the end of the basement, this room is made of worn down and cracked stone, but is plesantly lit seemingly from nowhere, there is only the door to the West you entered from and a podium in the middle.";
                currentDoors[0][0] = -1;
                currentDoors[0][1] = -1;
                currentDoors[1][0] = -1;
                currentDoors[1][1] = -1;
                currentDoors[2][0] = -1;
                currentDoors[2][1] = -1;
                currentDoors[3][0] = 0;
                currentDoors[3][1] = 1;
                isLocked = true;
                break;
            case "1,0":
                currentDescription = "In this sterial white room, that you swear you have seen before, you see a staircase going up in the North, a door to the East, a staircase going down in the South, and new podium in the middle that you didn't see the first time.";
                currentDoors[0][0] = 2;
                currentDoors[0][1] = 0;
                currentDoors[1][0] = 1;
                currentDoors[1][1] = 1;
                currentDoors[2][0] = 0;
                currentDoors[2][1] = 0;
                currentDoors[3][0] = -1;
                currentDoors[3][1] = -1;
                isLocked = true;
                break;
            case "1,1":
                currentDescription = "This room is chaos incarnate, books lay open everywhere, candy is floating around, and everything seems to be rotating around the center, this seems like the middle of the house. There is a door to the East, a staircase going down to the South, a door to the West, and a podium in the middle.";
                currentDoors[0][0] = -1;
                currentDoors[0][1] = -1;
                currentDoors[1][0] = 1;
                currentDoors[1][1] = 2;
                currentDoors[2][0] = 0;
                currentDoors[2][1] = 1;
                currentDoors[3][0] = 1;
                currentDoors[3][1] = 0;
                isLocked = true;
                break;
            case "1,2":
                currentDescription = "the pungent smell of chlorine hits you first as you look out at a indoor pool, there is a staircase going up in the North, a door to the West, and a podium floating in the middle of the pool.";
                currentDoors[0][0] = 2;
                currentDoors[0][1] = 2;
                currentDoors[1][0] = -1;
                currentDoors[1][1] = -1;
                currentDoors[2][0] = -1;
                currentDoors[2][1] = -1;
                currentDoors[3][0] = 1;
                currentDoors[3][1] = 1;
                isLocked = true;
                break;
            case "2,0":
                currentDescription = "Birds fly around you as you stand in the middle of a room-sized bird cage, there is a door to the East, a staircase to the South, and a podium in the middle.";
                currentDoors[0][0] = -1;
                currentDoors[0][1] = -1;
                currentDoors[1][0] = 2;
                currentDoors[1][1] = 1;
                currentDoors[2][0] = 1;
                currentDoors[2][1] = 0;
                currentDoors[3][0] = -1;
                currentDoors[3][1] = -1;
                isLocked = true;
                break;
            case "2,1":
                currentDescription = "Atop a bananna tree you see a door to your East and West, with a podium in the middle.";
                currentDoors[0][0] = -1;
                currentDoors[0][1] = -1;
                currentDoors[1][0] = 2;
                currentDoors[1][1] = 2;
                currentDoors[2][0] = -1;
                currentDoors[2][1] = -1;
                currentDoors[3][0] = 2;
                currentDoors[3][1] = 0;
                isLocked = true;
                break;
            case "2,2":
                currentDescription = "In an evil scientist's evil lab with a bored platypus waring a fashionable hat chained to a wall, you see a staircase to the South, a door to the West, and a podium in the middle.";
                currentDoors[0][0] = -1;
                currentDoors[0][1] = -1;
                currentDoors[1][0] = -1;
                currentDoors[1][1] = -1;
                currentDoors[2][0] = 1;
                currentDoors[2][1] = 2;
                currentDoors[3][0] = 2;
                currentDoors[3][1] = 1;
                isLocked = true;
                break;
            default:
                System.out.println("RoomOutOfBoundsError: Player tried to move out of bounds, check doors");
                break;
        }
    }

    /**
     * doorNullTest() is for testing if the direction the player wants to travel has a door/staircase
     * @param direction = this is the direction the player wants to travel
     * @return true = there is a door there; false = there is no door there
     */
    static boolean doorNullTest(int direction){
        System.out.println("doorNullTest started");

        if(currentDoors[direction][0] != -1) {
            System.out.println("doorNullTest passed true");
            return true;
        }

        System.out.println("doorNullTest passed false");
        return false;
    }
}