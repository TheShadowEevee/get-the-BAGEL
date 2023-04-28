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
     * updateRoom() takes the new room's address and finds the case for it and updates the static variables for that room.
     * @param address = address array of the new room
     */
    static void updateRoom(int[] address){
        System.out.print("updateRoom() started");

        String strAddress = address[0] + "," + address[1];
        switch (strAddress) {
            case "0,0":
                currentDescription = "";
                int[][] Doors = {{1,0},{0,1},{-1,-1},{-1,-1}};
                break;
            case "0,1":
                break;
            case "0,2":
                break;
            case "1,0":
                break;
            case "1,1":
                break;
            case "1,2":
                break;
            case "2,0":
                break;
            case "2,1":
                break;
            case "2,2":
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