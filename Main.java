public class Main {
    public static void main(String[] args) {
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Coffee", 250, 80);
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Tea", 200, 70);
        HotDrinkWithTemperature hotChocolate = new HotDrinkWithTemperature("Hot Chocolate", 300, 85);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.addProduct(coffee);
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(hotChocolate);

        HotDrinkWithTemperature requestedDrink = vendingMachine.getProduct("Tea", 200, 70);
        if (requestedDrink != null) {
            System.out.println("Dispensing: " + requestedDrink);
        } else {
            System.out.println("Product not found.");
        }
    }
}
