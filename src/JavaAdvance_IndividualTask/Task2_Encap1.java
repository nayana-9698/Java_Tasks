package JavaAdvance_IndividualTask;

public class Task2_Encap1 {
    private String name;
    private int age;

    //we are getting the value of age
    public int getAge(){
        return age;
    }

    //we are setting the value for age
    public int setAge(int age){
        this.age=age;
        return age;
    }

    //we are getting the value of name
    public String getName(){
        return name;
    }

    //we are setting the value for name
    public String setName(String name){
        this.name=name;
        return name;
    }

    public static void main(String[] args) {
        Task2_Encap1 en1=new Task2_Encap1();
        en1.setAge(25);
        en1.setName("Nayana");
        System.out.println("The name is: " + en1.name + " And the age is: " + en1.age );
    }
}
