public class Patient {
    private int patient_ID;

    public Patient() {
        super();
        patient_ID = 0;
    }

    public Patient(int newID) {
        patient_ID = newID;
    }

    public void setPatientID(int newID) {
        patient_ID = newID;
    }

    public int getPatientID() {
        return patient_ID;
    }
}
