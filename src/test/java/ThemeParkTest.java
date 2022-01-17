import attractions.Attraction;
import attractions.RollerCoaster;
import attractions.RollercoasterTest;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import stalls.*;
import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

public class ThemeParkTest {

    private ThemePark themePark;
    private ArrayList<Stall> stalls = new ArrayList<>();
    private ArrayList<Attraction> attractions = new ArrayList<>();
    private CandyflossStall candyFlossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private RollerCoaster rollerCoaster;

    @Before
    public void before() {
        candyFlossStall = new CandyflossStall("Berties", "Bertie", ParkingSpot.A1);
        rollerCoaster = new RollerCoaster("Big dipper", 4);
        stalls.add(candyFlossStall);
        attractions.add(rollerCoaster);
        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void testGetAllReviewed() {
        assertEquals(1, themePark.getAllReviewed().size());
    }
}