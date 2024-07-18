package machine.coffeeOrder;

public class Cappuccino extends Coffee{

    public Cappuccino() {
        setWater(200);
        setMilk(100);
        setCoffeeBeans(12);
        setCost(6);
    }

    @Override
    public String getName() {
        return "Cappuccino";
    }
}
