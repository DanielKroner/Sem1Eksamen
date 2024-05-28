package TaskOne.src.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public ArrayList<String> readData(String path){
        ArrayList<String> datalist = new ArrayList<>();
        File file = new File(path);
        if(file.exists()){
            saveData("header", new ArrayList<>(), path);
        }
        try{
            Scanner scanner = new Scanner(file);
            scanner.nextLine();

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                datalist.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found!");
        }
        return datalist;
    }

    public void saveData(String header, ArrayList<Object> datalist, String path){
        try{
            FileWriter writer = new FileWriter(path);
            writer.write(header + "\n");
                for(Object item : datalist){
                    writer.write(item + "\n");
                }
                writer.close();
        } catch (IOException e) {
            System.out.println("The file was not saved!");
        }
    }


}
