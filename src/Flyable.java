public class Flyable {
//String name;
//int wheels;

    public void fly(){
        System.out.println("This is a flyable class from Parent class");
    }
    public static void main(String[] args) {
        Flyable fly1 = new Flyable();
        fly1.fly();
       // fly1.chop(); we cannot access child class methods in parent class
    }
}
