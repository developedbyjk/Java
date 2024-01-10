
class check {

    int a;
    String name;

    check() {
        System.out.println("This is a constructor");
    }

    check(int x, String y) {
        a = x;
        name = y;
        System.out.println("the num is" + a + "and the name is" + name);
    }

}

public class constover {
    public static void main(String[] args) {
        check c = new check(10, "sai");
        check d = new check();
    }
}
