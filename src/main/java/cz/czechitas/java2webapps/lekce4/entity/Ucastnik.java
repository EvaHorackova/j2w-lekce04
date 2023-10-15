package cz.czechitas.java2webapps.lekce4.entity;

public class Ucastnik {

    private String jmeno;
    private String prijmeni;
    private String bydliste;

    public Ucastnik() {
    }

    public Ucastnik(String jmeno, String prijmeni, String bydliste) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.bydliste = bydliste;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getBydliste() {
        return bydliste;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }
}