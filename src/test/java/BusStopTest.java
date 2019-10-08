import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Portobello High Street");
    }

    @Test
    public void hasName(){
        assertEquals("Portobello High Street", busStop.getName());
    }

}
