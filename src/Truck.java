public class Truck extends Car {
    private double loadWeight;
    final double acTruckModifier = 1.6;
    final double weightModifier = 0.005;


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
        if (isAc()) {
            return getTankCapacity() * 100 / (getAverageFuelConsumption() + acTruckModifier + loadWeight * weightModifier);
        } else
            return getTankCapacity() * 100 / (getAverageFuelConsumption() + loadWeight * weightModifier);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " waga ładunku: " + loadWeight + " kg";
    }
}