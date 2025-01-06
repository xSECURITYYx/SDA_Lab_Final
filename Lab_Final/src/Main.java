import models.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        device.deviceId = "D001";
        device.type = "AC";
        device.energyConsumed = 150.5;
        device.turnOn();

        Schedule schedule = new Schedule();
        schedule.scheduleId = "S001";
        schedule.deviceId = device.deviceId;
        schedule.startTime = new Date(System.currentTimeMillis() - 1000); 
        schedule.endTime = new Date(System.currentTimeMillis() + 10000); 

        System.out.println("Schedule is active: " + schedule.isActive(new Date()));

        EnergyUsage usage = new EnergyUsage();
        usage.logUsage(device);
        System.out.println("Total Energy Usage: " + usage.calculateTotalUsage());

        Database db = new Database();
        db.save(device);
        db.save(schedule);
    }
}
