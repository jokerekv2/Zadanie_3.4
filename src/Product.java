public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        if (category == null) {
            return "Name: " + name +
                    ", price: " + price +
                    ", description: " + description + "\n";
        } else
            return "Name: " + name +
                    ", price: " + price +
                    ", description: " + description +
                    ", category: " + category.toString() + "\n";
    }
}
