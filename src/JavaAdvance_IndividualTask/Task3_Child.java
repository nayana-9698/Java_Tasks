package JavaAdvance_IndividualTask;
public class Task3_Child extends Task3_ParentFather {
//public class Task3_Child extends Task3_ParentFather extends Task3_ParentMother {

    public void assets(){
        System.out.println("Son has 1 car as asset");
    }

    public static void main(String[] args) {
        Task3_Child child = new Task3_Child();
        child.assets(); // asset of the child or child class
        child.father(); //asset of the father or base class 1
        //child.mother(); //asset of the mother or base class 2
    }
}
