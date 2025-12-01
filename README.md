# decoratorPatternSW
This is a requirement for Lab Seatwork in Software Engineering 1.

<h2>Customizing Coffee Orders</h2>

A popular coffee shop, "Brewtiful," wants a flexible way to calculate the cost and list the ingredients of customized coffee orders. Customers can choose a basic coffee type, and then add various toppings or flavor shots. The system must allow for any combination of additions.

<h3>Key Requirements</h3>
<ul>
  <li>Core Component: A basic coffee (e.g., Espresso, Black Coffee) with a base cost.</li>
  <li>Dynamic Enhancements: Additions like Milk, Sugar, Caramel Syrup, or Whipped Cream must be applied on top of the basic coffee.</li>
  <li>Combinability: Customers should be able to combine multiple additions (e.g., an Espresso with Milk and Caramel).</li>
  <li>Interface Consistency: All components (basic coffee and additions) should share a common interface so that additions can wrap other additions or the base coffee.</li>
</ul>

<h3>Implementation Structure (Coffee Shop)</h3>
1. The Component Interface
<ul>
  <li>This defines the common operations for both the basic item and the decorators.</li>
  <li>Interface: Coffee</li>
  <li>Operation: getDescription() (returns the ingredients) and getCost() (returns the price).</li>
</ul>

2. The Concrete Component
This is the original, basic object that will be decorated.
Class: BlackCoffee
Implementation:
getDescription(): returns "Black Coffee"
getCost(): returns  ₱ 100.00

3. The Decorator Abstraction
This ensures the decorator classes implement the Coffee interface and have a way to hold a reference to the Coffee object they are wrapping.
Abstract Class/Interface: CoffeeDecorator (implements Coffee)
Implementation: Holds a private Coffee object and has a constructor/setter to wrap it. The methods will typically call the wrapped object's method before adding its own enhancement.

4. The Concrete Decorators
These classes add specific features (cost and description) to the wrapped Coffee object.
Class: Milk (implements CoffeeDecorator)
Implementation:
getDescription(): returns wrappedCoffee.getDescription() + ", Milk"
getCost(): returns wrappedCoffee.getCost() +   ₱ 25.00
Class: CaramelSyrup (implements CoffeeDecorator)
Implementation:
getDescription(): returns wrappedCoffee.getDescription() + ", Caramel Syrup"
getCost(): returns wrappedCoffee.getCost() + ₱ 40.00

