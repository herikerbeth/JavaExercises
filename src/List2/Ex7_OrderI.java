package List2;

/*7) Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo,
 A, B e C são reais. Escreva os números A, B e C obedecendo à tabela do pdf List 2.
 Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e
 que os números digitados sejam
 diferentes um do outro.*/

import java.util.Scanner;

public class Ex7_OrderI {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        float a, b, c;
        int i;
        System.out.print("Informe o valor de A: ");
        a = dado.nextFloat();
        System.out.print("Informe o valor de B: ");
        b = dado.nextFloat();
        System.out.print("Informe o valor de C: ");
        c = dado.nextFloat();
        System.out.print("Informe o valor de I (1, 2 ou 3): ");
        i = dado.nextInt();

        if ( i == 1) { // A, B e C em Ordem Crescente
            if ((a < b) && (a < c)) {
                if (b < c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            } else if ((b < a) && (b < c)) {
                if (a < c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else {
                if (a < b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            }
        } else if ( i == 2) { // A, B e C em Ordem Decrescente
            if ((a > b) && (a > c)) {
                if (b > c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            } else if ((b > a) && (b > c)) {
                if (a > c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else {
                if (a > b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            }
        } else {              // O maior fica entre os números
            if ((a > b) && (a > c)) {
                System.out.println(b + ", " + a + ", " + c);
            } else if ((b > a) && (b > c)) {
                System.out.println(a + ", " + b + ", " + c);
            } else {
                System.out.println(a + ", " + c + ", " + b);
            }
        }
    }
}