package com.company;

import java.io.Serializable;

public class Schueler implements Serializable, Comparable<Schueler> {

    private int id;
    private int katnr;
    private String zuname;
    private String vorname;
    private String geschlecht;
    private String religion;
    private String gebdatum;
    private String str;
    private int plz;
    private String ort;
    private String schulformkurzbez;
    private String kla_bezeichnung;
    private String kv_zuname;


    public Schueler(int id, int katnr, String zuname, String vorname, String geschlecht, String religion, String gebdatum, String str, int plz, String ort, String schulformkurzbez, String kla_bezeichnung, String kv_zuname) {
        this.id = id;
        this.katnr = katnr;
        this.zuname = zuname;
        this.vorname = vorname;
        this.geschlecht = geschlecht;
        this.religion = religion;
        this.gebdatum = gebdatum;
        this.str = str;
        this.plz = plz;
        this.ort = ort;
        this.schulformkurzbez = schulformkurzbez;
        this.kla_bezeichnung = kla_bezeichnung;
        this.kv_zuname = kv_zuname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKatnr() {
        return katnr;
    }

    public void setKatnr(int katnr) {
        this.katnr = katnr;
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getGebdatum() {
        return gebdatum;
    }

    public void setGebdatum(String gebdatum) {
        this.gebdatum = gebdatum;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getSchulformkurzbez() {
        return schulformkurzbez;
    }

    public void setSchulformkurzbez(String schulformkurzbez) {
        this.schulformkurzbez = schulformkurzbez;
    }

    public String getKla_bezeichnung() {
        return kla_bezeichnung;
    }

    public void setKla_bezeichnung(String kla_bezeichnung) {
        this.kla_bezeichnung = kla_bezeichnung;
    }

    public String getKv_zuname() {
        return kv_zuname;
    }

    public void setKv_zuname(String kv_zuname) {
        this.kv_zuname = kv_zuname;
    }

    @Override
    public int compareTo(Schueler o) {
        return 0;
    }
}
