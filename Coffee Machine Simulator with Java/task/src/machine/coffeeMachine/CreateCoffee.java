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

    }

    /**
     * Takes in the ingredients and compares with the minim values needed to make a cup of coffee.
     * @param water The amount of water available
     * @param milk The amount of milk available
     * @param coffeeBeans The amount of coffee beans available
     * @return True if the is enough ingredients to make a coffee; false otherwise
     */
    public static boolean isEnoughIngredients(int water, int milk, int coffeeBeans) {
        boolean enoughWater = water >= Ingredients.WATER_PER_CUP;
        boolean enoughMilk = milk >= Ingredients.MILK_PER_CUP;
        boolean enoughCoffeeBeans = coffeeBeans >= Ingredients.COFFEE_BEANS_PER_CUP;

        return enoughWater && enoughMilk && enoughCoffeeBeans;
    }


}
