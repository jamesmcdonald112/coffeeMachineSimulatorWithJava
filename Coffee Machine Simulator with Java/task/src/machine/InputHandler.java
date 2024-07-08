package machine;

import java.util.Scanner;

public class InputHandler {
    // INSTANCE VARIABLES
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Prompts the user to enter the total cups of coffee they require.
     * @return The total cups of coffee as an int
     */
    public static int promptForCupsOfCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = SCANNER.nextInt();
        return cupsOfCoffee;
    }
}
