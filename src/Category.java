public class Category {
    String name;
    String description;

    public Category() {}

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "(" + description + ")";
    }
}
