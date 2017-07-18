package nl.rabaelo.soundsharp;


public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Auth auth = new Auth();
        String name = menu.welcome();
        Database database = new Database();

        if (auth.isLoggedIn()) {
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
                    case 2:
                        database.storeData();
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