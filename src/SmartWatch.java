public class SmartWatch implements Controllable{
    private boolean turnedOn= false;
    private int battery=100;
    SmartWatch(){
        this.battery = (int) (Math.random()*100+1);
    }
    public void turnOn() {
        if (!turnedOn && battery >=10){
            turnedOn = true;
            System.out.println("Smart Watch is Turned on Successfully");
        } else if (!turnedOn && battery <10) {
            throw new LowBattery("Can't be Turned On, Battery is Less Than 10%");
        } else {
            throw new InvalidStatus("Smart Watch is Already Turned On");
        }
    }
    public void turnOff(){
        if (turnedOn){
            turnedOn = false;
            System.out.println("Smart Watch is Turned off Successfully");
        } else {
            throw new InvalidStatus("Smart Watch is Already Turned Off");
        }
    }
    public String getStatus(){
        return turnedOn? "Smart Watch is Turned On, Battery: "+ this.battery : "Smart Watch is Turned Off";
    }

}
class LowBattery extends RuntimeException{
    public LowBattery (String message){
        super(message);
    }
}
