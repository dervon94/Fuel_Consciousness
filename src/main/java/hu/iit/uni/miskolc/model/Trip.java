package hu.iit.uni.miskolc.model;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    private long tripLength;

    public List<GasStation> getGasStations() {
        return GasStations;
    }

    public Trip(long tripLength, long fuelCapacity, long numOfStations, List<GasStation> gasStations) {
        this.tripLength = tripLength;
        this.fuelCapacity = fuelCapacity;
        this.numOfStations = numOfStations;
        GasStations = gasStations;
    }
    public Trip(long tripLength, long fuelCapacity, long numOfStations) {
        this.tripLength = tripLength;
        this.fuelCapacity = fuelCapacity;
        this.numOfStations = numOfStations;
    }

    private long fuelCapacity;
    private long numOfStations;
    private List<GasStation> GasStations=new ArrayList<>();

    public long getTripLength() {
        return tripLength;
    }

    public void setTripLength(long tripLength) {
        this.tripLength = tripLength;
    }

    public long getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(long fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public long getNumOfStations() {
        return numOfStations;
    }
    public void addGasStation(Long location, Long fuelPrice){
        GasStations.add(new GasStation(location,fuelPrice));

    }
}
