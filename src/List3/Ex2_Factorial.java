package List3;

/*2) Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o valor de E,
conforme a fórmula a seguir:
E = 1 + 1 / 1 ! + 1 / 2 ! + 1 / 3 ! + ... + 1 / N !
*/

import java.util.Scanner;

public class Ex2_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = scan.nextInt();
        int fatorial = 1;
        double e = 1.0;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
            e += 1.0 / fatorial;
        }
        System.out.printf("valor de E: %.2f", e);
    }
}