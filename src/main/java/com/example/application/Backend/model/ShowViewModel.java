package com.example.application.Backend.model;

public class ShowViewModel {
    private String Film, Biograf, Tid, Datum;
    private int Salong, Platser_kvar;

    public ShowViewModel(String film, String biograf, int salong, int platser_kvar, String tid, String datum) {
        Film = film;
        Biograf = biograf;
        Tid = tid;
        Datum = datum;
        Salong = salong;
        Platser_kvar = platser_kvar;
    }

    public String getFilm() {
        return Film;
    }

    public void setFilm(String film) {
        Film = film;
    }

    public String getBiograf() {
        return Biograf;
    }

    public void setBiograf(String biograf) {
        Biograf = biograf;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }

    public String getDatum() {
        return Datum;
    }

    public void setDatum(String datum) {
        Datum = datum;
    }

    public int getSalong() {
        return Salong;
    }

    public void setSalong(int salong) {
        Salong = salong;
    }

    public int getPlatser_kvar() {
        return Platser_kvar;
    }

    public void setPlatser_kvar(int platser_kvar) {
        Platser_kvar = platser_kvar;
    }
}
