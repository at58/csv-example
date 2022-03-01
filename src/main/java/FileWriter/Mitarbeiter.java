package FileWriter;

public class Mitarbeiter {

  private String vorname;
  private String nachname;
  private int alter;
  private String adresseStrasse;
  private int plz;
  private String adresseWohnort;
  private String abteilung;
  private int personalNummer;

  public Mitarbeiter() {
    // parameterloser (Standard-)Konstruktor
  }

  public Mitarbeiter(String vorname, String nachname, int alter,
                     String adresseStrasse,int plz,String adresseWohnort,
                     String abteilung,int personalNummer){

    this.vorname = vorname;
    this.nachname = nachname;
    this.alter = alter;
    this.adresseStrasse = adresseStrasse;
    this.plz = plz;
    this.adresseWohnort = adresseWohnort;
    this.abteilung = abteilung;
    this.personalNummer= personalNummer;
  }

  public String getVorname(){
    return vorname;
  }

}
