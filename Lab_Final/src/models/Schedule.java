package models;

import java.util.Date;

public class Schedule {
    public String scheduleId;
    public String deviceId;
    public Date startTime;
    public Date endTime;

    public boolean isActive(Date currentTime) {
        return currentTime.after(startTime) && currentTime.before(endTime);
    }
}
