package hu.iit.uni.miskolc.model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class GasStationTest {
    private GasStation gasStation;
    @Before
    public void setUp(){
        gasStation= new GasStation(1,2);
    }
    @Test
    public void getStationPlace(){
        Assert.assertEquals(gasStation.getPlace(),1);
    }
    @Test
    public void getStationPrice(){
        Assert.assertEquals(gasStation.getFuelPrice(),2);
    }
    @Test
    public void getStationToString(){
        Assert.assertEquals(gasStation.toString(),"GasStation {place=1, fuelPrice=2} ");
    }
}
