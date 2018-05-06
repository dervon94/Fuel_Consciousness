package hu.iit.uni.miskolc.model;

public class GasStation {
    private long place;
    private long fuelPrice;

    public GasStation(Long place, Long fuelPrice) {
        this.place = place;
        this.fuelPrice = fuelPrice;
    }

    public long getPlace() {
        return place;
    }

    public void setPlace(long place) {
        this.place = place;
    }

    public long getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(long fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    @Override
    public String toString() {
        return "\n GasStation {" +
                "place=" + place +
                ", fuelPrice=" + fuelPrice +
                "} ";
    }
}
