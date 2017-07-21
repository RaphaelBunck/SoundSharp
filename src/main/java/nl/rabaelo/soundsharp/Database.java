package nl.rabaelo.soundsharp;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Database {
    private Scanner scanner = new Scanner(System.in);
    private Gson gson = new Gson();
    private File file = new File("Data.json");


    ArrayList<Mp3> read() {
        String json = gson.toJson(new ArrayList<Mp3>());

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            json = bufferedReader.readLine();
        } catch (IOException ignored){}
        return gson.fromJson(json, new TypeToken<ArrayList<Mp3>>(){}.getType());
    }

    void write(ArrayList<Mp3> mp3s) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(gson.toJson(mp3s));
            bufferedWriter.close();
        } catch (IOException ignore){}
    }


    Mp3 getData() {
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