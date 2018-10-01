package com.company;

import java.io.*;
import java.util.TreeSet;

public class DSTRdWr {

    private String file;

    public DSTRdWr(String file) {
        this.file = file;
    }

    public DSTRdWr() {

    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }


    public TreeSet<Schueler> readDST (String file) {
        TreeSet<Schueler> ts = new TreeSet<Schueler>();
        Schueler tmp;
        boolean eof=false;

        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            while(!eof) {
                int id = dis.readInt();
                int katnr = dis.readInt();
                String zuname = dis.readUTF();
                String vorname = dis.readUTF();
                String geschlecht = dis.readUTF();
                String religion = dis.readUTF();
                String gebdatum = dis.readUTF();
                String str = dis.readUTF();
                int plz = dis.readInt();
                String ort = dis.readUTF();
                String schulformkurzbez = dis.readUTF();
                String kla_bezeichnung = dis.readUTF();
                String kv_zuname = dis.readUTF();

                tmp = new Schueler(id, katnr, zuname, vorname, geschlecht, religion, gebdatum, str, plz, ort, schulformkurzbez, kla_bezeichnung, kv_zuname);
                ts.add(tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            eof=true;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ts;
    }


    public void writeDST(TreeSet<Schueler> ts){

        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){

            for (Schueler elem:ts) {
               dos.writeInt(elem.getId());
               dos.writeInt(elem.getKatnr());
               dos.writeUTF(elem.getZuname());
               dos.writeUTF(elem.getVorname());
               dos.writeUTF(elem.getGeschlecht());
               dos.writeUTF(elem.getReligion());
               dos.writeUTF(elem.getGebdatum());
               dos.writeUTF(elem.getStr());
               dos.writeInt(elem.getPlz());
               dos.writeUTF(elem.getOrt());
               dos.writeUTF(elem.getSchulformkurzbez());
               dos.writeUTF(elem.getKla_bezeichnung());
               dos.writeUTF(elem.getKv_zuname());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
