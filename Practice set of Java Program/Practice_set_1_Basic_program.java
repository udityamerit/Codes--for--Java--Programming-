package Practice_set;
import java.util.Scanner;
public class Practice_set_1_Basic_program {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // Date: 9/7/2

       // Question 1 : Sum of three numbers==>
        System.out.println("Printing of the sum of the three numbers :");
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number :");
        int c = sc.nextInt();
        int sum = 0 ;
        sum = a+b+c;
        System.out.println("The sum of the three numbers is :" + sum);

        // Question 2: Calculation of CGPA ==>
        System.out.println("Enter the marks of first subject out of 100  marks: ");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks of second subject out of 100  marks: ");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks of third subject out of 100  marks: ");
        int s3 = sc.nextInt();
        float cgpa = (s1+s2+s3)/30f;
        System.out.println("Your CGPA is : "+ cgpa);

        //Question 3: Greeting the user ==>
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello "+name+ " have a good day: ");

        //Question 4:km to miles ==>
        System.out.println("Enter the Km: ");
        double Km = sc.nextDouble();
        double miles = Km*0.62137119;
        System.out.println(Km+"Km is = "+ miles+ " miles");

        //Question 5: typecasting ==>
        System.out.println("Enter the something: ");
        System.out.println(sc.hasNextInt());
    }
}
