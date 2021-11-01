package drillocpjp8.springdrill;

public class DIDrill {
}

class Application {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        triangle.draw();
//        Circle circle = new Circle();
//        circle.draw();

//        Shape triangle = new Triangle();
////        triangle.draw();
//        Shape circle = new Circle();
////        circle.draw();
//        myDraw(triangle);
//        myDraw(circle);

        myDraw(new Triangle());
        myDraw(new Circle());

    }

    public static void myDraw(Shape shape){
        shape.draw();
    }
}

class Shape {
    void draw(){
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Circle");
    }
}

class Triangle extends Shape {
    void draw(){
        System.out.println("Triangle");
    }
}