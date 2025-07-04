package com.example.banco2;

public class Cuenta {
    private static double saldo = 0;

    public static double getSaldo() {
        return saldo;
    }

    public static void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public static boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}