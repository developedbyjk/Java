class hi {
    int age;
    String name;

    hi() {
        System.out.println("name aur age bina thodi aayega!");
    }

    hi(int x, String y) {
        age = x;
        name = y;
    }

    void sayhi() {
        System.out.println("hi " + name + " your age is " + age);
    }
}

public class idname {
    public static void main(String[] args) {
        hi h = new hi(10, "sai");
        hi j = new hi();

    }
}
