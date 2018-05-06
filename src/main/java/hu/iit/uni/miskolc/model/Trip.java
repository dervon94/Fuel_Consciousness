package hu.iit.uni.miskolc.model;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    private int tripLength;
    private int fuelCapacity;
    private int numOfStations;
    private List<GasStation> GasStations=new ArrayList<>();

    public List<GasStation> getGasStations() {
        return GasStations;
    }

    public Trip(int tripLength, int fuelCapacity, int numOfStations, List<GasStation> gasStations) {
        this.tripLength = tripLength;
        this.fuelCapacity = fuelCapacity;
        this.numOfStations = numOfStations;
        GasStations = gasStations;
    }
    public Trip(int tripLength, int fuelCapacity, int numOfStations) {
        this.tripLength = tripLength;
        this.fuelCapacity = fuelCapacity;
        this.numOfStations = numOfStations;
    }



    public int getTripLength() {
        return tripLength;
    }

    public void setTripLength(int tripLength) {
        this.tripLength = tripLength;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumOfStations() {
        return numOfStations;
    }
    public void addGasStation(int location, int fuelPrice){
        GasStations.add(new GasStation(location,fuelPrice));

    }
}
