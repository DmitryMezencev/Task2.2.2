package web.model;

public class Car {
    private String mark;
    private String color;
    private String engine;

    public Car(String mark, String color, String engine) {
        this.mark = mark;
        this.color = color;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
               "mark='" + mark + '\'' +
               ", color='" + color + '\'' +
               ", engine='" + engine + '\'' +
               '}';
    }
}
