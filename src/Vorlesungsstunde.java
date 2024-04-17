public class Vorlesungsstunde {
    
    public String thema;
    public int Datum;
    public String Uhrzeit;
    public String Raum;

    public Vorlesungsstunde(String thema, int Datum, String Uhrzeit, String Raum) {
        this.thema = thema;
        this.Datum = Datum;
        this.Uhrzeit = Uhrzeit;
        this.Raum = Raum;
    }

    public void vorlesungsDetails(){
        System.out.println("Thema: " + thema + " Datum: " + Datum + " Uhrzeit: " + Uhrzeit + " Raum: " + Raum);
    }

}
