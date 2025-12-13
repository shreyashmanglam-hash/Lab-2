class prog {
    int age;
    static int count=0;
      prog (int age) {
         this.age = age;
         count++; }
}

public class Age {
    public static void main(String[] args) {
        prog s1 = new prog(17);
        prog s2 = new prog(19);
        prog s3 = new prog(22);
        System.out.println("No of objects created is: " + prog.count);
    }
}
