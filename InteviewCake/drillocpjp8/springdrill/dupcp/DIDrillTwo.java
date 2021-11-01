package drillocpjp8.springdrill.dupcp;

public class DIDrillTwo {
    public static void main(String[] args) {
        Application application = new Application();
        application.setShape(new Triangle());
        application.setShape(new Circle());
    }
}

class Application {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void drawShape(){
        this.shape.draw();
    }
}

class Shape{
    void draw(){
        System.out.println("Shape");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Circle");
    }
}