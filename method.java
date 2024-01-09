class calc {
    int a;
    int b;

    int xyz(int x, int y) {
        a = x;
        b = y;
        return a + b;
    }
}

public class method {
    public static void main(String[] args) {
        calc c = new calc();
        System.out.println(c.xyz(3, 10));
        ;

    }

}
