public class Device {
    protected String name;
    protected double price;
    protected static int counter=0;
    Device(){
        counter++;
    }
    Device(String name,double price){
        setName(name);
        setPrice(price);
        counter++;
    }
    void setName(String name){
        if (name.length()>1){
            this.name=name;
        }else {
            this.name="unknown";
        }
    }
    void setPrice(double price){
        if (price>0){
            this.price=price;
        }else {
            this.price=0;
        }
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
    static int getCounter(){
        return counter;
    }
    void print(){
        System.out.println("==========================");
        System.out.println("Model Name: "+ this.getName());
        System.out.println("Retail Price: "+ this.getPrice());
    }

}
