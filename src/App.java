
//Importing the Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    

            // Declaration of variables in java

            String phrase = "we doin' something together?";

            char a = 'a'; 
            int x = 20;

            float money = 2.2456706f; // float goes up to 6-7 fractional numbers
            double y = 20.123456789101112; // double goes up to 15 fractional numbers

            
            boolean response  = false; 


            // Use to read input
            Scanner scanner = new Scanner(System.in);

            // Print in Terminal
            System.out.println("Hello, World!");

            System.out.println("What is your age?");
            
            //Bytes go from -128 to 127
            byte age = scanner.nextByte();  
           
            phrase = String.format("Your age is : %2d", age);

            System.out.println(phrase);
            scanner.nextLine();
        

            // While and if is the same as C#
            while (response == false) {

                System.out.println("Am i right?");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("Yes")){
                    System.out.println("Yay");
                    response = true;
                }
                else if (input.equalsIgnoreCase("No")){
                    System.out.println("Oh sorry, guess i am bad with numbers.");
                    response = true;
                    
                }

            }
            scanner.close(); 

            
        }
        
}
