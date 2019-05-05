package todolist;

public class Teendo {

    private String nev;
    private String datum;
    private enum prioritas {LOW, MEDIUM, HIGH}
    private boolean teljesitett;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public boolean isTeljesitett() {
        return teljesitett;
    }

    boolean atvalt() {
        if (teljesitett == true) {
            teljesitett = false;
        } else {
            teljesitett = true;
        }
        return teljesitett;
    }
}
