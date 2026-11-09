import java.util.Objects;

public class Exhibit {
    private int id;
    private String name;
    private String category;
    private String hall;
    private int year;

    public Exhibit(int id, String name, String category, String hall, int year) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID оң сан болуы керек: " + id);
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Атауы бос болмауы керек");
        }
        if (category == null || category.trim().isEmpty()) {
            throw new IllegalArgumentException("Санат бос болмауы керек");
        }
        if (hall == null || hall.trim().isEmpty()) {
            throw new IllegalArgumentException("Зал бос болмауы керек");
        }
        if (year < -5000 || year > 2026) {
            throw new IllegalArgumentException("Жыл дұрыс емес: " + year);
        }
        this.id = id;
        this.name = name;
        this.category = category;
        this.hall = hall;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getHall() {
        return hall;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + category + " | " + hall + " | " + year + " ж.";
    }

    // Екі экспонат ID бірдей болса, тең деп саналады
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Exhibit)) return false;

        Exhibit other = (Exhibit) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
