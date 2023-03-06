public class Main {

    public static void main(String[] args) {
        Product p1 = new Product("Ori-flame", ProductCategory.BEAUTY, 10);
        Product p2 = new Product("Reserved", ProductCategory.CLOTHING, 12.50);
        Product p3 = new Product("KFC", ProductCategory.FOOD, 0.99);
        Product p4 = new Product("LG", ProductCategory.ELECTRONICS, 1000);
        Product p5 = new Product("Under Armour", ProductCategory.SPORTS, 199);

        System.out.println(p1.getProductInfo());
        System.out.println(p2.getProductInfo());
        System.out.println(p3.getProductInfo());
        System.out.println(p4.getProductInfo());
        System.out.println(p5.getProductInfo());
    }
}
