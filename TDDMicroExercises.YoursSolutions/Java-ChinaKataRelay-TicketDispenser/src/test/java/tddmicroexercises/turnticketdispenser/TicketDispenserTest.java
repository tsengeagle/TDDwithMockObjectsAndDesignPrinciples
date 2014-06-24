package tddmicroexercises.turnticketdispenser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketDispenserTest {

    private TicketDispenser ticketDispenser;
    private TurnTicket dispensedTicket;

    @Before
    public void setUp() throws Exception {
        ticketDispenser = new TicketDispenser();
        dispensedTicket = ticketDispenser.getTurnTicket();
    }

    @Test
    //proposed name: nextTicketFromThisDispenser.
    public void a_new_ticket_must_have_the_turn_number_larger_than_a_dispensed_ticket() {

        TurnTicket newTicket = ticketDispenser.getTurnTicket();

        assertEquals("Next ticket must be current ticket + 1", dispensedTicket.getTurnNumber() + 1, newTicket.getTurnNumber());
    }

    @Test
    //proposed name: nextTicketFromNextDispenser.
    public void a_new_ticket_must_have_the_turn_number_larger_than_a_dispensed_ticket_from_another_dispenser() {

        TurnTicket newTicket = getTurnTicketFromAnotherDispenser();

        // Assert
        assertEquals("Next ticket from another dispenser must be current ticket + 1",  dispensedTicket.getTurnNumber() + 1, newTicket.getTurnNumber());
    }

    private TurnTicket getTurnTicketFromAnotherDispenser() {
        TicketDispenser anotherDispenser = new TicketDispenser();
        return anotherDispenser.getTurnTicket();
    }

    // TODO: after ticket 10 comes ticket 11

}
