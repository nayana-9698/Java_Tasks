public class Chopper extends Flyable {

    public void chop(){
        System.out.println("This is a chopper class from Child class of Flyable parent class");
    }

    public static void main(String[] args) {
        Chopper chop1 = new Chopper();
        {
            chop1.fly();
            chop1.chop();
        }
    }

}
