package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String resultado = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1]Sul\n" +
                              "[2]Norte\n" +
                              "[3]Leste\n" +
                              "[4]Oeste\n" +
                              "[5]Nordeste\n" +
                              "[6]Nordeste\n" +
                              "[7]Sudeste\n" +
                              "[8]Sudeste\n" +
                              "[9]Sudeste\n" +
                              "[10]Centro-Oeste\n" +
                              "[11]Noroeste\n" +
                              "Digite um código:");
        Integer sc = scanner.nextInt();
        resultado = LerCodigoProduto(sc);
        System.out.println(resultado);
    }

    public static String LerCodigoProduto(Integer codigoProduto){
        switch (codigoProduto){
            case 1: return "Sul";
            case 2: return "Norte";
            case 3: return "Leste";
            case 4: return "Oeste";
            case 5: return "Nordeste";
            case 6: return "Nordeste";
            case 7: return "Sudeste";
            case 8: return "Sudeste";
            case 9: return "Sudeste";
            case 10: return "Centro-Oeste";
            case 11: return "Noroeste";
            default: return "Você digitou um código inválido!";
        }
    }
}
