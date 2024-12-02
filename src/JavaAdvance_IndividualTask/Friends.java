package JavaAdvance_IndividualTask;

public class Friends {

    public void friends(String frnd1, String frnd2){
        String group1=frnd1+frnd2;
        System.out.println("Group 1 friends are : " + group1);
    }

    public void friends(int age1, int age2){//overloading friends method with different variable type
        int ageOne=age1;
        int ageTwo=age2;
        System.out.println("Age of the friend one is : " + ageOne);
        System.out.println("Age of the friend two is : " + ageTwo);
    }

    public void friends(String frnd1, String frnd2, String frnd3){//Overloading friends method with different number of variables
        String group2 = frnd1+frnd2+frnd3;
        System.out.println("Group 2 friends are : " + group2);
    }

    public static void main(String[] args) {
        Friends frnd = new Friends();
        frnd.friends(25,30);
        frnd.friends("Nayana "," Siri");
        frnd.friends("Ranju "," Megha "," Anu ");
    }

}
