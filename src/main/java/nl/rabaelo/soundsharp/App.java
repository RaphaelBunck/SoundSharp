package nl.rabaelo.soundsharp;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        String name = welcome();

        System.out.println("What is your password?");

        if (logIn()) {
            System.out.println("Welcome to SoundSharp, " + name);
        }

        int x = 1;
        while (x==1) {
            try {
                switch (menu.options()) {
                    case 1:
                        System.out.println("Dit moet iets doen XDXD");
                        x = 0;
                        break;
                    case 9:
                        System.exit(0);
                        break;
                }
            } catch(NumberFormatException e) {
                System.out.println("Enter a number (1-9).");
            }
        }
    }

    private static String welcome() {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        return (scan.next());
    }


    private static boolean logIn() {
        Console console = System.console();
        int x = 0;
        System.out.println("Try: " + "(" + (3-x) + "/3)");
        while (x < 3) {
            char[] password = console.readPassword();
            char[] correctPass = new char[]{'S', 'H', 'A', 'R', 'P', 'S', 'O', 'U', 'N', 'D'};
            if (Arrays.equals(password, correctPass)) {
                return true;
            } else {
                System.out.println("Password incorrect.");
                x++;
            }
            System.out.println("Try: " + "(" + (3-x) + "/3)");

            if (x==2){
                System.out.println("Last try!");
            }
        }
        return false;
    }
}