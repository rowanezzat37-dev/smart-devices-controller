public class SmartTV extends Device{
    private String displayResolution;
    SmartTV(String name,double price, String displayResolution) {
        super(name, price);
        setDisplayResolution(displayResolution);
    }
    void setDisplayResolution(String resolution){
        if (resolution.length()>1){
            this.displayResolution=resolution;
        }else {
            this.displayResolution="unknown";
        }
    }
    String getDisplayResolution(){
        return displayResolution;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Display Resolution : "+this.getDisplayResolution());
        System.out.println("==========================");
    }
}
