public class Main {
<<<<<<< HEAD
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
=======
    public static void main(String[] args) {
        Controllable [] units = new Controllable[3];
        units[0] = new SmartPhone();
        units[1] = new SmartWatch();
        units[2] = new Microwave();

        System.out.println("ID: 2401256771  Name: Rowan Ezzat Mohamed\n");
        for (Controllable unit : units) {
            try {
                unit.turnOn();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();

        for (Controllable unit : units) {
            try {
                System.out.println(unit.getStatus());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();

        for (Controllable unit : units) {
            try {
                unit.turnOn();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();

        for (Controllable unit : units) {
            try {
                unit.turnOff();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();

        for (Controllable unit : units) {
            try {
                System.out.println(unit.getStatus());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();

        for (Controllable unit : units) {
            try {
                unit.turnOff();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
>>>>>>> 68fdff119a47191bdc3de54883a70ca2cbb02733
