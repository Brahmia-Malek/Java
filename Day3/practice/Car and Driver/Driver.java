public class Driver extends Car {
    public void drive() {
        if (getGas() >= 1) {
            System.out.println("You drive the car.");
           setGas(getGas()-1);
            Status();
        } else {
            System.out.println("Not enough getGas to drive.");
            Status();
        }
    }

    public void boost() {
        if (getGas() >= 3) {
            System.out.println("You use boosters.");
            setGas(getGas() -3);
            Status();
        } else {
            System.out.println("Not enough getGas to use boosters.");
            Status();
        }
    }

    public void refuel() {
        if (getGas() <= 8) {
            System.out.println("You refuel the car.");
            setGas(getGas() + 2);
            Status();
        } else {
            System.out.println("gas tank is full. Cannot refuel.");
            Status();
        }
    }
}
