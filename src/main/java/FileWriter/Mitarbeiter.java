package FileWriter;

import static FileWriter.Mitarbeiter_Test.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Mitarbeiter {

  private String vorname;
  private String nachname;
  private int alter;
  private String adresseStrasse;
  private int plz;
  private String adresseWohnort;
  private String abteilung;
  private int personalNummer;

  static final String dateipfad = "C:\\Users\\toy\\IdeaProjects\\csv-example\\src\\main\\resources\\Mitarbeiter.txt";
  static final File datei = new File(dateipfad);
  static BufferedWriter writer;


  public Mitarbeiter() {
    // parameterloser (Standard-)Konstruktor
  }

  public Mitarbeiter(String vorname, String nachname, int alter,
                     String adresseStrasse, int plz, String adresseWohnort,
                     String abteilung, int personalNummer){
    // parametrisierter Konstruktor:
    this.vorname = vorname;
    this.nachname = nachname;
    this.alter = alter;
    this.adresseStrasse = adresseStrasse;
    this.plz = plz;
    this.adresseWohnort = adresseWohnort;
    this.abteilung = abteilung;
    this.personalNummer= personalNummer;
  }
  /*
  Getter und Setter:
   */
  public String getVorname(){
    return vorname;
  }
  public void setVorname(String vorname){
    this.vorname = vorname;
  }
  public String getNachname(){
    return nachname;
  }
  public void setNachname(String nachname){
    this.nachname = nachname;
  }
  public int getAlter(){
    return alter;
  }
  public void setAlter(int alter){
    this.alter = alter;
  }
  public String getAdresseStrasse() {
    return adresseStrasse;
  }
  public void setAdresseStrasse(String adresseStrasse) {
    this.adresseStrasse = adresseStrasse;
  }
  public int getPlz(){
    return plz;
  }
  public void setPlz(int plz){
    this.plz = plz;
  }
  public String getAdresseWohnort() {
    return adresseWohnort;
  }
  public void setAdresseWohnort(String adresseWohnort) {
    this.adresseWohnort = adresseWohnort;
  }
  public String getAbteilung() {
    return abteilung;
  }
  public void setAbteilung(String abteilung) {
    this.abteilung = abteilung;
  }
  public int getPersonalNummer() {
    return personalNummer;
  }
  public void setPersonalNummer(int personalNummer) {
    this.personalNummer = personalNummer;
  }

  /*
  Methode zum Hinzufügen neuer Mitarbeiter in die Datei
   */
  public static void erweitern(Mitarbeiter ma){
    mitarbeiter.add(ma);  // Den neuen Mitarbeiter zur ArrayList hinzufügen

    try{
      if(!datei.exists()){
        datei.createNewFile();
      }
    } catch (IOException e) {
      JOptionPane.showMessageDialog(null,"Fehler! Datei " +
          "wurde nicht gefunden\n\nFehlermeldung:\n" + e.getMessage());;
    }

    StringBuilder sb = new StringBuilder();
    for (Mitarbeiter index : mitarbeiter){
      sb.append(index.getVorname() + ",");
      sb.append(index.getNachname() + ",");
      sb.append(index.getAlter() + ",");
      sb.append(index.getAdresseStrasse() + ",");
      sb.append(index.getPlz() + ",");
      sb.append(index.getAdresseWohnort() + ",");
      sb.append(index.getAbteilung() + ",");
      sb.append(index.getPersonalNummer() + ",\n");
    }

    try{
      writer = new BufferedWriter(new FileWriter(datei)); /* true sorgt dafür, dass
    die Datei nicht jedes Mal überschrieben wird beim Methodenaufruf, sondern der Inhalt stattdessen
     hintendran gehängt wird.
     */
      writer.write(sb.toString());
      writer.flush();
      writer.close();

      JOptionPane.showMessageDialog(null,"Neuer Mitarbeiter wurde " +
          "erfolgreich in der Datei gespeichert.");
    } catch (IOException ex){
      JOptionPane.showMessageDialog(null,"Fehler!\n" +
          "Übertragung in die Datei fehlgeschlagen.\n\nFehlermeldung: \n\n" + ex.getMessage());
    }

    //Zusätzlich Ausgabe in der Konsole erzeugen mit PrintWriter:
    PrintWriter printWriter = new PrintWriter(writer);
    printWriter.println(ma);
    printWriter.close();
  }
}
