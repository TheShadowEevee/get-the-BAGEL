public interface Room {
    
    /**
     * address is an int array that is the location of the room on the dev
     * map, this is written as {floor, room}
     */
    private static int[] address;
    
    /**
     * doors: this is an array of int arrays, these arrays should be the addresses of the room on the OTHER side
     * of the "door", and "door" is a general term for any exit from a room, so staircase or actual door
     * the "doors" should be organised by North, than East, South, and finally West, and each "door" should
     * be {direction(0-3), isDoor(0/1), futureFloor(0-2), futureRoom(0-2)}
     */
    private static int[][] doors;

    /**
     * this is the description of the room, can be pulled and printed when you enter the room
     */
    private static String description; //description of the room

    public static String getDescription();
}