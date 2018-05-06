package hu.iit.uni.miskolc;

import hu.iit.uni.miskolc.model.GasStation;
import hu.iit.uni.miskolc.model.Trip;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Calculating {
    public static int minimalTotalCost(Trip trip){
        int sum = 0;
        long actualDistance = 0;
        long actualFuel= trip.getFuelCapacity();
        trip.getGasStations().sort(Comparator.comparing(GasStation::getPlace));
        while (actualDistance<(trip.getTripLength()-actualFuel)){
            List<GasStation> filtered= new ArrayList<>();

            for (GasStation item:trip.getGasStations()) {
                if((item.getPlace() - actualDistance > 0) && (item.getPlace() - actualDistance - actualFuel <= 0)){
                    filtered.add(item);
                }
            }
            filtered.sort(Comparator.comparing(GasStation::getFuelPrice));
            sum += filtered.get(0).getFuelPrice() * (filtered.get(0).getPlace() - actualDistance);
            actualDistance = filtered.get(0).getPlace();
        }
        return sum;
    }
}
