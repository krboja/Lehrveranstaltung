public class Studenten {

    private String name;
    private int matrikelnummer;
    private String studiengang;
    private int tag;
    private int monat;
    private int jahr;
    private int Uhrzeit;

    // Konstruktor
    public Studenten(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    // Öffentliche Methode zum Fragenstellen
    public void frageStellen(String frage) {
        System.out.println(name + matrikelnummer + " :"+ frage);
    }

    public void sprechstundenanfrag(String name, int matrikelnummer, String studiengang, int tag, int monat, int jahr, int Uhrzeit) {
        System.out.println(name + matrikelnummer + " :"+ "Ich möchte einen Termin für die Sprechstunde am " + tag + "." + monat + "." + jahr + " um " + Uhrzeit + " Uhr anfragen.");
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }


}

