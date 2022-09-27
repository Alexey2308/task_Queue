package carusel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PersonTest{

    @DisplayName("Первое тестирование метода.")
    public boolean minusTicket() {
        int numberOfTickets = 0;
        if ((numberOfTickets--) == 0) {
            return false;
        }
        return true;
    }

    @Test
    public void minusTicketTest() {
        Assertions.assertFalse(minusTicket());

    }

    @Test
    public void minusTicketTestTrue() {
        Assertions.assertTrue(minusTicket());
    }

    @DisplayName("Второе тестирование метода.")
    public boolean minusTicket1() {

        int numberOfTickets1 = 1;
        if ((numberOfTickets1--) == 0) {
            return false;
        }
        return true;
    }
    @Test
    public void minusTicketTest1() {
        Assertions.assertFalse(minusTicket1());

    }

    @Test
    public void minusTicketTest1True() {
        Assertions.assertTrue(minusTicket1());
    }

    @DisplayName("Третье тестирование метода.")
    public boolean minusTicket2() {
        int numberOfTickets = -1;
        if ((numberOfTickets--) == 0) {
            return false;
        }
        return true;
    }

    @Test
    public void minusTicketTest2() {
        Assertions.assertFalse(minusTicket2());

    }

    @Test
    public void minusTicketTestTrue2() {
        Assertions.assertTrue(minusTicket2());
    }

}
