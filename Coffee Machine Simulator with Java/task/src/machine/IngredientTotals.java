package machine;

public class IngredientTotals {
    // INSTANCE VARIABLES
    private int totalWater;
    private int totalMilk;
    private int totalCoffeeBeans;
    private int numberOfCups;

    // CONSTRUCTOR


    public IngredientTotals(int numberOfCups) {
        this.numberOfCups = numberOfCups;
        // Calculates and set all the totals for the instance variables above
        this.totalWater = IngredientCalculator.calculateTotalWater(numberOfCups);
        this.totalMilk = IngredientCalculator.calculateTotalMilk(numberOfCups);
        this.totalCoffeeBeans = IngredientCalculator.calculateTotalCoffeeBeans(numberOfCups);

    }

    // GETTERS AND SETTERS
    public int getTotalWater() {
        return totalWater;
    }

    public void setTotalWater(int totalWater) {
        this.totalWater = totalWater;
    }

    public int getTotalMilk() {
        return totalMilk;
    }

    public void setTotalMilk(int totalMilk) {
        this.totalMilk = totalMilk;
    }

    public int getTotalCoffeeBeans() {
        return totalCoffeeBeans;
    }

    public void setTotalCoffeeBeans(int totalCoffeeBeans) {
        this.totalCoffeeBeans = totalCoffeeBeans;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }
}
