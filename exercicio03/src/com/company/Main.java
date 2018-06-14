package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        Integer numero = sc.nextInt();
        parouimpar(numero);
    }

    private static void parouimpar(Integer numero){
        switch (numero%2){
            case 0: System.out.print("o Numero é par!"); break;
            default: System.out.print("O numero é impar!"); break;
        }
    }

}
