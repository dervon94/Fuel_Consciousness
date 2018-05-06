package hu.iit.uni.miskolc;

import hu.iit.uni.miskolc.exceptions.WrongInputException;
import hu.iit.uni.miskolc.model.Trip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Util {
    public static Trip readInput(String fileName)throws IOException,WrongInputException {
        long tripLength,fuelCapacity,numOfStations;
        Trip trip=null;
        try {
            BufferedReader reader;
            reader = new BufferedReader(new FileReader(fileName));
            String[] lineElements;
            tripLength=Long.parseLong(reader.readLine());
            fuelCapacity=Long.parseLong(reader.readLine());
            numOfStations=Long.parseLong(reader.readLine());
            trip=new Trip(tripLength,fuelCapacity,numOfStations);
            long i=1;
            while(i<=numOfStations) {
                lineElements= reader.readLine().split(" ");
                System.out.println(lineElements[0]+" "+lineElements[1]);
                trip.addGasStation(Long.parseLong(lineElements[0]),Long.parseLong(lineElements[1]));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trip;
    }
}
