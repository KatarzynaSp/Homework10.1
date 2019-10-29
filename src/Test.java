public class Test {
    public static void main(String[] args) {

        Car[] cars = new Car[2];
        cars[0] = new Car("Audi A6", 63, 6.5, false);
        cars[1] = new Truck("Ciągnik siodłowy MAN TGX", 1400, 10, false, 200);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getInfo());
            cars[i].getRangeInfo();
            cars[i].setAc(true);
            cars[i].range();
            System.out.println(cars[i].getInfo());
            cars[i].getRangeInfo();
        }
    }
}