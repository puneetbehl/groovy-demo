
@ToString
class Pizza {
	String name
	List<Topping> toppings
	double price

	//Method with name "plus" will override the "+" operator. It will return a new pizza with the Toppings added.
    Pizza plus(Topping topping) {
        new Pizza(name: name, toppings: toppings + [topping], price: price + topping.price)
    }
}

@ToString
class Topping {
	String name
	double price
}

// Aviablable Toppings 

Topping cheeseBurst = new Topping(name: "cheese Burst", price: 80)
Topping extraCheese = new Topping(name: "Extra Cheese", price: 40.43)
Topping jalepenos = new Topping(name: "Jallepenos", price: 50.33)
Topping capsicum = new Topping(name: "capsicum", price: 20.32)


// Let's order our pizza 
Pizza pizza = new Pizza(name: "Veg Extravaganza Pizza", price: 323.32, toppings: [])

// Add Toppings 
Pizza specialPizza = pizza + cheeseBurst + extraCheese + jalepenos + capsicum

// Unbox Pizza
println (specialPizza)
//OUTPUT
/*
 
Pizza(Veg Extravaganza Pizza, [Topping(cheese Burst, 80.0), Topping(Extra Cheese, 40.43), Topping(Jallepenos, 50.33), Topping(capsicum, 20.32)], 514.4)
*/


// Isn’t it mouth watering.

