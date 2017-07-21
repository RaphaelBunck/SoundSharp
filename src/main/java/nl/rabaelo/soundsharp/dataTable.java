package nl.rabaelo.soundsharp;

import io.bretty.console.table.Alignment;
import io.bretty.console.table.ColumnFormatter;
import io.bretty.console.table.Precision;
import io.bretty.console.table.Table;

import java.util.ArrayList;

public class dataTable {
    Database database = new Database();
    ArrayList<Mp3> players = database.read();
    ColumnFormatter<Number> idFormatter = ColumnFormatter.number(Alignment.RIGHT, 3, Precision.ZERO);
    ColumnFormatter<String> brandFormatter = ColumnFormatter.text(Alignment.LEFT, 10);
    ColumnFormatter<String> modelFormatter = ColumnFormatter.text(Alignment.LEFT, 10);
    ColumnFormatter<Number> memFormatter = ColumnFormatter.number(Alignment.RIGHT, 6, Precision.ZERO);
    ColumnFormatter<Number> priceFormatter = ColumnFormatter.number(Alignment.RIGHT, 5, Precision.ZERO);

    ArrayList<Mp3> mp3s = database.read();


    Number[] idData() {
        ArrayList<Number> idList = new ArrayList<Number>();
        for (Mp3 mp3 : mp3s) {
            idList.add(mp3.getID());
        }
        Number[] arr = new Number[idList.size()];
        for (int i = 0; i < idList.size(); i++) {
            if (idList.get(i) != null) {
                arr[i] = idList.get(i);
            }
        }
        return arr;
    }

    String[] brandData() {
        ArrayList<String> brandList = new ArrayList<String>();
        for (Mp3 mp3 : mp3s) {
            brandList.add(mp3.getMake());
        }
        return brandList.toArray(new String[0]);
    }

    String[] modelData() {
        ArrayList<String> modelList = new ArrayList<String>();
        for (Mp3 mp3 : mp3s) {
            modelList.add(mp3.getModel());
        }
        return modelList.toArray(new String[0]);
    }

    Number[] memoryData() {
        ArrayList<Integer> memoryList = new ArrayList<Integer>();
        for (Mp3 mp3 : mp3s) {
            memoryList.add(mp3.getMBSize());
        }
        Number[] arr = new Number[memoryList.size()];
        for (int i = 0; i < memoryList.size(); i++) {
            if (memoryList.get(i) != null) {
                arr[i] = memoryList.get(i);
            }
        }
        return arr;
    }

    Number[] priceData() {
        ArrayList<Double> priceList = new ArrayList<Double>();
        for (Mp3 mp3 : mp3s) {
            priceList.add(mp3.getPrice());
        }
        Number[] arr = new Number[priceList.size()];
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) != null) {
                arr[i] = priceList.get(i);
            }
        }
        return arr;
    }
}