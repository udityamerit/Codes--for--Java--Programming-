package Practice_set;
import java.util.Scanner;
public class Practice_set_5_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Date = 6/7/23:
//        Question :1 printing star pattern using for loop ==>

        System.out.println("Enter the number to print star pattern:");
        int n = sc.nextInt();
        for (int i = 0; i<=n;i++){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Question 2: sum of n even numbers ==>

        System.out.println("Enter the number to sum the first n even numbers:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++){
            sum = sum + (2*i);

        }
        System.out.println("Sum of the first n even numbers is: "+ sum);

        //Question 3:printing of the multiplication table ==>

        System.out.println("Enter the number to print the multiplication table");
        int n = sc.nextInt();
        System.out.println("Multiplication table of the "+n+" is:" );
        for (int i=1;i<=10;i++){

            System.out.println(n+" X "+i+" = "+ n*i);

        }

        //Question 4: Printing the Reverse multiplication table ==>

        System.out.println("Enter the number to print the multiplication table");
        int n = sc.nextInt();
        System.out.println(" Reverse multiplication table of the "+n+" is:" );
        for (int i=10;i>0;i--){

            System.out.println(n+" X "+i+" = "+ n*i);

        }

        //Question 5 :Calculation of the factorial of the number using while loop ==>
//
        System.out.println("Enter the number to find the factorial :");
        int n = sc.nextInt();
        int fac = 1;
        int i = 1;
        while (i<=n){
            fac*= i;
            i++;
       }
        System.out.println("Factorial of the number is: " + fac);

       // Question 6 :Calculation of the factorial of the number using for loop ==>

        System.out.println("Enter the number to find the factorial :");
        int n = sc.nextInt();
        int i = 1;
        int fac = 1;
        for (i=1;i<=n;i++){
            fac *= i;
        }
        System.out.println("Factorial of the number is :" + fac);

        //Question 7: Printing of the star pattern using while loop ==>

        System.out.println("Enter the number to print the star pattern");
        int n = sc.nextInt();
        int i =0;
        while (i<n){
            System.out.println("*");
            i = i+1;

        }

        //Question 9:Sum of the multiplication table ==>

        System.out.println("Enter the number to print the multiplication table");
        int n = sc.nextInt();
        System.out.println("Multiplication table of the "+n+" is:" );
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum = sum + (n*i);
            System.out.println(n+" X "+i+" = "+ n*i);
        }
        System.out.println("Sum of the multiplication table is: " +sum);

    }
}
