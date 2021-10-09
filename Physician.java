public class Physician extends Person{
    private int physician_ID;

    public Physician() {
        super();
        physician_ID = 0;
    }

    public Physician(int newID) {
        super();
        physician_ID = newID;
    }

    public void setPhysicianID(int newID) {
        physician_ID = newID;
    }

    public int getPhysicianID() {
        return physician_ID;
    }

}
