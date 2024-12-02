package groupTask;

public class Task1_ChopperChild2 extends Task1_FlyableParent{

    public void chop(){
        System.out.println("This is a chopper child class ");
    }

    public static void main(String[] args) {
        Task1_ChopperChild2 chop1 = new Task1_ChopperChild2();
        {
            chop1.chop(); //chopper class

            chop1.fly(); // parent class Flyable
            chop1.engines();
            chop1.seaters();
            chop1.wings();
            chop1.speed();
        }
    }

}
