import java.util.ArrayList;
import java.util.List;

public class CoffeList implements Product {
    private List<Product> children;

    CoffeList() {
        children = new ArrayList<>();
    }

    public void addChild(Product child) {
        children.add(child);
    }

    public void removeChild(Product child) {
        children.remove(child);
    }

    public List<Product> getChildren() {
        return children;
    }

    public int getEntryPrice(Product product) {
        return product.getPrice();
    }

    // gets the total price of the list
    @Override
    public int getPrice() {
        int sum = 0;
        for (Product product : children) {
            sum += product.getPrice();
        }
        return sum;
    }
}
