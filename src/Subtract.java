import java.util.Scanner;

class driver {
    int subtract1 (int a,int b) {
        return (a-b);
    }
    double subtract2(double a,double b) {
        return (a-b);
    }
    double subtract3(int a,double b) {
        return (a-b);
    }
    double subtract4(double a,int b) {
        return (a-b);
    }
    long subtract5(long a,int b) {
        return (a-b);
    }
    long subtract6(int a,long b) {
        return (a-b);
    }
}

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 (Int-Int) \n 2 (Dec-Dec)\n 3 (Int-Dec)\n 4 (Dec-Int)\n 5 (Long-Int)\n 6 (Int-Long) ");
        System.out.println("Enter option: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter number 1: ");
                int a = sc.nextInt();
                System.out.println("Enter number 2: ");
                int b = sc.nextInt();
                driver c1 = new driver();
                System.out.println(c1.subtract1(a,b));
                break;
            case 2:
                System.out.println("Enter number 1: ");
                double x = sc.nextDouble();
                System.out.println("Enter number 2: ");
                double y = sc.nextDouble();
                driver c2 = new driver();
                System.out.println(c2.subtract2(x,y));
                break;
            case 3:
                System.out.println("Enter number 1: ");
                int c = sc.nextInt();
                System.out.println("Enter number 2: ");
                double d = sc.nextDouble();
                driver c3 = new driver();
                System.out.println(c3.subtract2(c,d));
                break;
            case 4:
                System.out.println("Enter number 1: ");
                double e = sc.nextDouble();
                System.out.println("Enter number 2: ");
                int f = sc.nextInt();
                driver c4 = new driver();
                System.out.println(c4.subtract4(e,f));
                break;
            case 5:
                System.out.println("Enter number 1: ");
                long g = sc.nextLong();
                System.out.println("Enter number 2: ");
                int h = sc.nextInt();
                driver c5 = new driver();
                System.out.println(c5.subtract5(g,h));
                break;
            case 6:
                System.out.println("Enter number 1: ");
                int i = sc.nextInt();
                System.out.println("Enter number 2: ");
                long j = sc.nextLong();
                driver c6 = new driver();
                System.out.println(c6.subtract6(i,j));
                break;
        }


    }
}
