package Projects;

// Project-2: Number Guessing Game

import java.util.Scanner;
import java.util.Random;
class Game{
    private int Guessing_number;
    public int getGuessing_number(){
        return Guessing_number;
    }
    public void setGuessing_number(int n ){
        Guessing_number = n;
    }
    //constructor
    public Game(int myGuessing_number ){
        Guessing_number = myGuessing_number;
    }

}
public class _2_Guessing_number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chances do you want to play: ");
        int noofplay = sc.nextInt();
//        int noOfGuesses = sc.nextInt();
        Random random = new Random();
        int n = random.nextInt(100);

        int i = 0;


        while (i < noofplay){
            System.out.println("Enter your guessed number: ");
            int takeUserInput = sc.nextInt();
            int rn = noofplay - i;
            System.out.println(" Total Remaining number_of_chances is: "+ rn);

            if (takeUserInput > n){
                System.out.println("Your Guessing number is Bigger of the original Number:");
            } else if (takeUserInput < n) {
                System.out.println("Your Guessing number is Smaller of the original Number:");
            }
           else {
                System.out.println("Congratulation!,You Guessed the original Number:");
                System.out.println("Number of chances that you took to finish " +
                        "the game is : "+ i );
                break;
            }
            System.out.println(" ");
            i = i+1;
        }

        Game g = new Game(n);
        System.out.println("Original Number which created by the Computer is : " +
                + g.getGuessing_number());
        System.out.println(" ");
        System.out.println("-----------------------GAME END----------------------");
        System.out.println("\t\t||> Thanks for Playing the Game <||");
    }
}
