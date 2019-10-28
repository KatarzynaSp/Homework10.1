public class Test {
    public static void main(String[] args) {
        Car car = new Car("Audi A6", 63, 6.5, false);
        Truck truck = new Truck("Ciągnik siodłowy MAN TGX", 1400, 10, false, 200);

        System.out.println(car.getInfo());
        car.getRangeInfo(car);

        System.out.println(truck.getInfo());
        truck.getRangeInfo(truck);

        car.setAc(true);
        car.range();
        car.getRangeInfo(car);

        truck.setAc(true);
        truck.getRangeInfo(truck);
    }
}