package List2;

/*5) Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto
 número que não siga essa regra. Mostre, em seguida, os quatro números em ordem decrescente.
 Suponha que o usuário digitará quatro números diferentes.*/

import java.util.Scanner;

public class Ex5_DescendingOrder {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("Informe três número em ordem crescente: ");
        System.out.print("");
        System.out.print("");
        n1 = dado.nextInt();
        n2 = dado.nextInt();
        n3 = dado.nextInt();
        System.out.println("Informe o quarto número (fora de ordem): ");
        n4 = dado.nextInt();

        if (n4 > n3) {
            System.out.println("Ordem decrescente: " + n4 + ", " + n3 + ", " + n2 + ", " + n1);
        } else if (n4 > n2) {
            System.out.println("Ordem decrescente: " + n3 + ", " + n4 + ", " + n2 + ", " + n1);
        } else if (n4 > n1){
            System.out.println("Ordem decrescente: " + n3 + ", " + n2 + ", " + n4 + ", " + n1);
        } else {
            System.out.println("Ordem decrescente: " + n3 + ", " + n2 + ", " + n1 + ", " + n4);
        }
    }
}
