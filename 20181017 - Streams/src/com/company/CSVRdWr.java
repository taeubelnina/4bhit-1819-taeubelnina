package com.company;

import java.io.*;
import java.util.TreeSet;

public class CSVRdWr{

        private String file;
        private String trennzeichen;

        public CSVRdWr(String quelle, String trennzeichen) {

        }

        public CSVRdWr(String file) {
            this.file = file;
        }

        public CSVRdWr() {

        }

    public String getFile() {
            return file;
        }

        public String getTrennzeichen() {
            return trennzeichen;
        }


    public void setFile(String file, String trennzeichen) {
            this.file = file;
        }

        public Schueler parseLineSplit(String tmp){
            String []s = tmp.split(trennzeichen);

            return new Schueler(Integer.parseInt(s[0]), Integer.parseInt(s[1]), s[2], s[3], s[4], s[5], s[6], s[7], Integer.parseInt(s[8]), s[9], s[10], s[11], s[12]);
        }

        public TreeSet<Schueler> readCSV(String file){
            TreeSet<Schueler> ts = new TreeSet<>();
            String tmp;

            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                br.readLine();

                while ((tmp = br.readLine()) != null) {
                    ts.add(parseLineSplit(tmp));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ts;
        }


    public void writeCSV(TreeSet<Schueler> ts){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            for (Schueler elem:ts) {
                bw.write(elem.getId());
                bw.write(elem.getKatnr());
                bw.write(elem.getZuname());
                bw.write(elem.getVorname());
                bw.write(elem.getGeschlecht());
                bw.write(elem.getReligion());
                bw.write(elem.getGebdatum());
                bw.write(elem.getStr());
                bw.write(elem.getPlz());
                bw.write(elem.getOrt());
                bw.write(elem.getSchulformkurzbez());
                bw.write(elem.getSchulformkurzbez());
                bw.write(elem.getKv_zuname());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

