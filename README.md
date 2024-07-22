# Coffee Machine Project
## Overview
This project simulates a coffee machine that can perform various actions such as buying different types of coffee, 
filling ingredients, taking cash, and displaying the machine's current state. 
The main components of the project include handling user inputs, managing ingredient availability, 
processing coffee orders, and maintaining the machine's cash.

## Features

- Buy Coffee: Choose between espresso, latte, and cappuccino.
- Fill Ingredients: Add more water, milk, coffee beans, and disposable cups to the machine.
- Take Cash: Retrieve the cash accumulated in the machine.
- Display Remaining: Show the current amount of ingredients and cash in the machine.
- Exit: Exit the coffee machine menu.

## Project Structure

- machine.accounts
  - CoffeeMachineCash: Manages the cash in the coffee machine.

- machine.coffeeMachine
  - BuyAction: Handles the action of buying coffee.
  - CoffeeMachine: Represents the coffee machine with its ingredients and cash.
  - CoffeeMachineActions: Interface for defining actions on the coffee machine.
  - CoffeeMachineMenu: Manages the main menu and user interactions.
  - CreateCoffee: Contains the logic for making coffee.
  - FillAction: Handles the action of filling ingredients.
  - IngredientAvailability: Manages the availability of ingredients.
  - IngredientCalculator: Utility class for calculating ingredient requirements.
  - Ingredients: Defines constants for ingredient usage per cup of coffee.
  - Menu: Interface for running the menu.
  - TakeAction: Handles the action of taking cash from the machine.

- machine.coffeeOrder
  - Cappuccino: Represents a cappuccino coffee.
  - Coffee: Abstract class for different types of coffee.
  - CreateCoffeeOrder: Manages coffee orders.
  - Espresso: Represents an espresso coffee.
  - IngredientRequirements: Manages the requirements for ingredients based on the number of cups.
  - Latte: Represents a latte coffee.

- machine.io
  - InputHandler: Handles user input.
  - OutputHandler: Handles output to the user.

- machine.main
  - Runner: The main class to run the coffee machine program.

## Usage
- Run the Program: Execute the Runner class to start the coffee machine simulation.
- Choose an Action: Follow the on-screen prompts to choose actions such as buying coffee, filling ingredients, taking cash, or displaying the machine's state.
- Buy Coffee: Select the type of coffee you want to buy (espresso, latte, cappuccino).
- Fill Ingredients: Add more ingredients to the machine when prompted.
- Take Cash: Retrieve the accumulated cash from the machine.
- Exit: Exit the program by selecting the exit option.

## How to Run
- Compile the Java files.
- Run the Runner class.

```bash
javac -d bin src/machine/**/*.java
java -cp bin machine.main.Runner
```

## Conclusion
I focused on planning for this project, imagining it from the user's perspective each time. This helped me find suitable solutions to problems
that I would typically run into without planning as much.
