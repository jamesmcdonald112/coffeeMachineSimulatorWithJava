package machine;

public class OutputHandler {

    /**
     * Lists and prints the total ingredients required based on the number of coffees inputted.
     * @param ingredientTotals An instance off the amount of coffees required
     */
    public static void printIngredientRequirements(IngredientRequirements ingredientTotals) {
        int cups = ingredientTotals.getNumberOfCups();
        int water = ingredientTotals.getTotalWater();
        int milk = ingredientTotals.getTotalMilk();
        int beans = ingredientTotals.getTotalCoffeeBeans();
        System.out.println("For " + cups + " cups of coffee you will need:\n" +
                water + " ml of water\n" +
                milk+ " ml of milk\n" +
                beans+ " g of coffee beans");
    }
}
