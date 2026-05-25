public class Tablet extends Device{
    private String screenDimensions;
    Tablet(String name, double price,String SD){
        super(name,price);
        setScreenDimensions(SD);
    }
    void setScreenDimensions(String screenDimensions){
        if(screenDimensions.length()>1){
            this.screenDimensions=screenDimensions;
        }else {
            this.screenDimensions="unknown";
        }
    }
    String getScreenDimensions(){
        return screenDimensions;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Screen Dimensions: "+this.getScreenDimensions());
        System.out.println("==========================");
    }
}
