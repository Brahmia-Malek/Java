class Bat extends Mammal {
    public Bat() {
        setEnergyLevel(300);
    }

    public void fly() {
        System.out.println("The sound of a bat taking off!");
        setEnergyLevel(getEnergyLevel() - 50);
    }

    public void eatHumans() {
        System.out.println("Bat is satisfied after eating humans!");
        setEnergyLevel(getEnergyLevel() + 25);
    }

    public void attackTown() {
        System.out.println("The sound of a town on fire!");
        setEnergyLevel(getEnergyLevel() - 100);
    }
}
