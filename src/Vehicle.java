class Vehicle {
    private String name;
    private double tankCapacity;
    private double averageFuelConsumption;

    public Vehicle() {
    }

    public Vehicle(String name, double tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public double range() {
        return tankCapacity * 100 / averageFuelConsumption;
    }

    public String getInfo() {
        return "Nazwa pojazdu: " + getName() + ", pojemność silnika: " + getTankCapacity() + " l"
                + ", średnie spalanie: " + averageFuelConsumption + " l/100 km ";
    }

    public void getRangeInfo() {
        System.out.printf("%s %.3f\n", "Zasięg pojazdu: ", range());
    }
}