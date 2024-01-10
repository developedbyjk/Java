
class cal {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void multiply(int a) {
        System.out.println(a * a);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        cal c = new cal();
        c.sum(1, 2);
        c.multiply(2);
    }

}
