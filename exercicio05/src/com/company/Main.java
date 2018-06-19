package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Double valor = sc.nextDouble();
        VerificaPositivoNegativo(valor);
    }

    private static void VerificaPositivoNegativo(Double valor){
        if(valor >= 0)
            System.out.println("Numero positivo!");
        else
            System.out.println("Numero negativo");
    }
}
