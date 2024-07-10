package machine;

public class CreateCoffee {

    /**
     * Using the available ingredients, the method subtracts the amount of ingredients used to
     * make one coffee
     * @param ingredientAvailability The ingredients available.
     */
    public static void makeCoffee(IngredientAvailability ingredientAvailability) {
        int water = ingredientAvailability.getWater();
        int milk = ingredientAvailability.getMilk();
        int coffeeBeans = ingredientAvailability.getCoffeeBeans();

        ingredientAvailability.setWater(water - Ingredients.WATER_PER_CUP);
        ingredientAvailability.setMilk(milk - Ingredients.MILK_PER_CUP);
        ingredientAvailability.setCoffeeBeans(coffeeBeans - Ingredients.COFFEE_BEANS_PER_CUP);

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
