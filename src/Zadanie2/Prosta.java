package Zadanie2;

public class Prosta {

    private int a;
    private int b;

    public Prosta(int a, int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prosta: y = " + a + "x + " + b;
    }
}
