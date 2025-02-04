package machine.io;

import java.util.Scanner;

public class InputHandler {
    // INSTANCE VARIABLES
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Returns the users choice as a string
     * @return The users choice as a String
     */
    public static String userStringChoice() {
        String userChoice = SCANNER.nextLine();
        return userChoice;
    }

    public static int userIntChoice() {
        boolean running = true;
        int userChoice = -1;
        while (running) {
            String input = SCANNER.nextLine();
            try {
                userChoice =Integer.parseInt(input);
                running = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

        }
        return userChoice;
    }


    /**
     * Prompts the user to enter the total cups of coffee they require.
     * @return The total cups of coffee as an int
     */
    public static int promptForCupsOfCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = SCANNER.nextInt();
        return cupsOfCoffee;
    }


    /**
     * Prompts the user to enter the quantity of water available in ml.
     * @return The total available water as an int.
     */
    public static int promptForAvailableWater() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = SCANNER.nextInt();
        return water;
    }

    /**
     * Prompts the user to enter the quantity of milk available in ml.
     * @return The total available milk as an int.
     */
    public static int promptForAvailableMilk() {
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = SCANNER.nextInt();
        return milk;
    }

    /**
     * Prompts the user to enter the quantity of coffee beans available in grams.
     * @return The total available coffee beans as an int.
     */
    public static int promptForAvailableCoffeeBeans() {
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = SCANNER.nextInt();
        return coffeeBeans;
    }

    /**
     * Prompts the user to enter desired action for the coffeeMachine.
     * @return The users choice as a string
     */
    public static String promptForCoffeeMachineAction() {
        System.out.println("Write action (buy, fill, take):");
        String userAction = SCANNER.nextLine();
        return userAction;
    }
}
