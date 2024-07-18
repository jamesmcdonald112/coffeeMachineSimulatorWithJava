package machine.io;

import machine.accounts.CoffeeMachineCash;
import machine.coffeeMachine.CoffeeMachine;
import machine.coffeeMachine.IngredientAvailability;
import machine.coffeeOrder.IngredientRequirements;

public class OutputHandler {

    /**
     * Lists and prints the total ingredients required based on the number of coffees inputted.
     * @param ingredientRequirements An instance off the amount of coffees required
     */
    public static void printIngredientRequirements(IngredientRequirements ingredientRequirements) {
        int cups = ingredientRequirements.getNumberOfCups();
        int water = ingredientRequirements.getTotalWater();
        int milk = ingredientRequirements.getTotalMilk();
        int beans = ingredientRequirements.getTotalCoffeeBeans();
        System.out.println("For " + cups + " cups of coffee you will need:\n" +
                water + " ml of water\n" +
                milk+ " ml of milk\n" +
                beans+ " g of coffee beans");
    }

    /**
     * Lists and prints the total ingredients in the machine.
     * @param coffeeMachine An instance of the amount of Coffee Machine
     */
    public static void printCoffeeMachineState(CoffeeMachine coffeeMachine) {
        // Instance of Coffee Machine Cash Available and Ingredients available
        CoffeeMachineCash coffeeMachineCash = coffeeMachine.getCoffeeMachineCash();
        IngredientAvailability ingredientAvailability = coffeeMachine.getIngredientAvailability();

        // Get the available amount of each ingredient
        int water = ingredientAvailability.getWater();
        int milk = ingredientAvailability.getMilk();
        int beans = ingredientAvailability.getCoffeeBeans();
        int cups = ingredientAvailability.getDisposableCups();
        int cash = coffeeMachineCash.getCash();
        System.out.println("The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                beans + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + cash + " of money");
    }


}
