package Ss6.Ke_Thua.Cirle_cylinder;

public class circle {
    private double radius = 1.0;
    private String color = "red";

    public circle() {
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * 2;
    }

    public double getPerimeter() {
        return 2 * radius * radius;
    }

    @Override
    public String toString() {
        return "Hinh co ban kinh = " + this.radius + " va co mau la " + this.color;
    }
}


