public class Shop {
    public String name;
    public Car car1;
    public Car car2;
    public Car car3;


    public Shop(String name) {
        this.name = name;
    }

    public void addCars(Car car1, Car car2, Car car3) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;

    }

    public Car search(String model) {
        if (car1.model.equals(model)) return car1;
        if (car2.model.equals(model)) return car2;
        if (car3.model.equals(model)) return car3;
        return null;


    }

    public Car byCar(int money) {
        if(money >= car1.cost) return car1;
        if(money >= car2.cost) return car2;
        if(money >= car3.cost) return car3;
        return null;


    }
}
