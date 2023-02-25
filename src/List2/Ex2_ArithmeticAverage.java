package List2;

/*2) Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a
 mensagem constante na tabela do pdf list 2. Aos alunos que ficaram para exame, calcule e mostre a
 nota que deverão tirar para serem aprovados, considerando que a média exigida é 6,0.*/

import java.util.Scanner;
import java.text.*;

public class Ex2_ArithmeticAverage {
    public static void main(String[] args) {
        float media, mediaExam, nota1, nota2, nota3;
        Scanner dado = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");

        System.out.print("Informe a primeira nota: ");
        nota1 = dado.nextFloat();
        System.out.print("Informe a segunda nota: ");
        nota2 = dado.nextFloat();
        System.out.print("Informe a terceira nota: ");
        nota3 = dado.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;

        if (media <= 3) {
            System.out.println("Reprovado");
        } else if (media <= 7) {
            mediaExam = 12 - media;
            System.out.println("Exame");
            System.out.println("Para ser aprovado deve tirar: " + casas.format(mediaExam));
        } else {
            System.out.println("Aprovado");
        }
    }
}