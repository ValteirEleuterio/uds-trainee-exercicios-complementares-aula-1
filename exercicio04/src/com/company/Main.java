package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Float numero = sc.nextFloat();

        System.out.println(verificaInteiro(numero));
    }
    private static String verificaInteiro(Float numero){
        Float resultado =  numero % 1.0f;
        if (resultado == 0.0f)
            return "O numero é inteiro!";
        else
            return "O numero é decimal!";
    }
}
