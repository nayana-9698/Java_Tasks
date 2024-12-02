package groupTask;

public class Task1_FlyableParent {

    public void fly(){
        System.out.println("This is a fly method from Parent class");
    }
    void wings(){
        System.out.println("This is a wings method from Parent class");
    }
    void engines(){
        System.out.println("This is a engines method from Parent class");
    }
    void speed(){
        System.out.println("This is a speed method from Parent class");
    }
    void seaters(){
        System.out.println("This is a seaters method from Parent class");
    }

    public static void main(String[] args) {

//        groupTask.Flyable fly1 = new groupTask.Flyable();
//       fly1.fly();
//        fly1.engines();
//            fly1.seaters();
//            fly1.wings();
//            fly1.speed();
        // fly1.chop(); we cannot access child class methods in parent class
    }
}
