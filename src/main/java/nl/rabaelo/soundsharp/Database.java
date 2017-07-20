package nl.rabaelo.soundsharp;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class Database {
    private Scanner scanner = new Scanner(System.in);
    private GsonBuilder builder = new GsonBuilder();
    private File jsonFile = new File("json/data.json");
    private Gson gson = new Gson();







//    void newJson() {
//        Gson gson = builder.create();
//        builder.setPrettyPrinting().serializeNulls();
//        System.out.println("Enter ID please.");
//        mp3Data.ID = Integer.parseInt(scanner.next());
//        System.out.println("Enter brand please.");
//        mp3Data.Make = scanner.next();
//        System.out.println("Enter model please.");
//        mp3Data.Model = scanner.next();
//        System.out.println("Enter memory please.");
//        mp3Data.MBSize = Integer.parseInt(scanner.next());
//        System.out.println("Enter price please;");
//        mp3Data.Price = Double.parseDouble(scanner.next());
//
//        System.out.println("\nIs this data correct? (Y/N)");
//        System.out.println(gson.toJson(mp3Data));
//        if (scanner.next().equals("Y")) {
//            try {
//                System.out.println("Save as?");
//                Writer writer = new FileWriter("json/" + scanner.next() + ".json");
//                Gson gsonX = new GsonBuilder().create();
//                gsonX.toJson(mp3Data, writer);
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        } else {
//            System.exit(0);
//        }
//    }
    void newJson() {
        ArrayList<Mp3> mp3_Data = new ArrayList<Mp3>();
        ArrayList<ArrayList<Mp3>> mp3_List = new ArrayList<ArrayList<Mp3>>();
            mp3_Data.add(getData());
            mp3_List.add(mp3_Data);

            try {
                FileWriter fileWriter = new FileWriter(jsonFile);
                gson.toJson(mp3_List, fileWriter);
                fileWriter.close();
                System.out.println("Made new file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    ArrayList<ArrayList<Mp3>> jsonToArray() {
        try {
            FileReader fileReader = new FileReader(jsonFile);
            BufferedReader buffered = new BufferedReader(fileReader);
            Type collectionType = new TypeToken<ArrayList<ArrayList<Mp3>>>(){}.getType();
            return new Gson().fromJson(buffered, collectionType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    void toJson() {
        Gson gson = builder.create();
        builder.setPrettyPrinting().serializeNulls();
        ArrayList<Mp3> mp3_Data = new ArrayList<Mp3>();

        mp3_Data.add(getData());

        System.out.println("Data:");
        System.out.println(mp3_Data);

        jsonToArray().add(mp3_Data);

        try {
            FileWriter fileWriter = new FileWriter(jsonFile);
            gson.toJson(jsonToArray(), fileWriter);
            fileWriter.close();
            System.out.println("Wrote file!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private Mp3 getData() {
        System.out.println("Enter ID please.");
        Integer ID = Integer.parseInt(scanner.next());
        System.out.println("Enter brand please.");
        String Brand = scanner.next();
        System.out.println("Enter model please.");
        String Model = scanner.next();
        System.out.println("Enter memory please.");
        Integer Mem = Integer.parseInt(scanner.next());
        System.out.println("Enter price please;");
        Double Price = Double.parseDouble(scanner.next());

        return new Mp3(ID, Brand, Model, Mem, Price);
    }
}