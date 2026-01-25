package Task7.Passenger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BusStop {
   public Queue<Passenger> waitingQueue = new LinkedList<>();

   public void addPassenger(Passenger passenger) {
       if (waitingQueue.size() < 10) {
           waitingQueue.add(passenger);
       }
   }

   public void boardPassenger(Bus bus) {
       Iterator<Passenger> iterator = waitingQueue.iterator();
       while (iterator.hasNext()) {
           Passenger passenger = iterator.next();
           if (passenger.isPriority){
               bus.board(passenger);
               iterator.remove();
           }
       }
       while (!waitingQueue.isEmpty() && waitingQueue.size() < bus.capacity) {
           Passenger passenger = waitingQueue.poll();
           bus.board(passenger);
       }

   }

   public void displayWaitingPassengers() {
       System.out.println("Stop remaining: " + waitingQueue);
   }
}
