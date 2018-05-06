package hu.iit.uni.miskolc;

import hu.iit.uni.miskolc.exceptions.NoStationsException;
import hu.iit.uni.miskolc.model.Trip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Util {
    /**
     * Reads the given file, and returns the list of points in that file
     * @param fileName name of the file, or path to the file
     * @return List of points
     * @throws IOException when no file found
     * @throws NoStationsException when the file had no points
     */
    public static Trip readInputFromFile(String fileName)throws IOException,NoStationsException {
            int tripLength,fuelCapacity,numOfStations;
            Trip trip=null;
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(fileName));
            String[] temp;
            tripLength=Integer.parseInt(reader.readLine());
            fuelCapacity=Integer.parseInt(reader.readLine());
            numOfStations=Integer.parseInt(reader.readLine());
            trip=new Trip(tripLength,fuelCapacity,numOfStations);
        for (int i = 1; i <= numOfStations; i++) {
            temp = reader.readLine().split(" ");
            trip.addGasStation(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
        }
        if(trip.getGasStations().size()==0)
            throw  new NoStationsException("No Stations in file!");
        return trip;
    }
}
