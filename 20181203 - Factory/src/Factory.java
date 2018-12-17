public class Factory {

    private static Factory instance=new Factory();

    private Factory() {
        System.out.println("RechnungFactory erstellt!");
    }

    public static Factory getInstance(){
        return instance;
    }


    public Rechnung getRechnung(String rechnungType){
        if(rechnungType == null){
            return null;
        }
        if(rechnungType.equalsIgnoreCase("GANZZAHL")){
            return new RechnungInt();

        } else if(rechnungType.equalsIgnoreCase("GLEITKOMMA")){
            return new RechnungFloat();

        }
        return null;
    }
}
