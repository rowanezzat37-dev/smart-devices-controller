public class Main {
    public static void main (String[] args){
        Smartphone phone = new Smartphone("IPhone",35000,"IOS");
        Tablet tablet = new Tablet("Samsung",10000,"680x1080");
        Smartwatch watch = new Smartwatch("Apple watch",15000,true);
        SmartTV TV = new SmartTV("LG", 20000,"4k");
        phone.print();
        tablet.print();
        watch.print();
        TV.print();
        System.out.println("Number of Devices: "+Device.getCounter());
    }
}