
//Importing the Scanner
import java.util.Scanner;
//Importing myClasses

import static myClasses.calculators.*;
import static myClasses.stringform.*;


public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       
        System.out.println("===================\n");
        System.out.println("[1]- Calculators");
        System.out.println("[2]- String Formatters");
        System.out.println("[3]- Messing Around");  
        System.out.println("\n===================");

        int response = scanner.nextInt();

            switch (response) {
                default:
                    main(args);
                case 1:
                    calculators_gui();
                    scanner.close();
                    break;
                case 2:
                    formatter_gui();
                    scanner.close();
                    break;
                case 3:
                    System.out.println("Nothing here yet");
                    scanner.close();
                    break;
            }
        }
}
        
        
