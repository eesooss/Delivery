public class Product {

    private String name;
    private ProductCategory category;
    private double price;

    public Product(String name, ProductCategory category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    // Setters
    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductInfo() {
        return "Product: " + getName() + ", Category: " + getCategory() + ", Price: $" + getPrice();
    }
}
