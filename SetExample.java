import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void run() {
        Set<Exhibit> exhibits = new HashSet<>();

        exhibits.add(new Exhibit(1, "Алтын адам", "Археология", "Зал А", 1970));
        exhibits.add(new Exhibit(2, "Қобыз", "Музыка", "Зал Б", 1800));
        // ID = 1 қайта қосылады: equals()/hashCode() бойынша дубликат, қосылмайды
        exhibits.add(new Exhibit(1, "Басқа экспонат", "Қару", "Зал В", 1400));

        System.out.println("Экспонаттар: " + exhibits);
        System.out.println("Саны: " + exhibits.size());

        // contains(): тек ID салыстырылады, атауы маңызды емес
        boolean exists = exhibits.contains(
                new Exhibit(1, "Кез келген атау", "Кез келген", "Зал Г", 2000)
        );
        System.out.println("ID 1 бар ма: " + exists);

        exhibits.remove(new Exhibit(2, "Қобыз", "Музыка", "Зал Б", 1800));
        System.out.println("Жоюдан кейін: " + exhibits);

        System.out.println("\nБарлық экспонаттар:");
        for (Exhibit e : exhibits) {
            System.out.println(e);
        }

        // Бірегей санаттар
        Set<String> categories = new HashSet<>();
        categories.add("Археология");
        categories.add("Музыка");
        categories.add("Археология"); // қайталанады, қосылмайды

        System.out.println("\nСанаттар: " + categories);
        System.out.println("Санат бар ма (Музыка): " + categories.contains("Музыка"));
        categories.remove("Музыка");
        System.out.println("Жоюдан кейін: " + categories);
    }
}
