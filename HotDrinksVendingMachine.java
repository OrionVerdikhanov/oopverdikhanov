import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> products;

    public HotDrinksVendingMachine() {
        products = new ArrayList<>();
    }

    public void addProduct(HotDrinkWithTemperature product) {
        products.add(product);
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}
