import A;
import B;

package Lab1;
class A {
    int i; // default access
    protected int j; // protected allows access to subclasses

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int total;

    void sum() {
        total = i + j; // Now j is accessible directly
    }
}

class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
