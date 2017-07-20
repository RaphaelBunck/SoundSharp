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

        while (true) {
            try {
                switch (menu.options()) {
//                    case 1:
//                        database.getData();
                    case 2:
                        database.toJson();
                    case 3:
                        database.jsonToArray();
                    case 4:
                        database.newJson();
                    case 8:
//                       database.newJson();
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