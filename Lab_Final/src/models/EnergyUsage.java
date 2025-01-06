package models;

import java.util.Date;

public class EnergyUsage {
    public String usageId;
    public String deviceId;
    public double energyConsumed;
    public Date timestamp;

    public void logUsage(Device device) {
        this.deviceId = device.deviceId;
        this.energyConsumed = device.energyConsumed;
        this.timestamp = new Date();
    }

    public double calculateTotalUsage() {
        return energyConsumed;
    }
}
