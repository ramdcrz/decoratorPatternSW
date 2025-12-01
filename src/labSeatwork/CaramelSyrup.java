public class CaramelSyrup implements CoffeeDecorator {
    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup";
    }

    public double getCost() {
        return coffee.getCost() + 40.00;
    }
}