public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        Car gas = new GasPoweredCar("Ford F150", 45, 6);
        runRace(gas);
        System.out.println();
        Car hybrid = new HybridCar("Kia Telluride", 87,22,6);
        runRace(hybrid);
        System.out.println();
        Car electric = new ElectricCar("Hummer",1000, 57);
        runRace(electric);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}