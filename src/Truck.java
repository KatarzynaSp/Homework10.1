class Truck extends Car {
    private double loadWeight;
    final double acTruckModifier = 1.6;
    final double weightModifier = 0.005;

    public Truck() {
    }

    public Truck(String name, double tankCapacity, double averageFuelConsumption, boolean ac, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, ac);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double range() {
        double modifier = getAverageFuelConsumption() + loadWeight * weightModifier;
        if (isAc()) {
            return getTankCapacity() * 100 / (modifier + acTruckModifier);
        } else return getTankCapacity() * 100 / modifier;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " waga ładunku: " + loadWeight + " kg";
    }
}