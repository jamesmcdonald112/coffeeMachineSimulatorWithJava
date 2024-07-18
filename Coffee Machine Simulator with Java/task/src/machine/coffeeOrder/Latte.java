package machine.coffeeOrder;

public class Latte extends Coffee{

    public Latte() {
        setWater(350);
        setMilk(75);
        setCoffeeBeans(20);
        setCost(7);
    }

    @Override
    public String getName() {
        return "Latte";
    }
}
