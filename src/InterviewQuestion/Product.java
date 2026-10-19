package InterviewQuestion;

public class Product {
    private String sku;
    private String title;
    private double price;
    private int quantity;

    private Product(ProductBuilder builder) {
        this.sku = builder.sku;
        this.title = builder.title;
        this.price = builder.price;
        this.quantity = builder.quantity;
    }


    static class ProductBuilder {

        private String sku;
        private String title;
        private double price;
        private int quantity;

        public static ProductBuilder builder() {
            return new ProductBuilder();
        }

        public ProductBuilder sku(String sku) {
            this.sku = sku;
            return this;
        }

        public ProductBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public String getSku() {
        return sku;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
