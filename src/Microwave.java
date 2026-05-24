public class Microwave implements Controllable{
    private boolean turnedOn = false;
    private boolean openDoor = false;
    public void turnOn(){
        if (!turnedOn && !openDoor){
            turnedOn = true;
            System.out.println("Microwave is Turned On Successfully");
        } else if (!turnedOn && openDoor){
            throw new OpenDoor("Can't be Turned On, Door is Opened");
        } else {
            throw new InvalidStatus("Microwave is Already Turned On");
        }
    }
    public void turnOff(){
        if (turnedOn){
            turnedOn = false;
            System.out.println("Microwave is Turned Off Successfully");
        } else {
            throw new InvalidStatus("Microwave is Already Turned Off");
        }
    }
    public String getStatus(){
        return turnedOn? "Microwave is Turned On with Door is "+ (openDoor? "Opened" :"Closed" ) : "Microwave is Turned Off";
    }
}
class OpenDoor extends RuntimeException{
    public OpenDoor(String message){
        super(message);
    }
}
