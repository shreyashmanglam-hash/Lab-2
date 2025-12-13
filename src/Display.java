import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextInt();
        System.out.println("Enter breadth: ");
        breadth = sc.nextInt();
    }

    int area () {
    return length*breadth;
    }

    int perimeter() {
        return 2*(length+breadth);
    }

    void result () {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: "+ perimeter());
    }
    }


public class Display {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.read();
        r1.result();
    }
}
