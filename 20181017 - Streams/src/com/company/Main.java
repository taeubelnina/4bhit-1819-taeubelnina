package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        String quelle="";
        String ziel="";
        String trennzeichen="";
        String tmp="";
        String tmp1="";
        Scanner sc = new Scanner(System.in);
        System.out.println(System.getProperty("user.dir"));
        TreeSet<Schueler> ts = new TreeSet<>();


        System.out.println("Quelle: ");
        quelle = sc.next();

        tmp = quelle.substring(quelle.length()-4);

        if(tmp.equals(".csv")){
            System.out.println("Spaltentrennzeichen: ");
            trennzeichen = sc.next();

            CSVRdWr csvrw = new CSVRdWr(quelle, trennzeichen);
            ts = csvrw.readCSV(quelle);

        }if (tmp.equals(".dst")){
            DSTRdWr dstrw = new DSTRdWr(quelle);
            ts = dstrw.readDST(quelle);

        }if (tmp.equals(".ost")){
            OSTRdWr ostrw = new OSTRdWr(quelle);
            ts = ostrw.readOST(quelle);

        }else{
            System.out.println("Falsche Dateiendung!");
        }


        System.out.println("Ziel: ");
        ziel = sc.next();

        tmp1 = ziel.substring(ziel.length()-4);

        if(tmp1.equals(".csv")){
            CSVRdWr csvrw = new CSVRdWr();
            csvrw.writeCSV(ts);

            ts=csvrw.readCSV(ziel);
            printAll(ts);

        }if (tmp1.equals(".dst")){
            DSTRdWr dstrw = new DSTRdWr();
            dstrw.writeDST(ts);

            ts=dstrw.readDST(ziel);
            printAll(ts);

        }if(tmp1.equals("ost")){
            OSTRdWr ostrw = new OSTRdWr();
            ostrw.writeOST(ts);

            ts=ostrw.readOST(ziel);
            printAll(ts);

        }else{
            System.out.println("Falsche Dateiendung!");
        }

    }

    public static void printAll(TreeSet<Schueler> treeSet){

        for (Schueler elem: treeSet) {
            System.out.println(elem.getId());
            System.out.println(elem.getKatnr());
            System.out.println(elem.getZuname());
            System.out.println(elem.getVorname());
            System.out.println(elem.getGeschlecht());
            System.out.println(elem.getReligion());
            System.out.println(elem.getGebdatum());
            System.out.println(elem.getStr());
            System.out.println(elem.getPlz());
            System.out.println(elem.getOrt());
            System.out.println(elem.getSchulformkurzbez());
            System.out.println(elem.getKla_bezeichnung());
            System.out.println(elem.getKv_zuname());
        }

    }
}
