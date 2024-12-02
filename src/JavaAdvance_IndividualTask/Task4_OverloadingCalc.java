package JavaAdvance_IndividualTask;

public class Task4_OverloadingCalc {

    public void add(int a, int b){
        int c = a+b;
        System.out.println("Addition of a and b is: " + c);
    }

    public void add(int a, int b,int c){ //overloading method with different number of variables
        int result = a+b+c;
        System.out.println("Addition of a,b and c is: " + result);
    }

    public void add(String a, String b,String c){//overloading method with different type of variables
        String result = a+b+c;
        System.out.println("Addition of a,b and c is: " + result);
    }

    public static void main(String[] args) {
        Task4_OverloadingCalc calc = new Task4_OverloadingCalc();
        calc.add(10,20);
        calc.add(10,20,30);
        calc.add("Nayana-","Siri-","Bruno");

    }
}
