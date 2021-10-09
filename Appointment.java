public class Appointment {
    private int physician_ID;
    private int patient_ID;
    private int availability_ID;
    private String reason;

    public Appointment() {
        physician_ID = 0;
        patient_ID = 0;
        availability_ID = 0;
        reason = "";
    }

    public Appointment(int newPhysicianID, int newPatientID, int newTime, String newReason) {
        physician_ID = newPhysicianID;
        patient_ID = newPatientID;
        availability_ID = newTime;
        reason = newReason;
    }

    public int getPhysicianID() {
        return physician_ID;
    }

    public int getPatientID( ) {
        return patient_ID;
    }

    public void setReason(String newReason) {
        reason = newReason;
    }

    public String getReason() {
        return reason;
    }

    public int getAvailability() {
        return availability_ID;
    }
}
