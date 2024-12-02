package JavaAdvance_IndividualTask;

public class Task2_HospitalDetails {

    private String patientName;
    private int patientID;
    private String patientDecease;

    public String getPatientName(){
        return patientName;
    }

    public String setPatientName(String patientName){
        this.patientName=patientName;
        return patientName;
    }

    public int getPatientID(){
        return patientID;
    }
    public int setPatientID(int patientID){
        this.patientID=patientID;
        return patientID;
    }

    public String getPatientDecease(){
        return patientDecease;
    }

    public String setPatientDecease(String patientDecease){
        this.patientDecease=patientDecease;
        return patientDecease;
    }

    public static void main(String[] args) {
        Task2_HospitalDetails hosp = new Task2_HospitalDetails();

        hosp.setPatientName("Nayana");
        hosp.setPatientID(9698);
        hosp.setPatientDecease( " Leg Fracture ");

        System.out.println("Patient name is: " + hosp.patientName);
        System.out.println("Patient ID is: " + hosp.patientID);
        System.out.println("Patient decease is: " +hosp.patientDecease);
    }
}
