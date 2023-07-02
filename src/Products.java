import java.util.List;
import java.util.stream.Collectors;

public class Products {
    String name;
    String color;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Products(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Products product1 = new Products("apple", "red", 20);
        Products product2 = new Products("orange", "orange", 25);
        Products product3 = new Products("avocado", "green", 35);

        List<Products> productsList = List.of(product1, product2, product3);
        List<Products> allProducts = productsList.stream().collect(Collectors.toList());
        List<Products> productsByColor = productsList.stream().filter(products -> products.getColor() == "red").collect(Collectors.toList());
        List<Products> productsByPrice = productsList.stream().filter(products -> products.getPrice() > 25).collect(Collectors.toList());
        System.out.println(allProducts);
        System.out.println(productsByColor);
        System.out.printf(productsByPrice.toString());
    }
}
