package com.company;

public class BeachTrip extends Trip {
    private static int travelTime = 6;
    private static String country = "Spain";
    private static int duration = 9;
    private static String transportStyle = "Plane";

    public String toString() {
        return ("\nDestination = " + country + "\nDuration = " + duration +"days" + "\nTransport style = " + transportStyle + "\nTraveltime = " + travelTime + "hours");
    }
}
