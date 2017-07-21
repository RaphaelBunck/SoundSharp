package nl.rabaelo.soundsharp;

import io.bretty.console.table.Alignment;
import io.bretty.console.table.ColumnFormatter;
import io.bretty.console.table.Precision;
import io.bretty.console.table.Table;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Auth auth = new Auth();
        String name = menu.welcome();
        Database database = new Database();
        dataTable dataTable = new dataTable();

        if (auth.isLoggedIn()) {
            System.out.println("Welcome to SoundSharp, " + name);
        }

        while (true) {
            try {
                switch (menu.options()) {
                    case 1:
                        Table.Builder builder = new Table.Builder("ID", dataTable.idData(), dataTable.idFormatter);
                        builder.addColumn("Brand", dataTable.brandData(), dataTable.brandFormatter);
                        builder.addColumn("Model", dataTable.modelData(), dataTable.modelFormatter);
                        builder.addColumn("Memory", dataTable.memoryData(), dataTable.memFormatter);
                        builder.addColumn("Price", dataTable.priceData(), dataTable.priceFormatter);
                        Table table = builder.build();
                        System.out.println(table);
                    case 2:
                        ArrayList<Mp3> mp3s2 = database.read();
                        mp3s2.add(database.getData());
                        database.write(mp3s2);
                    case 3:
//                        database.newJson();
                    case 8:

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