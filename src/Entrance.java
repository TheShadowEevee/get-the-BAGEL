/**
 * This is the Entrance Room for the game, this is where the game starts and is
 *      at location 1,0
 * @author Jacob
 */
public class Entrance extends Room {
    private static String description = "";
    private static int[] address = {1,0};
    private static int[][] doors = {{}};

    public String getDescription() {
        return description;
    }
}
