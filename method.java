class calc {
    int a;
    int b;

    calc(int x, int y) {
        a = x;
        b = y;
        System.out.println(a + b);
    }
}

public class method {
    public static void main(String[] args) {
        calc c = new calc(40, 20);

    }

}
