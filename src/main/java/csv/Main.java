package csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Main {

  public static void main(String[] args){
    try (
        Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\toy\\IdeaProjects\\Resources"));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL);
    ) {
      for (CSVRecord csvRecord : csvParser) {
        // Accessing Values by Column Index
        String vorname = csvRecord.get(0);
        String name = csvRecord.get(1);
        String phone = csvRecord.get(2);
        String country = csvRecord.get(3);
        String age = csvRecord.get(4);

        System.out.println("Record No - " + csvRecord.getRecordNumber());
        System.out.println("---------------");
        System.out.println("Vorname : " + vorname);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Country : " + country);
        System.out.println("Alter: " + age);
        System.out.println("---------------\n\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
