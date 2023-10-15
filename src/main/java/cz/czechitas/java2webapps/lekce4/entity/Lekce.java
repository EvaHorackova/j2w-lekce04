package cz.czechitas.java2webapps.lekce4.entity;

public class Lekce {

    private String nazev;
    private String datum;
    private String cas;
    private String misto;

    public Lekce () {
            }

    public Lekce(String nazev, String datum, String cas, String misto) {
        this.nazev = nazev;
        this.datum = datum;
        this.cas = cas;
        this.misto = misto;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getMisto() {
        return misto;
    }

    public void setMisto(String misto) {
        this.misto = misto;
    }
}