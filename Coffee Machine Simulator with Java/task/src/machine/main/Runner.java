package machine.main;

import machine.accounts.CoffeeMachineCash;
import machine.coffeeMachine.CoffeeMachine;
import machine.coffeeMachine.IngredientAvailability;
import machine.io.OutputHandler;

public class Runner {
    public static void main(String[] args) {
        // Get the quantities of milk, water, and coffee available.
        int water = 400; //ml
        int milk = 540; //ml
        int coffeeBeans = 120; // grams
        int disposableCups = 9; // cups
        int money = 550; // dollars

        // Create an instance of Ingredients available to store the quantity of ingredients.
        IngredientAvailability ingredientAvailability = new IngredientAvailability(water, milk,
                coffeeBeans, disposableCups);

        // Create an instance of cash available in the machine
        CoffeeMachineCash coffeeMachineCash = new CoffeeMachineCash(money);

        // Create an instance of the coffee machine and pass the amount of cash and ingredients
        // available
        CoffeeMachine coffeeMachine = new CoffeeMachine(ingredientAvailability, coffeeMachineCash);
        coffeeMachine.CoffeeMachineHandler();

        OutputHandler.printCoffeeMachineState(coffeeMachine);






//        // Prompt the user for the total cups of coffee
//        int cupsOfCoffee = InputHandler.promptForCupsOfCoffee();
//
//        // Creating an instance of ingredient totals has the logic to calculate the totals
//        // required in the constructor
//        IngredientRequirements ingredientRequirements = new IngredientRequirements(cupsOfCoffee);
//
//        // Notify the user if they have enough ingredients to make the desired quantity of coffee
//        // or not
//        CreateCoffeeOrder createCoffeeOrder = new CreateCoffeeOrder(ingredientAvailability,
//                ingredientRequirements);
//        createCoffeeOrder.coffeeOrderHandler();
    }
}
