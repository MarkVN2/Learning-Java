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
        System.out.println("What is the quantity of numbers you want to sum up?");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int total = 0;

        System.out.println("Alright, let's type the numbers we are going to sum up.");
        for (int i = 0; i < n ; i++) 
        {
            nums[i]=scanner.nextInt();  
        }
        
        for (int i = 0; i < n ; i++){
            total = total + nums[i];
        }

        String result = String.format("The sum of these numbers is %2d", total);

        System.out.println(result);
    }
    public static void graph(){
        System.out.println("Nothing here yet");
    }
    public static void pairs(){
        System.out.println("Nothing here yet");
    }
}
