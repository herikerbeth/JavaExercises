package List2;

/*6) Faça um programa que receba um número inteiro e verifique se é par ou ímpar.*/

import java.util.Scanner;

public class Ex6_EvenOdd {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int numero;
        System.out.print("Informe um número: ");
        numero = dado.nextInt();
        String result = (numero % 2 == 0) ? " é par." : " é ímpar.";
        System.out.println("O número " + numero + result);
    }
}