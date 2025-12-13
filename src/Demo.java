import java.util.Scanner;

class Box {
    int length;
    int width;
    int height;
    Box(int length,int width,int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    int volume () {
        return length*width*height;
    }
}

public class Demo {
    public static void main(String[] args) {
        int length,width,height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextInt();
        System.out.println("Enter width: ");
        width = sc.nextInt();
        System.out.println("Enter height: ");
        height = sc.nextInt();

        Box b1 = new Box(length,width,height);
        System.out.println("Volume of your box is: "+ b1.volume());
    }
}










