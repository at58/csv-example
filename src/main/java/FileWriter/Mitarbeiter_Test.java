package FileWriter;

import static FileWriter.Mitarbeiter.erweitern;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Mitarbeiter_Test {

  static ArrayList<Mitarbeiter> mitarbeiter;

  public static void main(String[] args) throws FileNotFoundException{

    Mitarbeiter ahmet = new Mitarbeiter("Ahmet", "Toy", 29, "Obere Mühlstr. 56",
                                        64291, "Darmstadt", "FB 18",
                                        5858);

    Mitarbeiter aykut = new Mitarbeiter("Aykut", "Toy", 24, "Steinkaut 4", 35641,
                                        "Schwalbach", "FB 19", 9988);

    Mitarbeiter servet = new Mitarbeiter(); //Parameterloser Konstruktor
    servet.setVorname("Servet");
    servet.setNachname("Sarikaya");
    servet.setAlter(27);
    servet.setAdresseStrasse("Kirchstraße 26");
    servet.setPlz(35576);
    servet.setAdresseWohnort("Wetzlar");
    servet.setAbteilung("FB 17");
    servet.setPersonalNummer(4257);

    Mitarbeiter aylin = new Mitarbeiter();
    aylin.setVorname("Aylin");
    aylin.setNachname("Toy");
    aylin.setAlter(26);
    aylin.setAdresseStrasse("Am Sportplatz 4");
    aylin.setPlz(65614);
    aylin.setAdresseWohnort("Beselich");
    aylin.setAbteilung("FB 11");
    aylin.setPersonalNummer(6339);

    mitarbeiter = new ArrayList<>();

    erweitern(ahmet);
    erweitern(servet);
    erweitern(aykut);
    erweitern(aylin);
  }
}
