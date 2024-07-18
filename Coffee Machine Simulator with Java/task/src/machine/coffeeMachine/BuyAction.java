package machine.coffeeMachine;

import machine.coffeeOrder.Cappuccino;
import machine.coffeeOrder.Coffee;
import machine.coffeeOrder.Espresso;
import machine.coffeeOrder.Latte;
import machine.io.InputHandler;

public class BuyAction implements CoffeeMachineActions{

    private CoffeeMachine coffeeMachine;

    public BuyAction(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        // Displays the buy options to the user
        printBuyOptions();

        // Get user Choice
        boolean running = true;
        while (running) {
            int userChoice = InputHandler.userIntChoice();
            switch (userChoice) {
                case 1 -> {
                    Coffee espresso = new Espresso();
                    // Get instances of the ingredients and cash available and pass them along
                    // with the espresso to it
                    CreateCoffee.makeCoffee(coffeeMachine.getIngredientAvailability(),
                            coffeeMachine.getCoffeeMachineCash(), espresso);
                    running = false;
                }
                case 2 -> {
                    Coffee latte = new Latte();
                    CreateCoffee.makeCoffee(coffeeMachine.getIngredientAvailability(),
                            coffeeMachine.getCoffeeMachineCash(), latte);
                    running = false;
                }
                case 3 -> {
                    Coffee cappuccino = new Cappuccino();
                    CreateCoffee.makeCoffee(coffeeMachine.getIngredientAvailability(),
                            coffeeMachine.getCoffeeMachineCash(), cappuccino);
                    running = false;
                }
                default -> {
                    System.out.println("Please choose a number between 1-3");
                    running = false;
                }
            }
        }
    }

    private void printBuyOptions() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
    }

}
