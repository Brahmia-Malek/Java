class Mammal {
    private int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }
     public int getEnergyLevel() {
        return energyLevel;
    }


    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
}
