package nl.rabaelo.soundsharp;

import com.google.gson.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

class Database {
    private Scanner scanner = new Scanner(System.in);
    private Database.mp3_data mp3Data = new Database.mp3_data();
    private GsonBuilder builder = new GsonBuilder();

    static class mp3_data {
        int ID;
        String Make;
        String Model;
        int MBSize;
        Double Price;
        String[] errors = new String[]{};
    }

    void getData() {
        Gson gson = builder.create();
        builder.setPrettyPrinting().serializeNulls();
        System.out.println(gson.toJson(mp3Data));
    }

    void storeData() {
        Gson gson = builder.create();
        builder.setPrettyPrinting().serializeNulls();
        System.out.println("Enter ID please.");
        mp3Data.ID = Integer.parseInt(scanner.next());
        System.out.println("Enter brand please.");
        mp3Data.Make = scanner.next();
        System.out.println("Enter model please.");
        mp3Data.Model = scanner.next();
        System.out.println("Enter memory please.");
        mp3Data.MBSize = Integer.parseInt(scanner.next());
        System.out.println("Enter price please;");
        mp3Data.Price = Double.parseDouble(scanner.next());

        System.out.println("\nIs this data correct? (Y/N)");
        System.out.println(gson.toJson(mp3Data));
        if (scanner.next().equals("Y")) {
            try {
                System.out.println("Save as?");
                Writer writer = new FileWriter("json/" + scanner.next() + ".json");
                Gson gsonX = new GsonBuilder().create();
                gsonX.toJson(mp3Data, writer);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.exit(0);
        }
    }
}
