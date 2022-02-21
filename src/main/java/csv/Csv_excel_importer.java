package csv;

import java.io.*;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Csv_excel_importer {

  public static void main(String[] args){

    String file = "src\\main\\resources\\excel-liste.csv";
    BufferedReader reader = null;
    String line = "";

    try{
      reader = new BufferedReader(new FileReader(file));
      while((line = reader.readLine())!= null){ //.readline liest eine Zeile bis zum nächsten Zeilenumbruch

        String[] row = line.split(";"); // Trennung der Spalten durch Kommata

        for(String index : row){
          System.out.printf("%-10s",index);
        }
        System.out.println();
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
