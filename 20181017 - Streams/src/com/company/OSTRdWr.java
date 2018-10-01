package com.company;

import java.io.*;
import java.util.TreeSet;

public class OSTRdWr {

    private String file;

    public OSTRdWr(String file) {
        this.file = file;
    }

    public OSTRdWr() {

    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public TreeSet<Schueler> readOST(String file){
        TreeSet<Schueler> ts = new TreeSet<>();

        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
            ts = (TreeSet<Schueler>)ois.readObject();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ts;

    }

    public void writeOST(TreeSet<Schueler> ts){

        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
            oos.writeObject(ts);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
