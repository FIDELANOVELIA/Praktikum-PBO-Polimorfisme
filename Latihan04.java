package Polimorfisme;

class Base {
    void f(Number n) {
        System.out.println("Base.f(Number) dipanggil");
    }
}

class Sub extends Base {
    void f(Integer i) { // overloading
        System.out.println("Sub.f(Integer) dipanggil");
    }
}

public class Latihan04 {
    public static void main(String[] args) {
        Base b = new Sub();
        b.f(10);
    }
}
