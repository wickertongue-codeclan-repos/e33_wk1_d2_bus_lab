import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Wallyford", 6);
        person = new Person();
    }

    @Test
    public void busHasDestination() {
        assertEquals("Wallyford", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(6, bus.getCapacity());
    }

    @Test
    public void busPassengersStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannotAddPassengerWhenOverCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(6, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }


}
