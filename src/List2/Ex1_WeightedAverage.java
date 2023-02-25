package List2;

/*1) Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue a tabela.*/

import java.util.Scanner;
import java.text.*;

public class Ex1_WeightedAverage {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float trabalho, avaliacao, exame, media;
        char conceito;

        System.out.print("Informe a nota do Trabalho de laboratório: ");
        trabalho = dado.nextFloat();
        System.out.print("Informe a nota da Avaliação semestral: ");
        avaliacao = dado.nextFloat();
        System.out.print("Informe a nota do Exame final: ");
        exame = dado.nextFloat();
        media = ((trabalho * 2) + (avaliacao * 3) + (exame * 5)) / 10;
        if (media <= 5) {
            conceito = 'E';
        } else if (media <= 6) {
            conceito = 'D';
        } else if (media <= 7) {
            conceito = 'C';
        } else if (media <= 8) {
            conceito = 'B';
        } else {
            conceito = 'A';
        }
        System.out.println("Média ponderada: " + casas.format(media) + "  Conceito: " + conceito);
    }
}
