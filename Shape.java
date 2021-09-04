// Java Basics 2 - Assignment 3
public interface Shape {
    public double calculateArea();

    public void display(); 

    public static void main(String[] args) {
        Triangle t = new Triangle(10, 4); // Triangle with height 10 and base 4
        Square s = new Square(5); // Square with side lengths 5
        Circle c = new Circle(4); // Circle with radius 4
        // Display all shapes' different area's
        t.display();
        s.display();
        c.display();
    }
}

class Square implements Shape {
    int length;

    public Square(int l){
        this.length = l;
    }

    @Override
    public double calculateArea() {
        return this.length * this.length;
    }

    @Override
    public void display() {
        System.out.println("Area of square: " + this.calculateArea());
    }
}

class Circle implements Shape {
    int radius;

    public Circle(int r){
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void display() {
        System.out.println("Area of circle: " + this.calculateArea());        
    }
}

class Triangle implements Shape {
    int height;
    int base;

    public Triangle(int h, int b){
        this.height = h;
        this.base = b;
    }

    @Override
    public double calculateArea() {
        return (this.height * this.base) / 2;
    }

    @Override
    public void display() {
        System.out.println("Area of triangle: " + this.calculateArea());        
    }
}
