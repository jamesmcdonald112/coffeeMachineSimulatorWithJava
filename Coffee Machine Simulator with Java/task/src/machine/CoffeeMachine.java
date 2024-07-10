package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Get the quantities of milk, water, and coffee available.
        int water = InputHandler.promptForAvailableWater();
        int milk = InputHandler.promptForAvailableMilk();
        int coffeeBeans = InputHandler.promptForAvailableCoffeeBeans();

        // Create an instance of Ingredients available to store the quantity of ingredients.
        IngredientAvailability ingredientAvailability = new IngredientAvailability(water, milk,
                coffeeBeans);

        // Prompt the user for the total cups of coffee
        int cupsOfCoffee = InputHandler.promptForCupsOfCoffee();

        // Creating an instance of ingredient totals has the logic to calculate the totals
        // required in the constructor
        IngredientRequirements ingredientRequirements = new IngredientRequirements(cupsOfCoffee);

        // Notify the user if they have enough ingredients to make the desired quantity of coffee
        // or not
        CreateCoffeeOrder createCoffeeOrder = new CreateCoffeeOrder(ingredientAvailability,
                ingredientRequirements);
        createCoffeeOrder.coffeeOrderHandler();
    }
}
