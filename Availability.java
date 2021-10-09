import java.util.Date;
public class Availability {
    private int availability_ID;  // Primary Key
    private Date start_time;  // Start time of availability: query for this
    private Date end_time;    // End time of availability: start_time of another avaiability should not overlap this

    public Availability(int newAvailabilityId){
      availability_ID = newAvailabilityId;
    }

    public Availability(int newAvailabilityId, Date startTime, Date endTime){
      availability_ID = newAvailabilityId;
      start_time = startTime;
      end_time = endTime;
    }

    // Sets time frame of the availability
    public void setTimeFrame(Date startTime, Date endTime){
      setStartTime(startTime);
      setEndTime(endTime);
    }
    
    public void setStartTime(Date startTime){
      start_time = startTime;
    }

    public void setEndTime(Date endTime){
      end_time = endTime;
    }

    // GET Methods
    public Date getStartTime(){
      return start_time;
    }

    public Date getEndTime(){
      return end_time;
    }
}
