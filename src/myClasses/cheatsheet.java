package myClasses;

import java.text.NumberFormat.Style;
import java.util.Scanner;

public class cheatsheet {

    static void all(){

    //  ---------- Declaration of variables in java ---------- 

    String phrase = "we doin' something together?";

    char a = 'a'; 
    int x = 20;
    byte age = 10;  //Bytes go from -128 to 127
    float money = 2.2456706f; // float goes up to 6-7 fractional numbers
    double y = 20.123456789101112; // double goes up to 15 fractional numbers

    boolean response  = false;  
    
    // ---------- Use to read input ----------

    Scanner scanner = new Scanner(System.in);

    // ----------  Print in Terminal ---------- 
    System.out.println("Hello, World!");
    System.out.println("What is your age?");
    
    age = scanner.nextByte();
    
    phrase = String.format("Your age is : %2d", age);

    System.out.println(phrase);
    }
}
