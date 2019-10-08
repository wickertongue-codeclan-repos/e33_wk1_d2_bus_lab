import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.capacity > this.passengerCount()) {
            this.passengers.add(person);
        }
    }
    
//    Should use the below rather than the uncommented function
//    public void removePassenger(Person person) {
//        this.passengers.remove(person);
//    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUpPassenger(BusStop busStop) {
        Person person = busStop.removeFromQueue();
        this.passengers.add(person);
    }
}
