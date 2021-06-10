public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself

    public String getVersionNumber () {
        return this.versionNumber;
    }

    public void setVersionNumber (String versionNum) {
        versionNumber = versionNum;
    }

    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public void setBatteryPercentage (int batteryPercent) {
        batteryPercentage = batteryPercent;
    }

    public String getCarrier () {
        return this.carrier;
    }

    public void setCarrier (String phoneCarrier) {
        carrier = phoneCarrier;
    }

    public String getRingTone () {
        return this.ringTone;
    }

    public void setRingTone (String phoneRingTone) {
        ringTone = phoneRingTone;
    }
}

