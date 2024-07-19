package machine.coffeeMachine;

public class IngredientCalculator {

    /**
     * Calculates the total amount of water needed based on the number of cups.
     *
     * @param numberOfCups The number of cups needed
     * @return The amount of water as an int, representing ml
     */
    public static int calculateTotalWater(int numberOfCups) {
        return Ingredients.WATER_PER_CUP * numberOfCups;
    }

    /**
     * Calculates the total amount of milk needed based on the number of cups.
     *
     * @param numberOfCups The number of cups needed
     * @return The amount of milk as an int, representing ml
     */
    public static int calculateTotalMilk(int numberOfCups) {
        return Ingredients.MILK_PER_CUP * numberOfCups;
    }

    /**
     * Calculates the total amount of coffee beans needed based on the number of cups.
     *
     * @param numberOfCups The number of cups needed
     * @return The amount of coffee beans as an int, representing grams
     */
    public static int calculateTotalCoffeeBeans(int numberOfCups) {
        return Ingredients.COFFEE_BEANS_PER_CUP * numberOfCups;
    }

//    /**
//     * Calculates the total possible coffees that can be made.
//     * @param ingredientAvailability Ingredients available.
//     * @return The number of coffes that can be made
//     */
//    public static int calculateTotalCoffees(IngredientAvailability ingredientAvailability) {
//        // Get the individual ingredients available.
//        int water = ingredientAvailability.getWater();
//        int milk = ingredientAvailability.getMilk();
//        int coffeeBeans = ingredientAvailability.getCoffeeBeans();
//
//        // Keep track of the coffees
//        int coffeeCount = 0;
//
//        // A loop that breaks if we cannot make another coffee
//        while (CreateCoffee.isEnoughIngredients(water, milk, coffeeBeans)) {
//            water -= Ingredients.WATER_PER_CUP;
//            milk -= Ingredients.MILK_PER_CUP;
//            coffeeBeans -= Ingredients.COFFEE_BEANS_PER_CUP;
//            coffeeCount++;
//
//        }
//
//        // Return total coffees
//        return coffeeCount;
//    }

}
