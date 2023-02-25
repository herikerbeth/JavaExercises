package List2;

/*3) Faça um programa que receba dois números e mostre o maior.*/

import java.util.Scanner;

public class Ex3_Greater {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int n1, n2;

        System.out.print("Informe o primeiro número: ");
        n1 = dado.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = dado.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
