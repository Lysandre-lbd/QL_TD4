package aggregat.domain;

import java.util.List;

public class Show {
    public final int maximumCapacity;
    public final boolean saleOpen;
    public final TicketInventory ticketInventory;

    public Show(int maximumCapacity, boolean saleOpen, TicketInventory ticketInventory) {
        this.maximumCapacity = maximumCapacity;
        this.saleOpen = saleOpen;
        this.ticketInventory = ticketInventory;
    }

    public boolean sellTickets(int number, String reservationName) {
        if (saleOpen){
            return ticketInventory.tryAddTickets(maximumCapacity, number, reservationName);
        }
        return false;
    }


    public List<String> retrieveTickets(String reservationName){
        return ticketInventory.retrieveTicketsByReservationName(reservationName);
    }


}
