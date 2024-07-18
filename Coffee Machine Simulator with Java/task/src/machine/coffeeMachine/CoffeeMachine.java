package machine.coffeeMachine;

import machine.accounts.CoffeeMachineCash;
import machine.io.OutputHandler;

public class CoffeeMachine {
    //INSTANCE VARIABLES
    private IngredientAvailability ingredientAvailability;
    private CoffeeMachineCash coffeeMachineCash;

    public CoffeeMachine(IngredientAvailability ingredientAvailability, CoffeeMachineCash coffeeMachineCash) {
        this.ingredientAvailability = ingredientAvailability;
        this.coffeeMachineCash = coffeeMachineCash;
    }

    // GETTERS AND SETTERS

    public IngredientAvailability getIngredientAvailability() {
        return ingredientAvailability;
    }

    public void setIngredientAvailability(IngredientAvailability ingredientAvailability) {
        this.ingredientAvailability = ingredientAvailability;
    }

    public CoffeeMachineCash getCoffeeMachineCash() {
        return coffeeMachineCash;
    }

    public void setCoffeeMachineCash(CoffeeMachineCash coffeeMachineCash) {
        this.coffeeMachineCash = coffeeMachineCash;
    }

    // METHODS
    public void CoffeeMachineHandler() {
        // Print coffee machine state
        OutputHandler.printCoffeeMachineState(this);

        // Run Coffee Machine Menu
        CoffeeMachineMenu coffeeMachineMenu = new CoffeeMachineMenu(this);
        coffeeMachineMenu.run();


    }
}
