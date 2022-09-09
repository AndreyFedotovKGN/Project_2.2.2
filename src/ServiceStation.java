public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.Service();
        } else if (truck != null) {
            truck.Service();
        } else if (bicycle != null) {
            bicycle.Service();
            } System.out.println("Пост свободен");
    }
}





