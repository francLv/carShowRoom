public class Car {
    public String model;
    public String color;
    public int cost;

    public Car(String model, String color, int cost) {
        this.model = model;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
