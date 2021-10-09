import java.util.DateTime;
public class Availability {
    private int availability_ID;  // Primary Key
    private DateTime start_time;  // Start time of availability: query for this
    private DateTime end_time;    // End time of availability: start_time of another avaiability should not overlap this

    public Availability(int newAvailabilityId){
      availability_ID = newAvailabilityId;
    }

    public Availability(int newAvailabilityId, DateTime startTime, DateTime endTime){
      availability_ID = newAvailabilityId;
      start_time = startTime;
      end_time = endTime;
    }

    // Sets time frame of the availability
    public void setTimeFrame(DateTime startTime, DateTime endTime){
      setStartTime(startTime);
      setEndTime(endTime);
    }
    
    public void setStartTime(DateTime startTime){
      start_time = startTime;
    }

    public void setEndTime(DateTime endTime){
      end_time = endTime;
    }

    // GET Methods
    public DateTime getStartTime(){
      return start_time;
    }

    public DateTime getEndTime(){
      return end_time;
    }
}
