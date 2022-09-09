public class Car extends Transport implements  ServiceTransport  {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void ServiceCar() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


}
