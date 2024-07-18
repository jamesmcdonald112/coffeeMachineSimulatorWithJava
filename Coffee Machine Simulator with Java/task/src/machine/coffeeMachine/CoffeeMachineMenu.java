package machine.coffeeMachine;

import machine.io.InputHandler;

public class CoffeeMachineMenu implements Menu{
    private CoffeeMachine coffeeMachine;

    public CoffeeMachineMenu(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        // Set loop to get user choice
        boolean running = true;
        while (running) {
            // Display directions for the user in the console
            menuMessage();
            String userChoice = InputHandler.userStringChoice();

            // Make sure it matches an option
            switch (userChoice) {
                case "buy" -> {
                    new BuyAction(coffeeMachine).execute();
                    running = false;
                }
                case "fill" -> {
                    new FillAction(coffeeMachine).execute();
                    running = false;
                }
                case "take" -> {
                    new TakeAction(coffeeMachine).execute();
                    running = false;
                }
                default -> System.out.println("Please pick from one of the options in the list");
            }
        }



    }

    /**
     * Prints a directions for the user in the console
     */
    private void menuMessage() {
        System.out.println("Write action (buy, fill, take): ");
    }


}
