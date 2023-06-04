
//Importing the Scanner
import java.util.Scanner;
//Importing myClasses
import static myClasses.crime.*;
import static myClasses.calculators.*;


public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
            int response = Menu();
            switch (response) {
                default:
                    Menu();
                case 1:
                    calculators_gui();
                    scanner.close();
                    break;
                case 2:
                    System.out.println("Nothing here yet");
                    scanner.close();
                    break;
                case 3:
                    System.out.println("Nothing here yet");
                    scanner.close();
                    break;
            }
        }
    
        static int Menu(){

            System.out.println("===================\n");
            System.out.println("[1]- Calculators");
            System.out.println("[2]- String Formatters");
            System.out.println("[3]- Commit crimes");  
            System.out.println("\n===================");

            int response = scanner.nextInt();
            return response;
        }

}
        
        
