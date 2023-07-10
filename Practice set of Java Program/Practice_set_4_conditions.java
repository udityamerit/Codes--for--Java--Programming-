package Practice_set;
import java.util.Scanner;
public class Practice_set_4_conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Date 9/7/23

        //Question 1: Check the equality ==>

        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }

        //Question 2: Calculate the CGPA of the student ==>
        System.out.println("Enter your p c m  marks: ");
        float m = sc.nextFloat();
        float c = sc.nextFloat();
        float p = sc.nextFloat();
        float avg = (m+c+p)/3;
        float percentage = avg;
        System.out.println("Your Percentage is :" + avg);
        if (m>=33 && c>=33 && p>=33 && avg>=40){
            System.out.println(" Congratulation! ,You are Qualified the exam:");
        }
        else {
            System.out.println(" Sorry! ,You are not Qualified the exam , Please Try again");
        }

        // Question 3:Income tax calculation ==>
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);



    }
}
