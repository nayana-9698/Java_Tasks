public class Aeroplane extends Flyable{

    public void aero(){
        System.out.println("This is an aeroplane class from child class");
    }

    public static void main(String[] args) {
        Aeroplane aero1 =new Aeroplane();

        aero1.aero(); //Sub class 2

        aero1.fly(); //Parent class Flyable
        aero1.engines();
        aero1.seaters();
        aero1.speed();
        aero1.wings();
    }
}
