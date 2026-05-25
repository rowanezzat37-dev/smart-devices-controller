public class Smartwatch extends Device{
    private boolean hasHealthSensors;
    Smartwatch(String name,double price, boolean HS) {
        super(name, price);
        setHasHealthSensors(HS);
    }
    void setHasHealthSensors(boolean HS){
        this.hasHealthSensors=HS;
    }
    boolean getHasHealthSensors(){
        return this.hasHealthSensors;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Has Health Sensors: "+(this.getHasHealthSensors()? "Yes":"No"));
        System.out.println("==========================");
    }
}
