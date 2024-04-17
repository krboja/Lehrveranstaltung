public class Test {

    public static void main(String[] args) {
        // Erzeugen eines Studenten-Objekts
        Studenten student1 = new Studenten("Maria Dörfler", 123456, "Informatik");

        // Erzeugen eines Dozierenden-Objekts
        Dozierender dozierender1 = new Dozierender("Prof. Dr. Müller", "Informatik", "A123");

    
        // Aufruf der Methode "frageStellen"
        student1.frageStellen("Was kommt alles in der Prüfung dran?");

        // Aufruf der Methode "frageBeantworten"
        dozierender1.frageBeantworten(student1, "Das, was wir im Praktikum gemacht haben.");
        

        // Aufruf der Methode "sprechStundenAnfrage"
        student1.sprechStundenAnfrage("Montag", 12, 14);

        // Aufruf der Methode "sprechStundenAnfrage"
        dozierender1.sprechStundenAnfrage("Dienstag", 10, 12);
    }
}
