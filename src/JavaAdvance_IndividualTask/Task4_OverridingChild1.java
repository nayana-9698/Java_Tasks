package JavaAdvance_IndividualTask;

public class Task4_OverridingChild1 extends Task4_OverridingParent1 {

    @Override
    public void address(){
        System.out.println("State-Karnataka,Country-India");
    }

    public static void main(String[] args) {
        Task4_OverridingChild1 addr = new Task4_OverridingChild1();
        addr.address();
    }

}
