import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Portobello High Street");
        person = new Person();
    }

    @Test
    public void hasName(){
        assertEquals("Portobello High Street", busStop.getName());
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(1, busStop.queueCount());
    }



}
