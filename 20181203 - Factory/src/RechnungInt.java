import java.util.Scanner;

final public class RechnungInt implements Rechnung {

    int value1=0;
    int value2=0;
    int ergAdd=0;
    int ergSub=0;
    int ergMul=0;
    int ergDiv=0;
    int ergAvg=0;
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
        System.out.println("Zahl 1 eingeben (Ganzzahl): ");
        value1=sc.nextInt();
        System.out.println("Zahl 2 eigeben (Ganzzahl): ");
        value2=sc.nextInt();
    }
}
