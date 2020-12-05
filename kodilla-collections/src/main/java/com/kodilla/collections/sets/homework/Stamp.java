package com.kodilla.collections.sets.homework;


import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimensions;
    private boolean stampStamped;

    public Stamp(String stampName, String stampDimensions, boolean stampStamped) {
        this.stampName = stampName;
        this.stampDimensions = stampDimensions;
        this.stampStamped = stampStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampDimensions() {
        return stampDimensions;
    }

    public boolean isStampStamped() {
        return stampStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stamp.stampName, stampName) &&
                Objects.equals(stamp.stampDimensions, stampDimensions) &&
                Objects.equals(stamp.stampStamped, stampStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampDimensions, stampStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampDimensions='" + stampDimensions + '\'' +
                ", stampStamped=" + stampStamped +
                '}';
    }
}