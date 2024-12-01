public class Aeroplane extends Flyable{

    public void aero(){
        System.out.println("This is an aeroplane class from child class");
    }

    public static void main(String[] args) {
        Aeroplane aero1 =new Aeroplane();

        aero1.aero();
        aero1.fly();
    }
}
