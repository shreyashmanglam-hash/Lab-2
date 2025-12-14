import java.util.Scanner;
class rectangle  {
    int length,breadth;
    rectangle() {
        length =0;
        breadth=0; }
    rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int area() {
        return (length*breadth);
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length,breadth;
        System.out.println("Enter length: ");
        length = sc.nextInt();
        System.out.println("Enter breadth: ");
        breadth = sc.nextInt();
        rectangle r1 = new rectangle(length,breadth);
        System.out.println("Area: "+ r1.area());

    }
}