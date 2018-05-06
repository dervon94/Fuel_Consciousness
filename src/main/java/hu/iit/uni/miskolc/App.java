package hu.iit.uni.miskolc;

import hu.iit.uni.miskolc.exceptions.NoStationsException;
import hu.iit.uni.miskolc.model.Trip;

import java.io.*;

import static hu.iit.uni.miskolc.Calculating.minimalTotalCost;
import static hu.iit.uni.miskolc.Util.readInputFromFile;


/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Trip trip=null;
        try {
            trip=readInputFromFile("resources/E1.in");
        } catch (IOException e) {
            System.out.println("Nem taláható input fájl!");
        } catch (NoStationsException e) {
            System.out.println("Hibás input fájl!");
        }
        System.out.println(trip.getGasStations());
        System.out.println("Minimal total cost="+ minimalTotalCost(trip));

    }
}
