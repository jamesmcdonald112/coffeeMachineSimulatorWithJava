package machine.coffeeOrder;

public class Espresso extends Coffee{

    public Espresso() {
        setWater(250);
        setMilk(0);
        setCoffeeBeans(16);
        setCost(4);
    }

    @Override
    public String getName() {
        return "Espresso";
    }
}
