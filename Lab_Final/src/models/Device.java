package models;

public class Device {
    public String deviceId;
    public String type;
    public boolean status;
    public double energyConsumed;

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public boolean getStatus() {
        return status;
    }

    public double calculateEnergySaving() {
        return energyConsumed * 0.1;
    }
}
