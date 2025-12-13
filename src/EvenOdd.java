import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,odd=0,even=0;
        System.out.println("Enter 10 numbers: ");
        for (int i=0;i<10;i++) {
            num = sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
            }
        }


