class test1 {
    int age;
    String name;

    void ans(int a, String n) {
        age = a;
        name = n;
    }

    void sayhi() {
        System.out.println("hi " + name + " your age is " + age);
    }
}

public class thiseg {
    public static void main(String[] args) {
        test1 t = new test1();
        t.ans(10, "sai");
        t.sayhi();
    }

}
