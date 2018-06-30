package Zadanie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {


    public static void main(String[] args) throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wartość a");
        int a = sc.nextInt();

        System.out.println("Podaj wartość b");
        int b = sc.nextInt();

        Prosta prosta = new Prosta(a, b);
        System.out.println(prosta);

        miejsceZerowe(prosta);

        System.out.println("Podaj wartosc x");
        int x = sc.nextInt();

        wartoscYwX(prosta, x);

        prostaProstopadlaWMiejscuZerowym(prosta);

    }


    public static void miejsceZerowe(Prosta prosta) {
        int a = prosta.getA();
        int b = prosta.getB();
        double zero = -b / a;
        System.out.println("Miejsce zerowe funkcji to: " + zero);
    }

    public static void wartoscYwX(Prosta prosta, int x) {
        int a = prosta.getA();
        int b = prosta.getB();
        int y = a * x + b;
        System.out.println("Wartość y w punkcie x = " + x + " wynosi: " + y);
    }

    public static void prostaProstopadlaWMiejscuZerowym(Prosta prosta) {
        int a = prosta.getA();
        int b = prosta.getB();
        double w = b / (a * a);
        System.out.println("Prosta prostopadła przechodzaca przez ten sam punkt zerowy to: y = - 1/"
                + a + " - " + w);
    }
}
