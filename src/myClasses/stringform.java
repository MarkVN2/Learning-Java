package myClasses;

import java.util.Scanner;

public class stringform {

    static Scanner scanner = new Scanner(System.in);
    
    public static void formatter_gui(){

        System.out.println("===================\n");
        System.out.println("[1]- Remove duplicates");
        System.out.println("[2]- Cut in half");
        System.out.println("[3]- Inverter");
        System.out.println("\n===================");

        int response = scanner.nextInt();
        switch (response) {
            default:
                formatter_gui();
                break;
            case 1:
                remove_dupe();
                break;
            case 2:
                cut_in_half();
                scanner.close();
                break;
            case 3:
                System.out.println("Nothing here yet");
                scanner.close();
                break;
        }
    }
    public static void remove_dupe(){
        System.out.println("What is the word/phrase you want to remove the duplicated characters?");

        String phrase = scanner.next();

    }

    public static void cut_in_half(){
        System.out.println("What is the word/phrase you want to cut in half?");

        String phrase = scanner.next();
        int phrase_len = phrase.length();
        String half_phrase = "";
        int i = 0 ;

        for (int half_len = phrase_len/2 ; phrase_len > half_len ; i++){
            phrase_len = phrase_len - 1;
            char word = phrase.charAt(i);
            half_phrase = half_phrase + word;
        }
        System.out.println(half_phrase);
    }

    public static void inverter(){
        System.out.println("What is the word/phrase you want to invert?");

         String phrase = scanner.next();
    }
}
