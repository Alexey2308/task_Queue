import java.util.*;


public class Main {

    public static List<Person> generateClients() {
        List<Person> atraction = new ArrayList<>();
        atraction.add(new Person("Владимир", "Смирнов", 10));
        atraction.add(new Person("Иосиф", "Сталин", 20));
        atraction.add(new Person("Владимир", "Ленин", 15));
        atraction.add(new Person("Максим", "Перепелица", 11));
        atraction.add(new Person("Геннадий", "Крокодил", 14));
        atraction.add(new Person("Лаврентий", "Берия", 17));
        atraction.add(new Person("Мимо", "Проходил", 19));
        return atraction;
    }

    public static void main(String[] args) {
        Queue <Person> queue = new LinkedList<>();
        for (int i = 0; i < generateClients().size(); i++) {
            queue.offer(generateClients().get(i));
        }
        while (!queue.isEmpty()) {
            Person client = (Person) queue.poll();
            System.out.println(client.getName() + " " + client.getSurname() + " " + "прокатился");
            if (client.minusTicket()) {
                queue.add(client);
            }
        }
    }
}

