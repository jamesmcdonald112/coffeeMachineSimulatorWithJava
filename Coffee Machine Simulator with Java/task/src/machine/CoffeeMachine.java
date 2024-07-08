package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Prompt the user for the total cups of coffee
        int cupsOfCoffee = InputHandler.promptForCupsOfCoffee();

        // Creating an instance of ingredient totals has the logic to calculate the totals
        // required in the constructor
        IngredientTotals ingredientTotals = new IngredientTotals(cupsOfCoffee);

        // Output the requirements/ totals needed for that amount of coffee
        OutputHandler.printIngredientRequirements(ingredientTotals);
    }
}
