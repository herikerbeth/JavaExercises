package List4;

/*1) Faça um programa que preencha um vetor com nove números inteiros,
calcule e mostre os números primos e suas respectivas posições. */

import java.util.Scanner;

public class Ex1_PrimeNumbers {
    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vetor = {3, 2, 9, 7, 8, 1, 13, 15, 19};
        int[] primos = new int[9];
        int[] posicoes = new int[9];
        int contadorPrimos = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                primos[contadorPrimos] = vetor[i];
                posicoes[contadorPrimos] = i;
                contadorPrimos++;
            }
        }
        System.out.println("Números primos encontrados: ");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println("Primo: " + primos[i] + " posições: " + posicoes[i]);
        }
    }
}
