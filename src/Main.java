public class Main {
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
