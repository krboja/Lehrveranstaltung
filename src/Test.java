public class Test {

    public static void main(String[] args) {
        // Erzeugen eines Studenten-Objekts
        Studenten student1 = new Studenten("Maria Dörfler", 123456, "Informatik");
        // Aufruf der Methode "frageStellen"
        student1.frageStellen("Was kommt alles in der Prüfung dran?");
        student1.sprechstundenanfrag("Maria Dörfler", 123456, "Informatik", 19, 04, 2024, 14);	
        
        
    }
}