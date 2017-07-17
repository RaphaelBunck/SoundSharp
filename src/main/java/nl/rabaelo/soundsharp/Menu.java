package nl.rabaelo.soundsharp;

import java.util.Scanner;

class Menu {
    private Scanner scan = new Scanner(System.in);
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



