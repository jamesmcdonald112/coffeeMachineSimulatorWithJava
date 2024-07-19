package machine.coffeeMachine;

public class IngredientAvailability {
    // INSTANCE VARIABLES
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int maxCoffees;

    // CONSTRUCTOR
    public IngredientAvailability(int water, int milk, int coffeeBeans, int disposableCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
//        this.maxCoffees = IngredientCalculator.calculateTotalCoffees(this);
    }

    // GETTER AND SETTERS
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMaxCoffees() {
        return maxCoffees;
    }

    public void setMaxCoffees(int maxCoffees) {
        this.maxCoffees = maxCoffees;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public void increaseWater(int water) {
        this.water += water;
    }

    public void increaseMilk(int milk) {
        this.milk += milk;
    }

    public void increaseCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void increaseCups(int disposableCups) {
        this.disposableCups += disposableCups;
    }
}
