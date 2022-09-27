package project.carusel;

public class Person {
    private String name;
    private String surname;
    private int numberOfTickets;

    public <T> Person(String name, String surname, int numberOfTickets) {
        this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;
    }

    public boolean minusTicket() {
        if ((numberOfTickets--) <= 0) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
