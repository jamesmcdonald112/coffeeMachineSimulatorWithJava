package machine.coffeeMachine;

import machine.accounts.CoffeeMachineCash;
import machine.coffeeOrder.Coffee;

public class CreateCoffee {

    /**
     * Using the available ingredients, the method subtracts the amount of ingredients used to
     * make one coffee
     * @param ingredientAvailability The ingredients available.
     */
    public static void makeCoffee(IngredientAvailability ingredientAvailability,
                                  CoffeeMachineCash coffeeMachineCash,
                                  Coffee coffee) {
        if (isEnoughIngredients(ingredientAvailability, coffee)) {
            // Available Ingredients
            int availableWater = ingredientAvailability.getWater();
            int availableMilk = ingredientAvailability.getMilk();
            int availableCoffeeBeans = ingredientAvailability.getCoffeeBeans();
            int availableDisposableCups = ingredientAvailability.getDisposableCups();

            // Coffee machine cash
            int availableCoffeeMachineCash = coffeeMachineCash.getCash();

            // Required Ingredients
            int requiredWater = coffee.getWater();
            int requiredMilk = coffee.getMilk();
            int requiredCoffeeBeans = coffee.getCoffeeBeans();
            int cost = coffee.getCost();

            // Update the ingredients available and incase the money in the machine
            ingredientAvailability.setWater(availableWater - requiredWater);
            ingredientAvailability.setMilk(availableMilk - requiredMilk);
            ingredientAvailability.setCoffeeBeans(availableCoffeeBeans - requiredCoffeeBeans);
            ingredientAvailability.setDisposableCups(availableDisposableCups - 1);
            coffeeMachineCash.setCash(availableCoffeeMachineCash + cost);
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }


    }

    /**
     * Takes in the ingredients and compares with the minim values needed to make a cup of coffee.
     * @param ingredientAvailability The ingredients available
     * @param coffee The coffe to be made
     * @return True if the is enough ingredients to make a coffee; false otherwise
     */
    public static boolean isEnoughIngredients(IngredientAvailability ingredientAvailability,
                                              Coffee coffee) {
        // Available Ingredients
        int availableWater = ingredientAvailability.getWater();
        int availableMilk = ingredientAvailability.getMilk();
        int availableCoffeeBeans = ingredientAvailability.getCoffeeBeans();
        int availableCups = ingredientAvailability.getDisposableCups();

        // Required Ingredients
        int requiredWater = coffee.getWater();
        int requiredMilk = coffee.getMilk();
        int requiredCoffeeBeans = coffee.getCoffeeBeans();

        boolean enoughWater = availableWater >= requiredWater;
        boolean enoughMilk = availableMilk >= requiredMilk;
        boolean enoughCoffeeBeans = availableCoffeeBeans >= requiredCoffeeBeans;
        boolean enoughCups = availableCups >= 1;

        return enoughWater && enoughMilk && enoughCoffeeBeans && enoughCups;
    }


}
