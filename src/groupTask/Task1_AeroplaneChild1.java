package groupTask;

public class Task1_AeroplaneChild1 extends Task1_FlyableParent {

    public void aero(){
        System.out.println("This is a aeroplane child class ");
    }

    public static void main(String[] args) {
        Task1_AeroplaneChild1 aero1 = new Task1_AeroplaneChild1();
        {

            aero1.aero(); //chopper class

            aero1.fly(); // parent class Flyable
            aero1.engines();
            aero1.seaters();
            aero1.wings();
            aero1.speed();
        }
    }
}
