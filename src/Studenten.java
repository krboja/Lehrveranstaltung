public class Studenten {

    private String name;
    private int matrikelnummer;
    private String studiengang;

    // Konstruktor
    public Studenten(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    // Öffentliche Methode zum Fragenstellen
    public void frageStellen(String frage) {
        System.out.println(name + " :"+ frage);
    }
}
