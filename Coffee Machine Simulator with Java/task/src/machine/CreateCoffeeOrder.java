package machine;

public class CreateCoffeeOrder {
    // INSTANCE VARIABLES
    private IngredientAvailability ingredientAvailability;
    private IngredientRequirements ingredientRequirements;

    // CONSTRUCTOR
    public CreateCoffeeOrder(IngredientAvailability ingredientAvailability, IngredientRequirements ingredientRequirements) {
        this.ingredientAvailability = ingredientAvailability;
        this.ingredientRequirements = ingredientRequirements;
    }

    // GETTERS AND SETTERS

    public IngredientAvailability getIngredientAvailability() {
        return ingredientAvailability;
    }

    public void setIngredientAvailability(IngredientAvailability ingredientAvailability) {
        this.ingredientAvailability = ingredientAvailability;
    }

    public IngredientRequirements getIngredientRequirements() {
        return ingredientRequirements;
    }

    public void setIngredientRequirements(IngredientRequirements ingredientRequirements) {
        this.ingredientRequirements = ingredientRequirements;
    }

    // PUBLIC METHODS
    public void coffeeOrderHandler() {

        // Get the total possible coffees and the ordered coffees and store as variables
        int totalPossibleCoffees = this.ingredientAvailability.getMaxCoffees();
        int orderedCoffees = this.ingredientRequirements.getNumberOfCups();

        // Get the difference
        int difference = Math.abs(orderedCoffees - totalPossibleCoffees);

        // If there is enough ingredients
        if (isEnoughIngredientsForOrder(this.ingredientRequirements, this.ingredientAvailability)) {
            // TODO: Logic for removing the total amount of coffee form the ingredients available
            if (orderedCoffees == totalPossibleCoffees) {
                System.out.println("Yes, I can make that amount of coffee");
            } else if (orderedCoffees < totalPossibleCoffees) {
                System.out.println("Yes, I can make that amount of coffee (and even " + difference + " more " +
                        "than that)");
            }
            // If there is not enough ingredients
        } else {
            System.out.println("No, I can make only " + totalPossibleCoffees + " cup(s) of coffee");
        }

    }

    // PRIVATE METHODS

    /**
     * Makes sure there is enough ingredients by comparing possible cups of coffee that can be
     * made with the amount of cups required for the order.
     *
     * @param ingredientRequirements The ingredients required for the order
     * @param ingredientAvailability The ingredients available
     * @return True if there is enough ingredients for the order; false otherwise
     */
    private static boolean isEnoughIngredientsForOrder(IngredientRequirements ingredientRequirements,
                                                       IngredientAvailability ingredientAvailability) {
        int cupsRequired = ingredientRequirements.getNumberOfCups();
        int maxCupsAvailable = ingredientAvailability.getMaxCoffees();

        return cupsRequired <= maxCupsAvailable;
    }


}
