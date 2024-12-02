package JavaAdvance_IndividualTask;

public class Task4_OverridingChild3 extends Task4_OverridingParent3{

    @Override
    public void faculty(){
        System.out.println("Total number of faculty count in year 2024 is 25");
    }

    public static void main(String[] args) {
        Task4_OverridingChild3 fac = new Task4_OverridingChild3();
        fac.faculty();
    }
}
