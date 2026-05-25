public class SmartPhone implements Controllable{
    private boolean turnedOn= false;
    public void turnOn() {
        if (!turnedOn){
            turnedOn = true;
            System.out.println("Smart Phone is Turned On Successfully");
        } else {
            throw new InvalidStatus("Smart Phone is Already Turned On");
        }
    }
    public void turnOff(){
        if (turnedOn){
            turnedOn = false;
            System.out.println("Smart Phone is Turned Off Successfully");
        } else {
            throw new InvalidStatus("Smart Phone is Already Turned Off");
        }
    }
    public String getStatus(){
        return turnedOn? "Smart Phone is Turned On" : "Smart Phone is Turned Off";
    }
}
class InvalidStatus extends RuntimeException{
    public InvalidStatus(String message){
        super(message);
    }
}
