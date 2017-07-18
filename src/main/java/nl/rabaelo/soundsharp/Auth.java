package nl.rabaelo.soundsharp;

import java.util.Arrays;

class Auth {
    private Menu menu = new Menu();
    Boolean isLoggedIn() {
        int x = 0;
        System.out.println("Try: " + "(" + (3 - x) + "/3)");
        while (x < 3) {
            char[] password = menu.logIn();
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
}
