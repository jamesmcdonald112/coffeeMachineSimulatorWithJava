package machine;

public class OutputHandler {

    public static void printIngredientRequirements(IngredientTotals ingredientTotals) {
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
