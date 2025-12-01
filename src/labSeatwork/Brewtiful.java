public class Brewtiful {
    public static void main(String[] args) {
        // 1. Create the base coffee
        Coffee order = new BlackCoffee();

        // 2. Add Milk
        Milk milkCoffee = new Milk();
        milkCoffee.setCoffee(order);

        // 3. Add Caramel (wrapping the milk coffee)
        CaramelSyrup finalOrder = new CaramelSyrup();
        finalOrder.setCoffee(milkCoffee);

        // 4. Print result
        System.out.println("Description: " + finalOrder.getDescription());
        System.out.println("Total Cost: ₱ " + finalOrder.getCost());
    }
}