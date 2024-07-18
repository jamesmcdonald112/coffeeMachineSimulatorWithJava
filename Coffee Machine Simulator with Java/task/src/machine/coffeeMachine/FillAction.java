package machine.coffeeMachine;

import machine.io.InputHandler;

public class FillAction implements CoffeeMachineActions{

    CoffeeMachine coffeeMachine;

    public FillAction(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        int water = waterPrompt();
        int milk = milkPrompt();
        int coffeeBeans = coffeeBeansPrompt();
        int cups = cupsPrompt();

        // Get the instance of ingredientAvailability
        IngredientAvailability ingredientAvailability = coffeeMachine.getIngredientAvailability();

        // Increase the amounts
        ingredientAvailability.increaseWater(water);
        ingredientAvailability.increaseMilk(milk);
        ingredientAvailability.increaseCoffeeBeans(coffeeBeans);
        ingredientAvailability.increaseCups(cups);

    }

    private int waterPrompt() {
        System.out.println("Write how many ml of water you want to add:");
        return InputHandler.userIntChoice();
    }

    private int milkPrompt() {
        System.out.println("Write how many ml of milk you want to add: ");
        return InputHandler.userIntChoice();
    }

    private int coffeeBeansPrompt() {
        System.out.println("Write how many grams of coffee beans you want to add: ");
        return InputHandler.userIntChoice();
    }

    private int cupsPrompt() {
        System.out.println("Write how many disposable cups you want to add: ");
        return InputHandler.userIntChoice();
    }
}
