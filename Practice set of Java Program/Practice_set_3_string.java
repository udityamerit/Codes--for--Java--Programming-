package Practice_set;

public class Practice_set_3_string {
    public static void main(String[] args) {
        //Question 1: Change in lowerCase ==>
        // Date 9/7/23:
        String name = "Uditya Narayan Tiwari";
         name = name.toLowerCase();
        System.out.println(name);

        // Question 2: Replacing the character ==>
        String Name = "Uditya Narayan Tiwari";
        Name = Name.replace(" ","_");
        System.out.println(Name);

       // Question 3: Replacing the character ==>
       String letter = "Dear <|name|>, Thanks a lot ";
       letter = letter.replace("<|name|>","Uditya Narayan Tiwari");
        System.out.println(letter);

        // Question 4: Detecting the spaces ==>
        String naam = "Uditya Narayan  Tiwari  is   a good  boy";
        System.out.println(naam.indexOf("  "));
        System.out.println(naam.indexOf("    "));

        //Question 5: Write the text in the formal type ==>
        String letter1 = "Dear Udit,\n\t This java course is nice .\n\t\t Thanks";
        System.out.println(letter1);

    }
}
