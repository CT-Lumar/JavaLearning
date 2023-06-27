package ch17_02;

interface Shape {
    double PI = 3.141596;
    double area();
}

class Rectangle implements Shape {
    protected double height, width;
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width;
    }
    
}

class Circle implements Shape {
    protected double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * PI;
    }
    
}

public class ch17_02 {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(2, 3);
        System.out.println(re.area());
    }
}
