package Practice_set;
import java.util.Scanner;
public class Practice_set_2_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1: Find output==>
        // Date 9/7/23

        float a=(7f/4)*(9f/2);
        System.out.println(a);

        //Question 2: Find grade ==>

        char grade = 'B';
        grade =(char) (grade + 8);
        System.out.println(grade);

//         Question 3: Detecting the number ==>

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num = 10;
        System.out.println(n>num);


        // Question 4: Write in the computer language ==>

        System.out.println(" Expretion = ((v*v)-(u*u))/2*a*s ");

        // Question 5: Find the output of the expression ==>

        int x = 7;
        int b = 7*(49/7)+35/7;
        System.out.println(b);

    }
}
