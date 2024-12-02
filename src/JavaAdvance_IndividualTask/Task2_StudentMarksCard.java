package JavaAdvance_IndividualTask;

public class Task2_StudentMarksCard {

    private String studentName;
    private String sub1,sub2;
    private int mark1,mark2;


    public String getStudentName(){
        return studentName;
    }
    public String setStudentName(String studentName){
        this.studentName=studentName;
        return studentName;
    }


    public String getSub1(){
        return sub1;
    }
    public String setSub1(String sub1){
        this.sub1=sub1;
        return sub1;
    }

    public String getSub2(){
        return sub2;
    }
    public String setSub2(String sub2){
        this.sub2=sub2;
        return sub2;
    }

    public int getMarks1(){
        return mark1;
    }
    public int setMarks1(int mark1){
        this.mark1=mark1;
        return mark1;
    }

    public int getMarks2(){
        return mark2;
    }
    public int setMarks2(int mark2){
        this.mark2=mark2;
        return mark2;
    }

    public static void main(String[] args) {
        Task2_StudentMarksCard student = new Task2_StudentMarksCard();

        student.setStudentName("Nayana");
        student.setSub1("English");
        student.setSub2("Computer Science");
        student.setMarks1(85);
        student.setMarks2(90);

        System.out.println("Student name is: " + student.studentName);
        System.out.println("Student opted sub1 as " + student.sub1);
        System.out.println("Student opted sub2 as " + student.sub2);
        System.out.println("Student scored in sub1 " + student.mark1);
        System.out.println("Student scored in sub2 " + student.mark2);

    }

}
