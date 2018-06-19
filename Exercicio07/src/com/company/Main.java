package com.company;

import java.util.Scanner;

public class Main {
    private static Integer saldo = 1500;

    public static void main(String[] args) {
        Integer p90 = 300;
        Integer miniuzi = 250;
        Integer ump = 500;
        Integer p250 = 150;
        Integer eagle = 700;
        Integer usp = 100;
        Integer ak47 = 1000;
        Integer m4a1s = 1250;
        Integer famas = 900;
        Boolean menu = true;

        while(menu == true){
            System.out.println("Irmãozinho --------- R$" + saldo + "\n" +
                    "###########GUNS############\n" +
                    "[1] Metralhadoras\n" +
                    "[2] Pistolas   \n" +
                    "[3] Rifles\n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opcao: ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("[1] P90 R$" + p90 + "\n" +
                            "[2] Mini Uzi R$" + miniuzi + "\n" +
                            "[3] UMP R$" + ump + "\n");
                    System.out.println("Escolha uma opcao: ");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            DebitoEmConta(p90);
                            break;
                        case 2:
                            DebitoEmConta(miniuzi);
                            break;
                        case 3:
                            DebitoEmConta(ump);
                            break;
                        default:
                            System.out.println("Numero inválido");
                    }
                    break;
                case 2:
                    System.out.println("[1] USP R$" + usp + "\n" +
                            "[2] p250 R$" + p250 + "\n" +
                            "[3] eagle R$" + eagle + "\n");
                    System.out.println("Escolha uma opcao: ");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            DebitoEmConta(usp);
                            break;
                        case 2:
                            DebitoEmConta(p250);
                            break;
                        case 3:
                            DebitoEmConta(eagle);
                            break;
                        default:
                            System.out.println("Numero inválido");
                    }
                    break;
                case 3:
                    System.out.println("[1] ak47 R$" + ak47 + "\n" +
                            "[2] M4A1-S R$" + m4a1s + "\n" +
                            "[3] FAMAS R$" + famas + "\n");
                    System.out.println("Escolha uma opcao: ");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            DebitoEmConta(ak47);
                            break;
                        case 2:
                            DebitoEmConta(m4a1s);
                            break;
                        case 3:
                            DebitoEmConta(famas);
                            break;
                        default:
                            System.out.println("Numero inválido");
                    }
                    break;
                default:
                    System.out.println("Numero inválido");
            }

            System.out.println("DESEJA CONTINUAR COMPRANDO?\n[1]SIM  [2]NAO");
            Integer opcao = scanner.nextInt();
            switch (opcao) {
                case 1:break;
                case 2: menu = false; break;
                default: System.out.println("Digite apenas 1 ou 2");
            }
        }
    }

     private static void DebitoEmConta(int PrecoArma){
        if(saldo - PrecoArma < 0)
            System.out.println("VOCÊ NÃO TEM DINHEIRO IRMÃOZINHO!");
        else
            saldo -= PrecoArma;
    }
}


