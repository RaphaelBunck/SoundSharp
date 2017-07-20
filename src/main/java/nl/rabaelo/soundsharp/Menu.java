package nl.rabaelo.soundsharp;

import java.io.Console;
import java.util.Scanner;

class Menu {
    private Scanner scan = new Scanner(System.in);

    String welcome() {
        System.out.println("What is your name?");
        return (scan.next());
    }

    char[] logIn() {
        System.out.println("What is your password?");
        Console console = System.console();
        return console.readPassword();
    }

    int options() {
        System.out.println("1. Overview MP3 players.");
        System.out.println("2. Add Mp3 players to database");
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



