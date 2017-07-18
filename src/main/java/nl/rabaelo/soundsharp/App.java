package nl.rabaelo.soundsharp;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        String name = menu.welcome();

        if (menu.logIn()) {
            System.out.println("Welcome to SoundSharp, " + name);
        }

        int x = 1;
        while (x == 1) {
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
            } catch (NumberFormatException e) {
                System.out.println("Enter a number (1-9).");
            }
        }
    }
}