package nl.rabaelo.soundsharp;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

class Menu {
    private Scanner scan = new Scanner(System.in);

    String welcome() {
        System.out.println("What is your name?");
        return (scan.next());
    }

    Boolean logIn() {
        System.out.println("What is your password?");
        Console console = System.console();
        int x = 0;
        System.out.println("Try: " + "(" + (3 - x) + "/3)");
        while (x < 3) {
            char[] password = console.readPassword();
            char[] correctPass = new char[]{'S', 'H', 'A', 'R', 'P', 'S', 'O', 'U', 'N', 'D'};
            if (Arrays.equals(password, correctPass)) {
                return true;
            } else {
                System.out.println("Password incorrect.");
                x++;
            }
            System.out.println("Try: " + "(" + (3 - x) + "/3)");

            if (x == 2) {
                System.out.println("Last try!");
            }
        }
        return false;
    }

    int options() {
        System.out.println("1. Overview MP3 players.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8.");
        System.out.println("9. Exit");

        return new Integer(scan.next());
    }
}



