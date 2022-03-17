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
                                                // solange eine Zeile nicht leer ist,...
        String[] row = line.split(";"); // Trennung der Spalten durch Semikolon

        for(String index : row){ // für jedes String im Array row, in der die Spalten durch ; getrennt sind
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
