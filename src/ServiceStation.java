public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.ServiceCar();
        } else if (truck != null) {
            truck.ServiceTruck();
        } else if (bicycle != null) {
            bicycle.ServiceBicycle();
            } System.out.println("Пост свободен");
    }
}





