package OperacoesBancarias;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("************ MENU ************");
            System.out.println(" 1: Depositar");
            System.out.println(" 2: Sacar");
            System.out.println(" 3: Consultar Saldo");
            System.out.println(" 0: Encerrar");
            System.out.println("************  ~  ************\n");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Digite um valor maior que zero! \n");
                    } else {
                        saldo += deposito;
                        System.out.printf("Saldo atual: %.1f%n \n", saldo);
                    }
                    break;

                case 2:

                    System.out.println("Digite o valor que deseja sacar: ");
                    double saque = scanner.nextDouble();
                    if (saque < 0) {

                        System.out.println("Digite um valor maior que zero! \n");
                    } else {
                        if (saque > saldo) {
                            System.out.println("Saldo insuficiente!");
                            System.out.printf("Saldo atual: %.1f%n \n", saldo);

                        } else {
                            saldo -= saque;
                            System.out.printf("Saldo atual: %.1f%n \n", saldo);
                        }
                    }

                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n \n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}