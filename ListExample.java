import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {

    public static void run() {
        ArrayList<Exhibit> exhibits = new ArrayList<>();

        // Қосу
        exhibits.add(new Exhibit(1, "Алтын адам", "Археология", "Зал А", 1970));
        exhibits.add(new Exhibit(2, "Домбыра", "Музыка", "Зал Б", 1850));
        exhibits.add(new Exhibit(3, "Ертедегі қылыш", "Қару", "Зал В", 1400));
        exhibits.add(new Exhibit(4, "Киіз үй макеті", "Этнография", "Зал Б", 1900));

        // Индекс бойынша алу
        System.out.println("Бірінші экспонат: " + exhibits.get(0));

        // Өзгерту
        exhibits.set(1, new Exhibit(2, "Қобыз", "Музыка", "Зал Б", 1800));

        System.out.println("Саны: " + exhibits.size());

        // 1) Кәдімгі for
        System.out.println("\nКәдімгі for:");
        for (int i = 0; i < exhibits.size(); i++) {
            System.out.println(exhibits.get(i));
        }

        // 2) For-each
        System.out.println("\nFor-each:");
        for (Exhibit e : exhibits) {
            System.out.println(e);
        }

        // 3) Iterator
        System.out.println("\nIterator:");
        Iterator<Exhibit> iterator = exhibits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Жою (индекс бойынша)
        exhibits.remove(2);
        System.out.println("\nЖоюдан кейін: " + exhibits);

        // Сұрыптау: жылы бойынша (Comparator + Collections.sort)
        Collections.sort(exhibits, Comparator.comparingInt(Exhibit::getYear));
        System.out.println("\nЖылы бойынша сұрыптау:");
        for (Exhibit e : exhibits) {
            System.out.println(e);
        }

        // Сұрыптау: атауы бойынша (List.sort)
        exhibits.sort(Comparator.comparing(Exhibit::getName));
        System.out.println("\nАтауы бойынша сұрыптау:");
        for (Exhibit e : exhibits) {
            System.out.println(e);
        }

        // Іздеу: атауы бойынша
        System.out.println("\nІздеу (Қобыз):");
        for (Exhibit e : exhibits) {
            if (e.getName().equals("Қобыз")) {
                System.out.println(e);
            }
        }

        // Сүзгілеу: санат бойынша
        System.out.println("\nСүзгі: Музыка санаты:");
        for (Exhibit e : exhibits) {
            if (e.getCategory().equals("Музыка")) {
                System.out.println(e);
            }
        }

        // Сүзгілеу: жыл аралығы бойынша
        System.out.println("\nСүзгі: 1800-1950 жылдар аралығы:");
        for (Exhibit e : exhibits) {
            if (e.getYear() >= 1800 && e.getYear() <= 1950) {
                System.out.println(e);
            }
        }

        // LinkedList: қаралған экспонаттар тарихы
        LinkedList<String> history = new LinkedList<>();
        history.add("Алтын адам");
        history.add("Қобыз");
        history.addFirst("Бірінші көрілген");
        history.addLast("Соңғы көрілген");

        System.out.println("\nLinkedList: " + history);
        System.out.println("Бірінші элемент: " + history.getFirst());

        history.removeFirst();
        System.out.println("Жоюдан кейін: " + history);
    }
}
