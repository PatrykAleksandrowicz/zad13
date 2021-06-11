package devices;

public class Application {
    private String nazwa;
    private String wersja;
    private Double cena;

    public Application(String nazwa, String wersja, Double cena) {
        this.nazwa = nazwa;
        this.wersja = wersja;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getWersja() {
        return wersja;
    }

    public void setWersja(String wersja) {
        this.wersja = wersja;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
}
