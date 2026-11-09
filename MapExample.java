import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void run() {
        Map<Integer, Exhibit> exhibits = new HashMap<>();

        exhibits.put(1, new Exhibit(1, "Алтын адам", "Археология", "Зал А", 1970));
        exhibits.put(2, new Exhibit(2, "Қобыз", "Музыка", "Зал Б", 1800));

        System.out.println("Экспонат №1: " + exhibits.get(1));
        System.out.println("2 кілті бар ма: " + exhibits.containsKey(2));

        // Бар кілтті қайта қосу: мәні жаңарады
        exhibits.put(1, new Exhibit(1, "Жаңа Алтын адам", "Археология", "Зал А", 1971));
        System.out.println("Өзгергеннен кейін: " + exhibits.get(1));

        exhibits.remove(2);

        System.out.println("\nБарлық экспонаттар:");
        for (Map.Entry<Integer, Exhibit> entry : exhibits.entrySet()) {
            System.out.println("Кілт: " + entry.getKey()
                    + ", Мәні: " + entry.getValue());
        }

        System.out.println("Жазбалар саны: " + exhibits.size());

        // Залдар бойынша экспонаттар тізімі: Map<String, List<Exhibit>>
        Map<String, java.util.List<Exhibit>> byHall = new HashMap<>();
        Exhibit a = new Exhibit(3, "Домбыра", "Музыка", "Зал Б", 1850);
        Exhibit b = new Exhibit(4, "Киіз үй макеті", "Этнография", "Зал Б", 1900);
        byHall.computeIfAbsent(a.getHall(), k -> new java.util.ArrayList<>()).add(a);
        byHall.computeIfAbsent(b.getHall(), k -> new java.util.ArrayList<>()).add(b);

        System.out.println("\nЗалдар бойынша:");
        for (Map.Entry<String, java.util.List<Exhibit>> entry : byHall.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
