public class Main {
    public static void main(String[] args) {
        Product product = new Product("Mentos", 6 ,"mint", new Category("Sweets", "candy"));
        Product product1 = new Product("Lolly", 3 ,"colorful", new Category("Sweets", "candy"));
        Product product2 = new Product("Pen", 20 ,"black", new Category("Stationery", "writing"));
        Product product3 = new Product("Pencil", 10 ,"black");

        SpecialOffer specialOffer = new SpecialOffer(new Product("Candy Bar", 8, "chocolate"), "for children under 10 years old",
                "8:00 - 20:00", 0.2);

        System.out.println("Product number 1: ");
        System.out.println(product.toString());
        System.out.println("Product number 2: ");
        System.out.println(product1.toString());
        System.out.println("Product number 3: ");
        System.out.println(product2.toString());
        System.out.println("Product number 4: ");
        System.out.println(product3.toString());
        System.out.println("Special Product: ");
        System.out.println(specialOffer.toString());

    }
}
