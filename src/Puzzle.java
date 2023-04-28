import java.util.Random;

import org.w3c.dom.ranges.Range;

public class Puzzle {
    private static Random r = new Random();
    private static String answer = "";
    static boolean isBagel = false;
    static String puzzleText;

    /**
     * newPuzzle randomly chooses a puzzle from math, riddle, or bagel, with a 45/45/10 split
     * then randomly chooses what math or riddle puzzle to give
     */
    public static void newPuzzle() {
        int randomInt = r.nextInt(100) + 1;

        if(1 <= randomInt && randomInt <= 10){
            isBagel = true;
            puzzleText = "YOU FOUND THE bagel CONGRADULATIONS";
            answer = "Jacob and Michael were here";
        } else if(11 <= randomInt && randomInt <= 55){
            int intAnswer;
            int a = r.nextInt(100);
            int b = r.nextInt(100);
            int operation = r.nextInt(4);

            switch (operation){
                case 0: //+
                    intAnswer = a+b;
                    answer = String.valueOf(intAnswer);
                    puzzleText = a + " + " + b + " = ?";
                    break;
                case 1: //-
                    intAnswer = a-b;
                    answer = String.valueOf(intAnswer);
                    puzzleText = a + " - " + b + " = ?";
                    break;
                case 2: //*
                    intAnswer = a*b;
                    answer = String.valueOf(intAnswer);
                    puzzleText = a + " * " + b + " = ?";
                    break;
                case 3: //^
                    intAnswer = a;
                    for(int i = 0; i < b; i++){
                        intAnswer *= a;
                    }
                    answer = String.valueOf(intAnswer);
                    puzzleText = a + "^" + b + " = ?";
                    break;
                default:
                    System.out.println("error in generating math problem");
            }
        } else {
            int option = r.nextInt(10);

            switch (option) {
                case 0:
                    puzzleText = "What has to be broken before you can use it?";
                    answer = "an egg";
                    break;
                case 1:
                    puzzleText = "You bought me for dinner but never eat me. What am I?";
                    answer = "cutlery";
                    break;
                case 2:
                    puzzleText = "If you took two apples from a pile of three apples, how many apples would you have?";
                    answer = "the one apple you took";
                    break;
                case 3:
                    puzzleText = "What kind of vegetables are the most fun at parties?";
                    answer = "fungi";
                    break;
                case 4:
                    puzzleText = "What is the richest nut?";
                    answer = "a cash-ew";
                    break;
                case 5:
                    puzzleText = "Why did the fruit salad skip its own wedding?";
                    answer = "it had a lot of can't-elope";
                    break;
                case 6:
                    puzzleText = "What kind of beer won't get you tipsy?";
                    answer = "root beer";
                    break;
                case 7:
                    puzzleText = "What kind of poultry is always going to the bathroom?";
                    answer = "chick peas";
                    break;
                case 8:
                    puzzleText = "Why did the citrus tree go to the hospital?";
                    answer = "lemon-aid";
                    break;
                case 9:
                    puzzleText = "You cut me, slice me, dice me, and all the while, you cry. What am I?";
                    answer = "an onion";
                    break;
                default:
                    System.out.println("Error in generating riddle");
                    break;
            }
        }
    }

    /**
     * checkAttempt checks attempt against the answer
     * @param attempt = this is the latest attempt by the player
     * @return true = attempt is correct; false attempt is wrong
     */
    public static boolean checkAttempt(String attempt) {
        if(attempt == answer) return true;
        return false;
    }
}
