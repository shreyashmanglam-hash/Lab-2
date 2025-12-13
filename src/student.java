import java.util.Scanner;

class info {
    int roll;
    double cgpa;
    String name;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll number: ");
        roll = sc.nextInt();
        System.out.println("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println("Name: "+ name);
        System.out.println("Roll number: "+ roll);
        System.out.println("CGPA: "+ cgpa);
    }
}

public class student {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students: ");
        n = sc.nextInt();
        info[] students = new info[n];
        for (int i = 0; i < n; i++) {
            students[i] = new info();
            System.out.println("Enter for student " + (i + 1));
            students[i].read();
        }
        for (int j = 0; j < n; j++) {
            students[j].display();
            System.out.println();
        }
        double min = students[0].cgpa;
        String sname = students[0].name;
        for (int k = 1; k < n; k++) {
            if (students[k].cgpa < min) {
                min = students[k].cgpa;
                sname = students[k].name;
            }
        }
        System.out.println("Student with least CGPA: " + sname);
    }
}













