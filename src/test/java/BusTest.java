import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;

    @Before
    public void before(){
        bus = new Bus("Wallyford", 100);
    }

    @Test
    public void busHasDestination() {
        assertEquals("Wallyford", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(100, bus.getCapacity());
    }
}
