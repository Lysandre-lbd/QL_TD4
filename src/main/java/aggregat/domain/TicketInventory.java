package aggregat.domain;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TicketInventory {
    public final List<Ticket> tickets = new ArrayList<>();

    public void addTickets(int number, String reservationName) {
        for (int i = 0; i < number; i++) {
            tickets.add(new Ticket(reservationName));
        }
    }

    public boolean tryAddTickets(int maximumCapacity,int numberToAdd, String reservationName){
        if(maximumCapacity >= tickets.size() + numberToAdd){
            addNewTicket(numberToAdd,reservationName);}
        return true;


    }

    private void addNewTicket(int numberToAdd, String reservationName){
        for (int i = 0; i < numberToAdd; i++){
            tickets.add(new Ticket(reservationName));
        }
    }

    public List<String> retrieveTicketsByReservationName(String  reservationName){
        return tickets.stream().filter(ticket->ticket.hasReservationName(reservationName)).map(Ticket::getId).toList();
    }

}
