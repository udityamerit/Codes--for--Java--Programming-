package Practice_set;
import java.util.Scanner;
public class Practice_set_7_methods {
    //date 26/7/23;

    //Question 1: Printing the multiplication table using methods
    static void table (int n){
        for (int i =1;i<=10;i++){
            System.out.println(n + " X "+ i + " = " + n*i);
        }
    }

    //Question 2: printing the star pattern
    static void star(int a){
        for (int i=0;i<=a;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Question 4 : Printing the star pattern in reverse order
    static void star1(int s){
        for (int i = s;i>=0;i--){
            for(int j = 0 ;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Question 6 :find the avg of the numbers passing an arguments
    static int avg (int ...arr){
        int result = 0;
        for(int a1: arr){
            result = (result + a1)/arr.length ;
        }
        return  result;
    }











    //Question 10: calculate the sum of n natural number using iterative approach
    static int iterative_sum(int n1){
        int sum = 0;
        for(int i=0;i<=n1;i++){
            sum = sum +i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for Question 1: code
        System.out.println("Enter the number to print the multiplication table");
        int n = sc.nextInt();
        System.out.println("Multiplication table of the "+n+ " is :");
        table(n);

        //for Question 2: code
        System.out.println("Enter the number to print the star pattern:");
        int a = sc.nextInt();
        System.out.println("Your star pattern is: ");
        star(a);

        //for Question 10: code
        System.out.println("Please enter the number do you want to sum :");
        int n1 = sc.nextInt();
        System.out.println("Your sum of  first "+n1+" natural numbers is: " +iterative_sum(n1));


        //for Question 4:code
        System.out.println("Please enter the number to print the star pattern in reverse order: ");
        int s = sc.nextInt();
        System.out.println("Your star pattern is :");
        star1(s);


        //for Question 6:code
        System.out.println("Enter the  elements of an array to print an avg:" );
        int a1 = sc.nextInt();
        System.out.println("Your avg value of an array is :"+ avg(a1));
    }
}