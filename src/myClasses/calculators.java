package myClasses;

import java.util.Scanner;

public class calculators {
    static Scanner scanner = new Scanner(System.in);

    public static void calculators_gui(){

        System.out.println("===================\n");
        System.out.println("[1]- Sum");
        System.out.println("[2]- Multiplification");
        System.out.println("[3]- Factorial");
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
                multiplication();
                break;
            case 3:
                factorial();
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
    public static void multiplication(){

        System.out.println("What is the quantity of numbers you want to multiply up?");

        int n = scanner.nextInt();
        int[] nums = new int[n];
        int total = 1;

        System.out.println("Alright, let's type the numbers we are going to multiply up.");
        for (int i = 0; i < n ; i++) 
        {
            nums[i]=scanner.nextInt();  
        }
        
        for (int i = 0; i < n ; i++){
            total = total * nums[i];
        }

        String result = String.format("The multiplification of these numbers is %2d", total);

        System.out.println(result);
    }
    public static void factorial(){

        System.out.println("What is the factorial you want to know the value of?");

        int n = scanner.nextInt();

        System.out.println(fact(n));
    }
    public static int fact(int num ){
        int fat;
        if (num==0){
            return 1;
        }
        else{ fat = fact(num-1) * num;}
    return fat;
    }
}
