public class Smartphone extends Device{
    private String os;
    Smartphone(String name,double price, String os){
        super(name,price);
        setOs(os);
    }
    void setOs(String os){
        if (os.length()>1){
            this.os=os;
        }else {
            this.os="unknown";
        }
    }
    String getOs(){
        return this.os;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Operating System: "+this.getOs());
        System.out.println("==========================");
    }
}
