package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        contoh 3 kasus pemakaian if tiga kasus : wujud air
        int T;

        System.out.println("Contoh If Tiga Kasus");
        System.out.println("Suhu (der. C) = ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
