package List2;

/*8) Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados
 necessários para executar cada operação.
 Menu de opções:
 1. Somar dois números.
 2. Raíz quadrada de um número.
 Digite a opção desejada:*/

import java.util.Scanner;
import java.text.*;

public class Ex8_Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int input;
        System.out.print("Menu de opções.\n1. Somar dois números.\n2. Raíz quadrada de um número.\nDigite a opção desejada: ");
        input = scan.nextInt();

        if(input == 1) {
            System.out.print("Informe o primeiro número: ");
            int n1 = scan.nextInt();
            System.out.print("Informe o segundo número: ");
            int n2 = scan.nextInt();
            int soma = n1 + n2;
            System.out.println("A soma dos númerso é " + soma );
        } else if(input == 2) {
            System.out.print("Informe o número: ");
            double numRoot = scan.nextDouble();
            double result = Math.sqrt(numRoot);
            System.out.println("A raíz quadrada de " + numRoot + " é: " + casas.format(result));
        } else {
            System.out.println("Erro! Informe umas das opções.");
        }
    }
}