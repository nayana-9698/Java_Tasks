package JavaAdvance_IndividualTask;

public class Task4_OverridingChild2 extends Task4_OverridingParent2 {

    @Override
    public void studentMarks(){
        System.out.println("Student has scored 50 in sem3");
    }

    public static void main(String[] args) {
        Task4_OverridingChild2 student = new Task4_OverridingChild2();
        student.studentMarks();
    }
}
