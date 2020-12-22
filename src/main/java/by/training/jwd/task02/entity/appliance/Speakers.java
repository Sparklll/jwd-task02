package by.training.jwd.task02.entity.appliance;

import java.util.Objects;

public class Speakers implements Appliance {
    private static final long serialVersionUID = 6405710501641760566L;

    private double powerConsumption;
    private double numberOfSpeakers;
    private double frequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(double powerConsumption,
                    double numberOfSpeakers,
                    double frequencyRange,
                    double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(double frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers that = (Speakers) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.numberOfSpeakers, numberOfSpeakers) == 0
                && Double.compare(that.frequencyRange, frequencyRange) == 0
                && Double.compare(that.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
