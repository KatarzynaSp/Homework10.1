class Car extends Vehicle {
    private boolean ac;
    final double acCarModifier = 0.8;

    public Car() {
    }

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean ac) {
        super(name, tankCapacity, averageFuelConsumption);
        this.ac = ac;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }


    @Override
    public double range() {
        if (ac) {
            return getTankCapacity() * 100 / (getAverageFuelConsumption() + acCarModifier);
        }
        return super.range();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " klimatyzacja: " + ac;
    }
}