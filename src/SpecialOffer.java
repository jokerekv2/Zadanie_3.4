public class SpecialOffer {
    Product specialProduct;
    String offer;
    String time;
    double discount;
    double priceAfterDiscount;

    public SpecialOffer(Product specialProduct, String offer, String time, double discount) {
        this.specialProduct = specialProduct;
        this.offer = offer;
        this.time = time;
        this.discount = discount;
        this.priceAfterDiscount = afterDiscount();
    }

    public double afterDiscount() {
        return (1 - 0.2) * specialProduct.price;
    }

    @Override
    public String toString() {
        return "Name: " + specialProduct.name + ", normal price: " + specialProduct.price + ", price after discount: "
                + priceAfterDiscount + ", description: " + specialProduct.description + ", Offer: " + offer + ", " + time;
    }
}
