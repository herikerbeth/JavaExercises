package List1;

/* 1. Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.*/

import java.util.Scanner;

public class Ex1_SumOfNumbers {
    public static void main(String[] args) {
        float n1, n2, n3, n4, soma;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        n1 = input.nextFloat();
        System.out.print("Informe o segundo número: ");
        n2 = input.nextFloat();
        System.out.print("Informe o terceiro número: ");
        n3 = input.nextFloat();
        System.out.print("Informe o último número: ");
        n4 = input.nextFloat();
        soma = n1 + n2 + n3 + n4;
        System.out.println("A soma deles é: " + soma);
    }
}
