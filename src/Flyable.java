public class Flyable {
//String name;
//int wheels;

    public void fly(){
        System.out.println("This is a fly method from Flyable Parent class");
    }
    void wings(){
        System.out.println("This is a wings method from Flyable Parent class");
    }
    void engines(){
        System.out.println("This is a engines method from Flyable Parent class");
    }
    void speed(){
        System.out.println("This is a speed method from Flyable Parent class");
    }
    void seaters(){
        System.out.println("This is a seaters method from Flyable Parent class");
    }

    public static void main(String[] args) {
//        Flyable fly1 = new Flyable();
//       fly1.fly();
//        fly1.engines();
//            fly1.seaters();
//            fly1.wings();
//            fly1.speed();
       // fly1.chop(); we cannot access child class methods in parent class
    }
}