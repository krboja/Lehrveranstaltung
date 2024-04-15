public class Test {

    public static void main(String[] args) {
        // Erzeugen eines Studenten-Objekts
        Studenten student1 = new Studenten("Maria Dörfler", 123456, "Informatik");
        // Aufruf der Methode "frageStellen"
        student1.frageStellen("Was kommt alles in der Prüfung dran?");
        
        
        // Aufruf der Methode "sprechStundenAnfrage"
        student1.sprechStundenAnfrage("Montag", 12, 14);
    }
}
