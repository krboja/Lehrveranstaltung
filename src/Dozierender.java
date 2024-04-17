public class Dozierender {
    // Datenfelder
    private String name;
    private String fakultaet;
    private String bueronummer;

    // Konstruktor
    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    // Öffentliche Methode zum Beantworten von Fragen
    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println(name + " antwortet " + studierender.getName() + ": " + antwort);
    }

    // Getter für den Namen
    public String getName() {
        return name;
    }
}
