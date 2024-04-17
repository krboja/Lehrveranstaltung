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
    public void frageBeantworten(Studenten studenten, String antwort) {
        System.out.println(name + " antwortet " + studenten.getName() + ": " + antwort);
    }

    // Getter für den Namen
    public String getName() {
        return name;
    }

    // Getter für die Fakultät
    public String getFakultaet() {
        return fakultaet;
    }

    // Getter für die Büronummer
    public String getBueronummer() {
        return bueronummer;
    }
    
    public void feedbackVonStudenten(Studenten studenten, String feedback) {
        System.out.println(name + " erhält Feedback von " + studenten.getName() + ": " + feedback);
    }
}
