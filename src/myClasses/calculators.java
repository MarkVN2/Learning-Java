package myClasses;

import java.util.Arrays;
import java.util.Scanner;

public class calculators {
    static Scanner scanner = new Scanner(System.in);

    public static void calculators_gui(){

        System.out.println("===================\n");
        System.out.println("[1]- Sum");
        System.out.println("[2]- Graph");
        System.out.println("[3]- Pairs");
        System.out.println("\n===================");

        int response = scanner.nextInt();
        switch (response) {
            default:
                calculators_gui();
                break;
            case 1:
                sum();
                break;
            case 2:
                graph();
                break;
            case 3:
                pairs();
                break;
        }
    }
    public static void sum() {
        System.out.println("What is the numbers that we should be summing up? separate the numbers by spaces");
        String numbers = scanner.next();
    }
    public static void graph(){
        System.out.println("Nothing here yet");
    }
    public static void pairs(){
        System.out.println("Nothing here yet");
    }
}
