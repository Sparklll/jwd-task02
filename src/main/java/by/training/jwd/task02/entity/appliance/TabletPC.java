package by.training.jwd.task02.entity.appliance;

import java.util.Objects;

public class TabletPC implements Appliance {
    private static final long serialVersionUID = 2507723575669508310L;

    public enum TabletColor {RED, GREEN, BLUE};

    private double batteryCapacity;
    private double displayInches;
    private double memoryROM;
    private double flashMemoryCapacity;
    private TabletColor color;

    public TabletPC() {
    }

    public TabletPC(double batteryCapacity,
                    double displayInches,
                    double memoryROM,
                    double flashMemoryCapacity,
                    TabletColor color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(double memoryROM) {
        this.memoryROM = memoryROM;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public TabletColor getColor() {
        return color;
    }

    public void setColor(TabletColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC that = (TabletPC) o;
        return Double.compare(that.batteryCapacity, batteryCapacity) == 0
                && Double.compare(that.displayInches, displayInches) == 0
                && Double.compare(that.memoryROM, memoryROM) == 0
                && Double.compare(that.flashMemoryCapacity, flashMemoryCapacity) == 0
                && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }
}
