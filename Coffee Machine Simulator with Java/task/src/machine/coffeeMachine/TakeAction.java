package machine.coffeeMachine;

public class TakeAction implements CoffeeMachineActions{
    CoffeeMachine coffeeMachine;

    public TakeAction(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void execute() {
        int cash = coffeeMachine.getCoffeeMachineCash().getCash();
        System.out.println("I gave you $" + cash);
        coffeeMachine.getCoffeeMachineCash().setCash(0);
    }
}
