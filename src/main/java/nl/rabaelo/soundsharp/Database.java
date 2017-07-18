package nl.rabaelo.soundsharp;

import com.google.gson.*;

class Database {

     static class mp3_data {
        int ID;
        String Make;
        String Model;
        int MBSize;
        Double Price;
        String[] errors = new String[]{};
    }

     static void getData() {
        Database.mp3_data mp3Data = new Database.mp3_data();
        mp3Data.ID = 1;
        mp3Data.Make = "GET technologies .inc";
        mp3Data.Model = "HF 410";
        mp3Data.MBSize = 4096;
        mp3Data.Price = 129.95;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(mp3Data));
    }

    class storeData {

    }
}
