package Practice_set;
import java.awt.*;
import java.util.Scanner;
class Employee1 { //class for Question 1:
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
class Cellphone{ // class for Question 2:
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vir(){
            System.out.println("Vibrating...");
        }
}

class Square { //class for Question 3:

    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}

class Rectangle{ // class for Question 4:
    int height;
    int width;
    public int Area(){
        return height*width;
    }
    public int Perimeter(){
        return 2*(height+width);
    }
}

class Tommy{ // class for the Question 5:
    public void hit(){
        System.out.println("Hitting the enemy...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firring to the enemy...");
    }
}

class Circle{ // class for the Question 6:
    int radius;

    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
public class Practice_set_8_oops_class {
    public static void main(String[] args) {

     // Question 1 : Printing of  the Employee class
        Employee1 a = new Employee1();
        a.setName("Uditya");
        a.salary = 234;
        System.out.println(a.getSalary());
        System.out.println(a.getName());


      // Question 2: Printing of  the Cellphone class
        Cellphone vivo = new Cellphone();
        vivo.ring();
        vivo.vir();

        // Question 3: Printing of  the Square class
        Square sq = new Square();
        sq.side = 10;
        System.out.println("Area of the square: "+ sq.area());
        System.out.println("Perimeter of the square: " +sq.perimeter());

        // Question 4: Printing of  the Rectangle class to find the area and perimeter
        Rectangle re = new Rectangle();
        re.height = 4;
        re.width = 5;
        System.out.println("Area of the Rectangle : "+ re.Area());
        System.out.println("Perimeter of teh Rectangle :"+ re.Perimeter());

        // Question 5: Printing of the Tommy game
        Tommy tm = new Tommy();
        tm.hit();
        tm.fire();
        tm.run();

        // Question 6: Printing the circle class to find the area and perimeter
        Circle cir = new Circle();
        cir.radius = 10;
        System.out.println("Area of the circle : "+ cir.area());
        System.out.println("Perimeter of the circle : "+ cir.perimeter());
    }
}
