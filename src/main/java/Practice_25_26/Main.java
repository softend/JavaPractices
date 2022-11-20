package main.java.Practice_25_26;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        var document = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").get();

        JsonFile jsonFile = new JsonFile();
        var allLines = document.select("span.js-metro-line");
        ArrayList<Line> lines = new ArrayList<>();
        for (Element e : allLines) {
            if (isNumeric(e.attr("data-line"))) {
                Line line = new Line(Integer.parseInt(e.attr("data-line")), e.text());
                lines.add(line);
            }
        }
        jsonFile.lines = lines;
        ArrayList<Elements> stationsArr = new ArrayList<>();
        Map<Integer, ArrayList<String>> strStationsArr = new HashMap<>();
        for (int i = 1; i < 16; i++) {
            if (i == 13) i++;
            String cssQuery = "div[data-line=" + i + "]";
            stationsArr.add(document.select(cssQuery).first().children());
            int index;
            if (i < 13) {
                index = i - 1;
            } else {
                index = i - 2;
            }
            ArrayList<String> tempArr = new ArrayList<>();
            for (Element e : stationsArr.get(index)) {
                tempArr.add(e.text());
            }
            strStationsArr.put(i,tempArr);
        }
        jsonFile.stations=strStationsArr;
        Gson gson = new Gson();
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/ilyazenchenko/IdeaProjects/JavaPractices/src/main/java/Practice_25_26/file.json"));
        writer.write(gson.toJson(jsonFile));
        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("/Users/ilyazenchenko/IdeaProjects/JavaPractices/src/main/java/Practice_25_26/file.json"));
        String jsString = reader.readLine();
        jsonFile = gson.fromJson(jsString, JsonFile.class);
        strStationsArr = jsonFile.stations;
        for(int i=0; i<strStationsArr.size();i++){
            int index=i+1;
            if(i>11) {index++;}
            ArrayList<String> arr= strStationsArr.get(index);
            System.out.println("На ветке "+(i+1)+" "+arr.size()+" станций");
        }
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
