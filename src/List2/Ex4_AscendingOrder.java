package List2;

/*4) Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o
 usuário digitará três números diferentes.*/

import java.util.Scanner;

public class Ex4_AscendingOrder {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Informe o primeiro número: ");
        n1 = dado.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = dado.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = dado.nextInt();

        if ((n1 < n2) && (n1 < n3)) {
            if (n2 < n3) {
                System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println("Ordem crescente: " + n1 + ", " + n3 + ", " + n2);
            }
        }
        if ((n2 < n1) && (n2 < n3)) {
            if (n1 < n3) {
                System.out.println("Ordem crescente: " + n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println("Ordem crescente: " + n2 + ", " + n3 + ", " + n1);
            }
        }
        if ((n3 < n1) && (n3 < n2)) {
            if (n1 < n2) {
                System.out.println("Ordem crescente: " + n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println("Ordem crescente: " + n3 + ", " + n2 + ", " + n1);
            }
        }
    }
}