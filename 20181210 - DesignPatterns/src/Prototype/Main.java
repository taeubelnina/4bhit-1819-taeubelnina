package Prototype;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        try {
            Properties props = new Properties();
            props.load(new FileReader(args[0]));
            //get class name from given properties object
            String clsName = props.getProperty("ost"); //"prototype.OstRdWr";
            Class<?> cls = Class.forName(clsName);
            // get default constructor object
            Constructor<?> cst = cls.getConstructor();
            //invoke default constructor
            Prototype pt = (Prototype) cst.newInstance();
            //...
            ReaderWriter ostRdr = (ReaderWriter) pt.clone();
            System.out.println(ostRdr.getClass().getCanonicalName());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
