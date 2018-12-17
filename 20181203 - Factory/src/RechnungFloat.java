import java.util.Scanner;

public class RechnungFloat implements Rechnung{

    double value1=0;
    double value2=0;
    double ergAdd=0;
    double ergSub=0;
    double ergMul=0;
    double ergDiv=0;
    double ergAvg=0;
    Scanner sc = new Scanner(System.in);

    @Override
    public void berechnung() {
        getValue();
        ergAdd=value1+value2;
        ergSub=value1-value2;
        ergMul=value1*value2;
        ergDiv=value1/value2;
        ergAvg=(ergAdd+ergSub+ergDiv+ergMul)/4;
        System.out.println("ErgAdd= "+ergAdd+"\nErgSub= "+ ergSub+"\nErgMul= "+ ergMul+ "\nErgDiv= "+ ergDiv+"\n\nErgAvg= "+ergAvg+"\n\n");
    }

    public void getValue(){
        System.out.println("Zahl 1 eingeben (Gleitkomma): ");
        value1=sc.nextDouble();
        System.out.println("Zahl 2 eigeben (Gleitkomma): ");
        value2=sc.nextDouble();
    }
}
