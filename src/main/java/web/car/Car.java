package web.car;

public class Car {
    private String model;
    private String color;
    private String num;

    public Car(String model, String color, String num) {
        this.model = model;
        this.color = color;
        this.num = num;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getNum() {
        return num;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
