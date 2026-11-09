public class Main {

    public static void main(String[] args) {
        System.out.println("=== LIST ===");
        ListExample.run();

        System.out.println("\n=== SET ===");
        SetExample.run();

        System.out.println("\n=== MAP ===");
        MapExample.run();

        // Қате деректерді тексеру
        System.out.println("\n=== ВАЛИДАЦИЯ ===");
        try {
            new Exhibit(-5, "", "Музыка", "Зал А", 1900);
        } catch (IllegalArgumentException ex) {
            System.out.println("Қате ұсталды: " + ex.getMessage());
        }
    }
}
