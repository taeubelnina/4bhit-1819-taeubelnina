import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

final public class Konfig {
    public static final String filename = "";

    private static Konfig instance = new Konfig();

    Konfig() {
        System.out.println("Konfig erzeugt");
    }

    public static Konfig getInstance() {
        System.out.println("Konfig::getInstance()");
        return instance;
    }

    public void setValue(String key, String value) throws IOException {
        Properties p = new Properties();

        try(FileInputStream fis = new FileInputStream(new File(filename))){
            p.load(fis);
        }

        p.setProperty(key, value);
    }

    public String getValue(String key) throws IOException {
        Properties p = new Properties();
        String tmp;

        try(FileInputStream fis = new FileInputStream(new File(filename))){
            tmp=p.getProperty(key);
        }

        return tmp;

    }

    public static void main(String[] args) {
        Konfig.getInstance();
    }
}
