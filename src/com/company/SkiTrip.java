package com.company;

public class SkiTrip extends Trip {
    private static int travelTime = 12;
    private static String country = "Sweden";
    private static int duration = 7;
    private static String transportStyle = "Car";


    public String toString() {
        return ("\nDestination = " + country + "\nDuration = " + duration +"days" + "\nTransport style = " + transportStyle + "\nTraveltime = " + travelTime + "hours");
    }

}
