package Zadanie1;

import java.util.HashMap;
import java.util.Scanner;


public class Zad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię i nazwisko");
        String dane = sc.nextLine();

        char[] tablicaDane = dane.toLowerCase().toCharArray();
        char[] tablicaBezPolskichZnakow = konwerterZnakowPolskich(tablicaDane);

        HashMap<Character, Integer> alfabet = new HashMap<>();
        alfabet.put(' ', 0);
        alfabet.put('a', 1);
        alfabet.put('b', 2);
        alfabet.put('c', 3);
        alfabet.put('d', 4);
        alfabet.put('e', 5);
        alfabet.put('f', 6);
        alfabet.put('g', 7);
        alfabet.put('h', 8);
        alfabet.put('i', 9);
        alfabet.put('j', 10);
        alfabet.put('k', 11);
        alfabet.put('l', 12);
        alfabet.put('m', 13);
        alfabet.put('n', 14);
        alfabet.put('o', 15);
        alfabet.put('p', 16);
        alfabet.put('q', 17);
        alfabet.put('r', 18);
        alfabet.put('s', 19);
        alfabet.put('t', 20);
        alfabet.put('u', 21);
        alfabet.put('v', 22);
        alfabet.put('w', 23);
        alfabet.put('x', 24);
        alfabet.put('y', 25);
        alfabet.put('z', 26);

        int suma = 0;
        for (int i = 0; i < tablicaBezPolskichZnakow.length; i++) {
            suma += alfabet.get(tablicaBezPolskichZnakow[i]);
        }

        System.out.println("Suma dla podanego imienia i nazwiska: " + suma + ", modulo 2 wynosi: " + suma%2);

    }

    public static char[] konwerterZnakowPolskich(char[] tablicaDane) {
        for (int i = 0; i < tablicaDane.length; i++) {
            if (tablicaDane[i] == 'ą')
                tablicaDane[i] = 'a';
            else if (tablicaDane[i] == 'ć')
                tablicaDane[i] = 'c';
            else if (tablicaDane[i] == 'ę')
                tablicaDane[i] = 'e';
            else if (tablicaDane[i] == 'ł')
                tablicaDane[i] = 'l';
            else if (tablicaDane[i] == 'ń')
                tablicaDane[i] = 'n';
            else if (tablicaDane[i] == 'ó')
                tablicaDane[i] = 'o';
            else if (tablicaDane[i] == 'ś')
                tablicaDane[i] = 's';
            else if (tablicaDane[i] == 'ż')
                tablicaDane[i] = 'z';
            else if (tablicaDane[i] == 'ź')
                tablicaDane[i] = 'z';
        }
        return tablicaDane;
    }
}
