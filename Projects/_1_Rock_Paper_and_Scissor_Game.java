package Projects;

//  project ==> 1 : Rock Paper & Scissor:

import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class _1_Rock_Paper_and_Scissor_Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(3);
//        System.out.println(x);

        System.out.println("Welcome to the Rock Paper & Scissor Game:");
        System.out.println("Enter the number of chances do you want to play: ");
        int number_of_chances = sc.nextInt();
//        System.out.println("Number of the chances is only : "+ number_of_chances);

        int i = 0;

        while (i<number_of_chances){
            int rn = number_of_chances - i;
            System.out.println(" Total Remaining number_of_chances is: "+ rn);

        System.out.println("Please select: \n 0==> Rock:\n 1==> Paper:\n 2==> Scissor");
            System.out.println( );
        System.out.println("Please Enter your number:");
        int num = sc.nextInt();

        String a = "==> Match is drawn:<==";
        String b = "==> Computer won the Game: <==";
        String c = "==> You won the game: <==";

//            List<Integer> l1 = new ArrayList<Integer>();
//            List<Integer> l2 = new ArrayList<Integer>();
//            List<Integer> l3 = new ArrayList<Integer>();

//            System.out.println("Computer choose the number : "+ x);
            if(x==0){
                System.out.println("Computer choose : Rock ");
            }
            else if(x==1){
                System.out.println("Computer choose : Paper ");
            }
            else if(x==2){
                System.out.println("Computer choose : Scissor ");
            }
            System.out.println("you choose the number : "+ num);

        if (num>=3){
            System.out.println("Please Enter the valid input:");
        }

        else if (x == num) {
            System.out.println("Match is draw");
        }

        else if (x == 0 && num == 2) {
            System.out.println(a);
        }

        else if (x == 1 && num == 0) {
            System.out.println(b);
        }

        else if (x == 2 && num == 1) {
            System.out.println(b);
        }

        else  {
            System.out.println(c);
        }

            System.out.println( );
        i = i +1;

        }
        System.out.println("-----------------------GAME END----------------------");
        System.out.println("\t\t||> Thanks for Playing the Game <||");

    }
}
