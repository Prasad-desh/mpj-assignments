// Assignment03.java
class Shapes {
    double length, breadth, radius;

    Shapes(double side) {
        length = breadth = side;
    }

    Shapes(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shapes(double radius, boolean isCircle) {
        this.radius = radius;
    }

    double area() {
        return length * breadth;
    }

    double area(double radius, boolean isCircle) {
        return 3.14 * radius * radius;
    }
}

class Hillstations {
    void famousfood() {
        System.out.println("Hillstation food varies by place.");
    }

    void famousfor() {
        System.out.println("Hillstations are famous for scenic beauty.");
    }
}

class Manali extends Hillstations {
    void famousfood() {
        System.out.println("Manali: Trout Fish");
    }
    void famousfor() {
        System.out.println("Manali: Snow-capped mountains and adventure sports");
    }
}

class Shimla extends Hillstations {
    void famousfood() {
        System.out.println("Shimla: Chana Madra");
    }
    void famousfor() {
        System.out.println("Shimla: Mall Road and colonial architecture");
    }
}

class Munnar extends Hillstations {
    void famousfood() {
        System.out.println("Munnar: Kerala Sadya");
    }
    void famousfor() {
        System.out.println("Munnar: Tea plantations and hills");
    }
}

public class Assignment03 {
    public static void main(String[] args) {
        // Shapes part
        Shapes square = new Shapes(5);
        Shapes rectangle = new Shapes(4, 6);
        Shapes circle = new Shapes(3, true);

        System.out.println("=== Shapes ===");
        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area(3, true));

        // Hillstations part
        Hillstations hs1 = new Hillstations();
        Hillstations hs2 = new Manali();
        Hillstations hs3 = new Shimla();
        Hillstations hs4 = new Munnar();

        System.out.println("\n=== Hillstations ===");
        System.out.println("Base class object:");
        hs1.famousfood();
        hs1.famousfor();

        System.out.println("\nChild class objects via parent reference:");
        hs2.famousfood();
        hs2.famousfor();
        hs3.famousfood();
        hs3.famousfor();
        hs4.famousfood();
        hs4.famousfor();
    }
}