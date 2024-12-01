package groupTask;

public class Chopper extends Flyable {

    public void chop(){
        System.out.println("This is a chopper class from Child class of groupTask.Flyable parent class");
    }

    public static void main(String[] args) {
        Chopper chop1 = new Chopper();
        {

            chop1.chop(); //chopper class

            chop1.fly(); // parent class groupTask.Flyable
            chop1.engines();
            chop1.seaters();
            chop1.wings();
            chop1.speed();
        }
    }
}
